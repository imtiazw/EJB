package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.services.CounterBean;
import com.airline.services.CounterStatefulBean;

/**
 * Servlet implementation class ShowCounter
 */
@WebServlet("/ShowCounter")
public class ShowCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private CounterBean counterBean;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCounter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		CounterStatefulBean sbStateful = (CounterStatefulBean)request.getSession().getAttribute("sbStateful");
		out.print("the value of counter bean is : " + counterBean.getCounter());
		out.print("the value of counter bean is : " + sbStateful.getCounter());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
