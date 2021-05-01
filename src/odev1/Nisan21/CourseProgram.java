package odev1.Nisan21;

public class CourseProgram {
	public String courseDay;
	public String syllabus;
	public Homework homework[];

	/**
	 * 
	 */
	public CourseProgram() {}

	/**
	 * @param courseDay
	 * @param syllabus
	 * @param homework
	 */
	public CourseProgram(String courseDay, String syllabus, Homework[] homework) {
		super();
		this.courseDay = courseDay;
		this.syllabus = syllabus;
		this.homework = homework;
	}

	public String getCourseDay() {
		return courseDay;
	}

	public void setCourseDay(String courseDay) {
		this.courseDay = courseDay;
	}

	public String getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}

	public Homework[] getHomework() {
		return homework;
	}

	public void setHomework(Homework[] homework) {
		this.homework = homework;
	}

}
