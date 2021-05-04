package java_week3_hw2;

public class Student extends User {
	
	private String courseTaken;

	public Student(int id, String firstName, String lastName, String mail, String password, String courseTaken) {
		super(id, firstName, lastName, mail, password);
		this.courseTaken = courseTaken;
	}
	public String getCourseTaken() {
		return courseTaken;
	}
	public void setCourseTaken(String courseTaken) {
		this.courseTaken = courseTaken;
	}
}
