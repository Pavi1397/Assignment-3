package com.deloitte.estore.application;

import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.estore.model.Person;
import com.deloitte.estore.service.PersonService;
import com.deloitte.estore.service.PersonServiceImpl;

@WebServlet("/signup")

public class SignUpController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  String userName=request.getParameter("spname");

	  String password=request.getParameter("sppwd");

	  Person person=new Person(userName,password);

	  PersonService ps=new PersonServiceImpl();

	  try {
		 

		if(ps.addPerson(person)) {
			
			HttpSession ssn=request.getSession();
			
			ssn.setAttribute("user",userName);
			response.sendRedirect("welcome.jsp");

		}
	
	} catch (Exception e) {

	

		e.printStackTrace();
	}
}
}

	



