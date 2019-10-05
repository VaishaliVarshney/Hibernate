package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository
public abstract class EmployeeDao implements Employee1Dao{
	@Autowired
	private SessionFactory sessionFactory;
	public List<Employee> getAllEmployee() {
		Session session= null;
		try {
			//session = sessionFactory.openSession();
			//session.beginTransaction();
			session = this.sessionFactory.getCurrentSession();
			List<Employee> employeeList = session.createQuery("from Employee").list();
			return employeeList;
			//session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
