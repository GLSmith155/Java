package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
	
	public static void main(String[] args) {

		//How many new students
		System.out.println("How many new students to enroll?");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		// Build array of objects equal to number of new students.
		
		// Loop through each student to ask info
		for (int n=0; n < numOfStudents; n++) {
			students[n]  = new Student();
			students[n].enroll();
			students[n].payTuition();
			// Since we are returning something we must use Sysout
			System.out.println(students[n].showInfo());		
		}
		
		for (int n=0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());
		}
	}
}
