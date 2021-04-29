
public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setUserId(156213);
		user.setFirstName("Cem");
		user.setLastName("Yılmaz");
		user.setAddress("Ankara");
		user.setMail("yilmazcem1122@gmail.com");
		
		Student student = new Student();
		student.setUserId(258964);
		student.setFirstName("Ahmet");
		student.setLastName("Alay");
		student.setAddress("İstanbul");
		student.setMail("ahmetaltay@gmail.com");
		student.setCourseCompletionRate(50.2);
		
		Instructor instructor = new Instructor();
		instructor.setUserId(385247);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setAddress("Ankara");
		instructor.setMail("...@gmail.com");
		
		UserManager userManager = new UserManager();
		userManager.addUser(user);
		userManager.deleteUser(student);
		userManager.updateUser(instructor);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.createCourse("JavaOOP");
	}

}
