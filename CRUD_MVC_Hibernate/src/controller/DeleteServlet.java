package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import serviceI.serviceI;
import serviceImpl.ServiceIMPL;
import model.Employee;

@WebServlet("/del")
public class DeleteServlet extends HttpServlet
{

	serviceI si=new ServiceIMPL();
	Employee e=new Employee();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		
		
		int id=Integer.parseInt(request.getParameter("id"));
		System.out.println("ID: "+id);
		e.setId(id);
		
		int i=si.deleteData(e);
		if(i==0)
		{
		List<Employee> lemp=si.getAllData(e);

		request.setAttribute("msg", "Record Deleted");
		
		request.setAttribute("edata", lemp);
		request.getRequestDispatcher("success.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("msg", "Record not Deleted");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		
		
	}

}
