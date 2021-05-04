package java_week3_hw2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Akif","Durmaz","akif@mail.com","12345","JAVA");
		Student student2 = new Student(2,"Mehmet","Durur","mehmet@mail.com","67890","C#");
		Instructor instructor = new Instructor(1,"Engin","Demirog","engin@mail.com","24680","JAVA & C#");
		
		User[] users = {student1,student2,instructor};
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		userManager.userLogin(instructor);
		instructorManager.givenCourses(instructor);
		userManager.userLogin(student1);
		studentManager.takenCourses(student1);
		userManager.userLogin(student2);
		studentManager.takenCourses(student2);
		userManager.userLogout(student1);
		

	}

}
