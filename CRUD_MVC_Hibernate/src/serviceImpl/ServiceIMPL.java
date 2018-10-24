package serviceImpl;

import java.util.List;

import daoI.DaoI;
import daoImpl.DaoIMPL;
import model.Employee;
import serviceI.serviceI;

public class ServiceIMPL implements serviceI
{

	DaoI di=new DaoIMPL();
	@Override
	public int registerData(Employee e) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("In serviceImpl registerData");
		return di.registerData(e);
	}
	@Override
	public List<Employee> validUser(String un, String ps) 
	{
		// TODO Auto-generated method stub
		System.out.println("In serviceImpl validUser");
		return di.validUser(un, ps);
	}
	
	@Override
	public List<Employee> getAllData(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("In serviceImpl getAllData");
		
		return di.getAllData(e);
	}
	@Override
	public int deleteData(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("In serviceImpl DeleteData");
		
		return di.deleteData(e);
	}
	
	@Override
	public int updateStudent(Employee e) {
		// TODO Auto-generated method stub
		return di.updateStudent(e);
	}
	@Override
	public Employee getAData(int id) {
		// TODO Auto-generated method stub
		return di.getAData(id);
	}

}
