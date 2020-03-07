package com.prototype_design_pattern;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

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

		boolean flag = true;
		while (flag) {
			Scanner sc = new Scanner(System.in); // System.in is a standard input stream
			System.out.print("Enter Number:");
			int a = sc.nextInt();
			switch (a) {
			case 0:
				flag = false;
				break;
			case 1:
				// Deserialization
				try {
					// Reading the object from a file
					FileInputStream file = new FileInputStream("file.ser");
					ObjectInputStream in = new ObjectInputStream(file);

					// Method for deserialization of object
					heraPheri = (Employee) in.readObject();

					in.close();
					file.close();
					System.out.println("Hera Pheri Part1:" + heraPheri.getEmpList());
				}
				catch (IOException ex) {
					System.out.println("IOException is caught");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			default:
				break;
			}
		}

		System.out.println("Program End...");
	}
}
