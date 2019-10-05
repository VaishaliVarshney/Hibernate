package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.demo.model.Employee;

import service.EmployeeService;

@Controller
public class employeeController {
	@Autowired
	EmployeeService employeeService;
 
	public String getAllEmployees(Model model) {
 
		List<Employee> listOfEmployee = employeeService.getAllEmployee();
		model.addAttribute("employee", new Employee());
		model.addAttribute("listOfEmployees", listOfEmployee);
		return "employeeDetails";
	}
}
