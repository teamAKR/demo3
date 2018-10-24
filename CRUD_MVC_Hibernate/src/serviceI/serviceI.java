package serviceI;

import java.util.List;

import model.Employee;

public interface serviceI 
{
	public int registerData(Employee e);
	List<Employee> validUser(String un,String ps);
	public int deleteData(Employee e);
	public List<Employee> getAllData(Employee e);
	Employee getAData(int id);
	public int updateStudent(Employee e);


}
