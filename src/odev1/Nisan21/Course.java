package odev1.Nisan21;

public class Course {
	public String courseName;
	public String courseInstructor;
	public int percentageOfCompletion;
	public CourseProgram courseProgram[];

	/**
	 * 
	 */
	public Course() {
	}

	/**
	 * @param courseName
	 * @param courseInstructor
	 * @param percentageOfCompletion
	 * @param courseProgram
	 */
	public Course(String courseName, String courseInstructor, int percentageOfCompletion,
			CourseProgram[] courseProgram) {
		super();
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
		this.percentageOfCompletion = percentageOfCompletion;
		this.courseProgram = courseProgram;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}

	public int getPercentageOfCompletion() {
		return percentageOfCompletion;
	}

	public void setPercentageOfCompletion(int percentageOfCompletion) {
		this.percentageOfCompletion = percentageOfCompletion;
	}

	public CourseProgram[] getCourseProgram() {
		return courseProgram;
	}

	public void setCourseProgram(CourseProgram[] courseProgram) {
		this.courseProgram = courseProgram;
	}

}
