package java_week3_hw2;

public class Instructor extends User {

	private String courseGiven;
	
	public Instructor(int id, String firstName, String lastName, String mail, String password, String courseGiven) {
		super(id, firstName, lastName, mail, password);
		this.courseGiven = courseGiven;
	}
	public String getCourseGiven() {
		return courseGiven;
	}
	public void setCourseGiven(String courseGiven) {
		this.courseGiven = courseGiven;
	}
}
