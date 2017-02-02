package com.revature.empapp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.empapp.model.Employee;
import com.revature.empapp.util.ConnectionUtil;

public class EmployeeDAO {
 private JdbcTemplate jdbctemplate=ConnectionUtil.getJdbcTemplate();
 public void save(Employee employee)
 {
	String sql="insert into emp(empname,sal)values(?,?)";
	Object[]params={employee.getEmpname(),employee.getSalary()};
	int rows=jdbctemplate.update(sql,params);
	System.out.println("rows inserted is"+rows);
 }
 
 }

