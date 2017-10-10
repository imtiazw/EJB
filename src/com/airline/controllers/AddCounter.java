package com.airline.controllers;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.services.CounterBean;
import com.airline.services.CounterStatefulBean;

/**
 * Servlet implementation class AddCounter
 */
@WebServlet("/AddCounter")
public class AddCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private CounterBean counterBean;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCounter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// business logic should never be implemented in doGet method
		// this should be implemented in doPost method
		// in doGet only the views should be displayed
		counterBean.addCounter();
		CounterStatefulBean sbStateful = (CounterStatefulBean)request.getSession().getAttribute("sbStateful");
		sbStateful.addCounter();
		request.getSession().setAttribute("sbStateful", sbStateful);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
