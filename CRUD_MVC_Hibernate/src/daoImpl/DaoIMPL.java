package daoImpl;

import java.util.List;








import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import utility.HibernateUtil;
import model.Employee;
import daoI.DaoI;

public class DaoIMPL implements DaoI
{
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session session=sf.openSession();

	@Override
	public int registerData(Employee e)
	{
		// TODO Auto-generated method stub
		System.out.println("In DaoImpl");
		int id=(int) session.save(e);
		session.beginTransaction().commit();
		return id;
	}

	@Override
	public List<Employee> validUser(String un, String ps) 
	{
		// TODO Auto-generated method stub
		Query q=session.createQuery("from Employee where uname='"+un+"' and pass='"+ps+"'");
		List<Employee> el=q.list();
		if(!el.isEmpty())
		{
			Query q1=session.createQuery("from Employee e");
			
			el=q1.list();
		}
		return el;
	}

	

	@Override
	public List<Employee> getAllData(Employee e) 
	{
		// TODO Auto-generated method stub
		Query q=session.createQuery("from Employee e");
		
		
		return q.getResultList();
	}

	@Override
	public int deleteData(Employee e) {
		// TODO Auto-generated method stub
		session.delete(e);
		session.beginTransaction().commit();
		return 0;
	}

	@Override
	public Employee getAData(int id) 
	{
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		Query q=session.createQuery("from Employee e where e.id="+id);
		
		return (Employee) q.getSingleResult();
		
	}

	@Override
	public int updateStudent(Employee e) 
	{
		// TODO Auto-generated method stub
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getCity());
		System.out.println(e.getDept());
		System.out.println(e.getUname());
		System.out.println(e.getPass());
		Session session=HibernateUtil.getSessionFactory().openSession();
	Query q=session.createQuery("update Employee e set e.name=?,e.city=?,e.dept=?,e.uname=?,e.pass=? where e.id=?");
	
		
		
		q.setParameter(0,e.getName());
		q.setParameter(1,e.getCity());
		q.setParameter(2,e.getDept());
	
		q.setParameter(3,e.getUname());
		q.setParameter(4,e.getPass());
		q.setParameter(5,e.getId());
		Transaction txn=session.beginTransaction();
		int i=q.executeUpdate();
		txn.commit();
		return i;
	}

}
