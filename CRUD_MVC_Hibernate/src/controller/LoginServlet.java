package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;
import serviceI.serviceI;
import serviceImpl.ServiceIMPL;

@WebServlet("/log")
public class LoginServlet extends HttpServlet
{
	serviceI si=new ServiceIMPL();
		
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		System.out.println("In Login Servlet");
		// TODO Auto-generated method stub
		String un=request.getParameter("uname");
		String ps=request.getParameter("pass");
		
		List<Employee> li=si.validUser(un, ps);
		if(!li.isEmpty())
		{
			System.out.println("In If");
			request.setAttribute("edata", li);
			request.setAttribute("msg", "Logged in Successfully");
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}
		else
		{
			System.out.println("in else");
			request.setAttribute("msg", "Invalid Username & Password");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		
	
	}

}
