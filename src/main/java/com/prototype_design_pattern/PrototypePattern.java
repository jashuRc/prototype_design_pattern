package com.prototype_design_pattern;

import com.prototype_design_pattern.model.Employee;

/**
 * Hello world!
 *
 */
public class PrototypePattern {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Program Strat...");

		Employee heraPheri = new Employee();
		heraPheri.loadData();

		Employee heraPheriPart2 = (Employee) heraPheri.clone();
		heraPheriPart2.getEmpList().add("Totalaa Sheth");

		System.out.println("Hera Pheri Part1:" + heraPheri.getEmpList());
		System.out.println("Hera Pheri Part2:" + heraPheriPart2.getEmpList());

		System.out.println("Program End...");
	}
}
