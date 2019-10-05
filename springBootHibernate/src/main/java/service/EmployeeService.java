package service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Employee;

import DAO.Employee1Dao;

@Service("employeeService")
public class EmployeeService {
	
		@Autowired
		Employee1Dao employeeDao;
	 
		@Transactional
		public List<Employee> getAllEmployee() {
			return employeeDao.getAllEmployee();
		}
}
