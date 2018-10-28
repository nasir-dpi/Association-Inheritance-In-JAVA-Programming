package association;

public class Course {
	

	private String courseName;
	private String courseCode;
	private double courseCredit;
	
	
	public Course(String courseName, String courseCode, double courseCredit) {
		super();
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.courseCredit = courseCredit;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCourseCode() {
		return courseCode;
	}


	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}


	public double getCourseCredit() {
		return courseCredit;
	}


	public void setCourseCredit(double courseCredit) {
		this.courseCredit = courseCredit;
	}


	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseCode=" + courseCode + ", courseCredit=" + courseCredit
				+ "]";
	}
	
	
	
	
}
