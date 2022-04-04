package com.zensar.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    @Autowired
    @Qualifier("dept1")
    private Dept dept;
    private int emp_id;
    private String emp_name;

    public Employee() {
	// TODO Auto-generated constructor stub
    }

//    public Employee(Dept dept) {
//	this.dept = dept;
//    }

    public Dept getDept() {
	return dept;
    }

    public void setDept(Dept dept) {
	this.dept = dept;
    }

    public int getEmp_id() {
	return emp_id;
    }

    public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
    }

    public String getEmp_name() {
	return emp_name;
    }

    public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
    }

    public Employee(Dept dept, int emp_id, String emp_name) {
	super();
	this.dept = dept;
	this.emp_id = emp_id;
	this.emp_name = emp_name;
    }

    @Override
    public String toString() {
	return "Employee [dept=" + dept + ", emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
    }

}
