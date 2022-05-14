package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	// Variables
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String uniqueID;
	private String courses = "";
	private static int costOfCourse = 600;
	private int tuitionBalance;
	private static int id = 1000; // Static means it is true for all objects
	
	// Constructor: Prompts user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();		
		
		System.out.print("Enter grade year: \n1 for freshman \n2 for sophomore"
				+ "\n3 for junior \n4 for senior");
		this.gradeYear = in.nextLine();
		System.out.println(firstName + " " + lastName + " " + gradeYear);
		
		setUniqueID();
		
	}	
	
	// Methods
	
	// Generate an ID
	private void setUniqueID() {
		// Grade Level + ID
		id++;
		this.uniqueID = gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		} while (1 != 0);
		
		System.out.println("Enrolled In: " + courses);
		System.out.println("Tuition Balance: " + tuitionBalance);
	}
	
	// View Balance
	public void payTuition() {
		viewBalance();
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thanks for your payment!");
		viewBalance();
	}
	
	private void viewBalance() {
		System.out.println("Tuition Balance: " + tuitionBalance);
	}
	
	
	// Show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" + tuitionBalance;
	}
	
}
