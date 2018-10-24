package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serviceI.serviceI;
import serviceImpl.ServiceIMPL;
import model.Employee;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet
{
	serviceI service=new ServiceIMPL();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setId(Integer.parseInt(request.getParameter("id")));
		e.setName(request.getParameter("name"));
		e.setCity(request.getParameter("city"));
		e.setDept(request.getParameter("dept"));
		e.setUname(request.getParameter("uname"));
		e.setPass(request.getParameter("pass"));
		
		int i=service.updateStudent(e);
		if(i!=0)
		{
			List<Employee> emplist=service.getAllData(e);
			request.setAttribute("msg", "Record updated");
			request.setAttribute("edata", emplist);
			request.getRequestDispatcher("success.jsp").forward(request, response);
			
		}
		else
		{
			
				request.setAttribute("msg", "Record not updated");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			
		}
		
	}

}
