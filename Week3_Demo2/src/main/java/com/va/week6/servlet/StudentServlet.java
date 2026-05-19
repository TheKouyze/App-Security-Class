package com.va.week6.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.va.week6.dao.StudentDao;
import com.va.week6.model.Student;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	private StudentDao stDao;

	public void init() {
		stDao = new StudentDao();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String age = request.getParameter("age");
		
		/*
		 * Draft the fields as the per the entity given..  if you have 5 attributes ..
		 * you must have 5 variable to handle the request from the client. 
		 */

		Student st = new Student();
		st.setFirstname(firstName);
		st.setLastname(lastName);
		st.setAge(age);
		//st.setSid(sid);
		
		
		

		try {
			stDao.registerStudent(st);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("StudentInfo.jsp");
	}

}
