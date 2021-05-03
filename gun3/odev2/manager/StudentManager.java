package odev2.manager;

import odev2.model.Student;

public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println("student added.");
	}

	public void update(Student student) {
		System.out.println("student updated.");
	}

	public void delete(Student student) {
		System.out.println("student deleted.");
	}
}
