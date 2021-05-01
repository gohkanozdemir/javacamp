package odev1.Nisan21;

public class Homework {
	private String homeworkName;
	private String description;

	/**
	 * 
	 */
	public Homework() {	}

	/**
	 * @param homeworkName
	 * @param description
	 */
	
	public Homework(String homeworkName, String description) {
		super();
		this.homeworkName = homeworkName;
		this.description = description;
	}

	public String getHomeworkName() {
		return homeworkName;
	}

	public void setHomeworkName(String homeworkName) {
		this.homeworkName = homeworkName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
