package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDAOImpl;
import com.DB.DBConnect;
import com.model.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// getting names of my form
		try {
			String name = req.getParameter("fname");
			String email = req.getParameter("email");
			String phno = req.getParameter("phno");
			String password = req.getParameter("password");
			String check = req.getParameter("check");

			// testing to get values from my form
			// System.out.println(name+" "+email+" "+phno+" "+password+" "+check);
			// Jesus Herbert Gavancho Vasquez jesusherbert98@gmail.com 956277472 java on

			User us = new User();
			us.setName(name);
			us.setEmail(email);
			us.setPhno(phno);
			us.setPassword(password);

			HttpSession session = req.getSession();

			if (check != null) {
				// saving in my db(fastbookslibrary-app)

				UserDAOImpl dao = new UserDAOImpl(DBConnect.getConn());

				boolean f2 = dao.checkUser(email);
				if (f2) {

					boolean f = dao.userRegister(us);

					if (f) {
						// testing
						// System.out.println("User Registered successful");

						session.setAttribute("succMsg", "Registration successful");
						// redirecting
						resp.sendRedirect("register.jsp");
					} else {
						// System.out.println("Something got wrong on server");
						session.setAttribute("failedMsg", "Something got wrong on server");
						// redirecting
						resp.sendRedirect("register.jsp");
					}

				} else {
					session.setAttribute("failedMsg", "Try Another Email Id, User Already Existed");
					// redirecting
					resp.sendRedirect("register.jsp");
				}
			} else {
				// System.out.println("Please Check Agree Terms & Conditions");
				session.setAttribute("failedMsg", "Please Check Agree Terms & Conditions");
				// redirecting
				resp.sendRedirect("register.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
