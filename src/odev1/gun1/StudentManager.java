package odev1.gun1;

public class StudentManager {
	public void addStudent(Student student) {
		System.out.println("Ogrenci Eklendi : "+ student.getFirstName());
	}
	public void addStudent(Student[] students) {
		for (Student student : students) {
		System.out.println("Ogrenci Eklendi : "+ student.getFirstName());	
		}
		
	}

}
