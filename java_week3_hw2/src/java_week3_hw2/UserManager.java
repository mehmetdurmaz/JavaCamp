package java_week3_hw2;

public class UserManager {

	public void userLogin(User user) {
		System.out.println(user.getMail()+" "+user.getPassword());
		System.out.println(user.getFirstName()+" "+user.getLastName()+" giri� yapt�");
	}
	public void userLogout(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" ��k�� yapt�");
	}
	
}
