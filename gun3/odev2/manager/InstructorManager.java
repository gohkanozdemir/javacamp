package odev2.manager;

import odev2.model.Instructor;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println("instructor added.");
	}

	public void update(Instructor instructor) {
		System.out.println("instructor updated.");
	}

	public void delete(Instructor instructor) {
		System.out.println("instructor deleted.");
	}

}
