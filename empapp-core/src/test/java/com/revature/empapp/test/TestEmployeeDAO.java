package com.revature.empapp.test;

import com.revature.empapp.dao.EmployeeDAO;
import com.revature.empapp.model.Employee;

public class TestEmployeeDAO {
 public static void main(String [] args)
 {
	 Employee employee=new Employee();
	 employee.setEmpname("yas");
	 employee.setSalary(1000);
	 EmployeeDAO employeedao=new EmployeeDAO();
	 employeedao.save(employee);
 }
}
