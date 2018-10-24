package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;
import serviceI.serviceI;
import serviceImpl.ServiceIMPL;

@WebServlet("/edit")
public class EditServlet extends HttpServlet
{
	serviceI si=new ServiceIMPL();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		
		int id=Integer.parseInt(request.getParameter("id"));
		Employee e=si.getAData(id);
		
		if (e != null) 
		{
			
			request.setAttribute("edata", e);
			request.getRequestDispatcher("Edit.jsp").forward(request,response);
		}
		else
		{
			System.out.println("Student object is null in Edit class");
		}
	}

}
