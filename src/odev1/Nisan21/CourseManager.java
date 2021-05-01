package odev1.Nisan21;

public class CourseManager {
	public void signUp(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " Basariyla Kaydoldunuz");
	}

	public void kursTamamlama(Student student) {
		System.out.println(student.getFirstName()  + " Kursu Tamamladiniz");
	}
	public void addStudentToCourse(Student student, Course course) {
		System.out.println(student.getFirstName()  +" isimli ogrenci "+ course.getCourseName() + " kursuna basarili bir sekilde kayit oldu");
	}
	public void addStudentToCourse(Student[] students, Course course) {
		for (Student student : students) {
			System.out.println(student.getFirstName()  +" isimli ogrenci "+ course.getCourseName()  + " kursuna basarili bir sekilde kayit oldu");
		}
		
	}
}
