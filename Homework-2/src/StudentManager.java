
public class StudentManager extends UserManager {
	public void joinCourse(User user) {
		System.out.println("User id : " + user.getUserId() + "joined course.");
	}
}
