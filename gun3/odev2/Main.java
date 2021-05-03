package odev2;

import odev2.manager.InstructorManager;
import odev2.manager.StudentManager;
import odev2.model.Instructor;
import odev2.model.Student;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Gokhan");
		student.setLastName("Demir");
		student.setPassword("123456");
		student.setEmail("gokhan123@gmail.com");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		System.out.println("student name :" + student.getFirstName() + "\nStudent lastname :" + student.getLastName());
	
		System.out.println("-----------------------------");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setPassword("123456");
		instructor.setEmail("engindemirog@gmail.com");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		System.out.println("Instructor Id:"+instructor.getId());
        System.out.println("Instructor Name:"+instructor.getFirstName()+" "+instructor.getPassword());

        System.out.println("-----------------------------");
		
	}

}
