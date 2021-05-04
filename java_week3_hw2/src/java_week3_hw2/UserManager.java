package java_week3_hw2;

public class UserManager {

	public void userLogin(User user) {
		System.out.println(user.getMail()+" "+user.getPassword());
		System.out.println(user.getFirstName()+" "+user.getLastName()+" giriþ yaptý");
	}
	public void userLogout(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" çýkýþ yaptý");
	}
	
}
