package association;

import java.util.ArrayList;

public class Student {
	// 1st Stage
	private String studentName;
	private String StudentId;
	private int StudentAge;
	
	//then 2nd stage
	private Address address;
	private Contact contact;
	private Department department;
	private ArrayList<Course>Courses;
	
	
	

	//2nd stage
		/*@Override
		public String toString() {
			return "Student [studentName=" + studentName + ", StudentId=" + StudentId + ", StudentAge=" + StudentAge + "]";
		}*/
	
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public int getStudentAge() {
		return StudentAge;
	}
	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public ArrayList<Course> getCourses() {
		return Courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		Courses = courses;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", StudentId=" + StudentId + ", StudentAge=" + StudentAge
				+ ", address=" + address + ", contact=" + contact + ", department=" + department + ", Courses="
				+ Courses + "]";
	}
	
	
	
	
	
	
	
	
	

	
	
	
}
