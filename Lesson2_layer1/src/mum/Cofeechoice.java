package mum;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cofeechoice extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("here");
		String cofeechoice = req.getParameter("cofee");
		PrintWriter out = resp.getWriter();
		List<String> choices = new ArrayList<>();
		Database d = new Database();
		System.out.println("cfee" + cofeechoice);
		switch (cofeechoice) {

		case "dark":
			out.println("");
			break;
		case "light":
			break;

		case "medium":
			out.println("Starbuck’s Medium Roast Coffees:");
			choices = d.getAdvice("Medium");
			out.println("<ol>");

			for (String c : choices) {
				out.println("<li>" + c + "</li>");
			}
			out.println("</ol>");
			break;

		}
		out.println("<form  action=\"index.html\">");
		out.println("<input type=\"submit\" value=\"Back\">");
		out.println("</form >");

	}

}
