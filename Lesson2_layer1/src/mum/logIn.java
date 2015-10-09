package mum;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class logIn extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("in login page");
		String name = req.getParameter("Name");
		String password = req.getParameter("Password");

		Database database = new Database();
		String pass = database.getPassword(name);

		if (password.equals(pass)) {
			resp.sendRedirect("loginSucceszs.html");
		} else
			resp.sendRedirect("index.html");

	}

}
