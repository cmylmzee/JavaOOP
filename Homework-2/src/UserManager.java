
public class UserManager {
	
	public void addUser(User user) {
		System.out.println("User id : " + user.getUserId() + " added.");
	}
	
	public void deleteUser(User user) {
		System.out.println("User id : " + user.getUserId() + " deleted.");
	}
	
	public void updateUser(User user) {
		System.out.println("User id : " + user.getUserId() + " informations is updated.");
	}
	
	
}
