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

		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String country = request.getParameter("country");
		String zipCode = request.getParameter("zipCode");
		String email = request.getParameter("email");
		String sex = request.getParameter("sex");
		String language = request.getParameter("language");
		String about = request.getParameter("about");

		if (userId == null || userId.length() < 5 || userId.length() > 12 ||
			password == null || password.length() < 7 || password.length() > 12 ||
			name == null || !name.matches("[A-Za-z ]+") ||
			country == null || country.equals("") ||
			zipCode == null || !zipCode.matches("[0-9]+") ||
			email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$") ||
			sex == null ||
			language == null) {

			response.sendRedirect("index.jsp");
			return;
		}

		/*
		 * Draft the fields as the per the entity given..  if you have 5 attributes ..
		 * you must have 5 variable to handle the request from the client. 
		 */

		Student st = new Student();
		st.setUserId(userId);
		st.setPassword(password);
		st.setName(name);
		st.setAddress(address);
		st.setCountry(country);
		st.setZipCode(zipCode);
		st.setEmail(email);
		st.setSex(sex);
		st.setLanguage(language);
		st.setAbout(about);
		
		try {
			stDao.registerStudent(st);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("StudentInfo.jsp");
	}

}