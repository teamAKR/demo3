package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serviceI.serviceI;
import serviceImpl.ServiceIMPL;
import model.Employee;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		e.setName(request.getParameter("name"));
		e.setCity(request.getParameter("city"));
		e.setDept(request.getParameter("dept"));
		e.setUname(request.getParameter("uname"));
		e.setPass(request.getParameter("pass"));
		
		serviceI si=new ServiceIMPL();
		int id=si.registerData(e);
		if(id!=0)
		{
			request.setAttribute("msg", "Record inserted");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		

	}

}
