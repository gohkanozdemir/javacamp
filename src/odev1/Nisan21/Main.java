package odev1.Nisan21;

public class Main {

	public static void main(String[] args) {
		Homework[] homeworks1 = { new Homework("Odev1", "Java dilinde kullanılan diğer veri tiplerini araştırınız."),
								 new Homework("Odev2", "GitHuba yukleme.") };
		Homework[] homeworks2 = { new Homework("Odev1", "lass, contructor yapılarını oluşturup diziye ekleyip listeleyiniz."),
				 new Homework("Odev2", "oynatma listesini 24-35 aralığında izleyiniz. (24-35 dahil)") };
		
		CourseProgram[] courseProgram = {new CourseProgram("1. Gün - 21 Nisan 2021", "JAVA Temelleri 1, Değişkenler, şart blokları, döngüler, diziler", homeworks1),
										 new CourseProgram("2. Gün - 24 Nisan 2021", "JAVA Temelleri 2", homeworks2)};
		
		Course course = new Course("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "Engin Demirog", 30, courseProgram);
		
		Student student1=new Student(1,"Hakan","Hakli","passWord1");
		Student student2=new Student(2,"Ahmet","Hakyemez","passWord2");
		Student student3=new Student(3,"Firat","Ahkam","passWord3");
		
		Student[] students= {student2,student3};
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
		studentManager.addStudent(students);
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.addStudentToCourse(student1, course);
		courseManager.addStudentToCourse(students, course);
	}
}
