
public class Student extends User {
	private double courseCompletionRate;

	public Student() {
		
	}
	
	public Student(double courseCompletionRate) {
		super();
		this.courseCompletionRate = courseCompletionRate;
	}

	public double getCourseCompletionRate() {
		return courseCompletionRate;
	}

	public void setCourseCompletionRate(double courseCompletionRate) {
		this.courseCompletionRate = courseCompletionRate;
	}
	
	
}
