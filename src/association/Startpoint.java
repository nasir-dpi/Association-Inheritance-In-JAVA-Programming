package association;

import java.util.ArrayList;
import java.util.Scanner;

public class Startpoint {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in) ;
			ArrayList<Course>courses = new ArrayList<>();
		
		Student s1  =new Student();
		s1.setStudentName("Professor Masrur Ali");
		s1.setStudentId("201");
		s1.setStudentAge(60);
		//System.out.println(s1);
		
		
		Address a1 = new Address("195",  "9", "Dhaka", "1211");
		s1.setAddress(a1);
		
		//System.out.println(s1);
		
		Contact c1 = new Contact("01623124472", "uddinrjnasir@gmail.com");
		s1.setContact(c1);
		//System.out.println(s1);
		
		Department d1 = new Department("Computer Science & Engneering", "Block-A");
		s1.setDepartment(d1);
		//System.out.println(d1);
		
		//last Stage
		
		System.out.println("Enter how many courses?");
		int count =Integer.parseInt(sc.nextLine());
		
		for(int i =0;i<count;i++) {
			System.out.print("Enter Course name");
			String c_name = sc.nextLine();
			System.out.println();
			
			
			System.out.print("Enter Course code");
			String c_code = sc.nextLine();
			System.out.println();
			
			System.out.print("Enter Course credit");
			double c_credit =Double.parseDouble(sc.nextLine()) ;
			System.out.println();
			
			Course cr = new Course(c_name, c_code, c_credit);
			courses.add(cr);
			
		
		}
		
		/*Course cr1 = new Course("Computer Fundamental", "cs-101", 3.0);
		
		Course cr2 = new Course("Computer Operation", "cs-102", 4.0);
		Course cr3 = new Course("Database Management System", "cs-103", 2.0);
		//ArrayList<Course>courses = new ArrayList<>();
		
		courses.add(cr1);
		courses.add(cr2);
		courses.add(cr3);*/
		s1.setCourses(courses);
		System.out.println(s1);
		
		/*Last stager ager stepstep
		
		System.out.println(s1.getDepartment().getDepartmentname());*/
		
		for(Course c : s1.getCourses()) {
			System.out.println(c.getCourseName());
		}
		
		
		
	
	}

}
