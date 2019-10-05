package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;

import DAO.EmployeeDao;

@SpringBootApplication
public class SpringBootHibernateApplication implements CommandLineRunner {
	@Autowired
	private EmployeeDao employeeDao;
	private Employee employee;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		employee = getEmployee();
		employeeDao.getAllEmployee();
				}
	private Employee getEmployee() {
		Employee employee= new  Employee();
		employee.getName();
		employee.getSalary();
		return employee;
	}
}
