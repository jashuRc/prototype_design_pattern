package com.prototype_design_pattern.model;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

	private List<String> empList;

	public Employee() {
		this.setEmpList(new ArrayList<String>());
	}

	public void loadData() {
		// load data from database
		List<String> temp = new ArrayList<String>();
		temp.add("Jashu");
		temp.add("Baburao");
		temp.add("Shyam");
		temp.add("Raju");
		this.setEmpList(temp);
	}

	public Employee(List<String> list) {
		this.setEmpList(list);
	}

	public List<String> getEmpList() {
		return empList;
	}

	public void setEmpList(List<String> empList) {
		this.empList = empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new Employee(temp);
	}

}
