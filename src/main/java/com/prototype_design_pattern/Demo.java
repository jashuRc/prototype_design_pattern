package com.prototype_design_pattern;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.prototype_design_pattern.model.Employee;

/**
 * Hello world!
 *
 */
public class Demo {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Program Strat...");

		String filename = "file.ser";

		Employee heraPheri = new Employee();
		heraPheri.loadData();

		// Serialization
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(heraPheri);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		System.out.println("Program End...");
	}
}
