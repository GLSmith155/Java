package emailApp;

import java.util.Scanner;

public class Email {
	
	// Variables
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private int defaultPasswordLength = 10;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = ".aeycompany.com";
		
	// Constructor to receive the first name and last name
	Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Call a method asking for the department - return the department.
		this.department = setDepartment();
	
		// Generate random password of numbers then return it.
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + companySuffix;
		//System.out.println("Your email is " + email);
	}
	
	// Set Methods
	private String setDepartment() {
		System.out.println("Enter the department:\n1 for Sales\n2 for Dev\n3 for Accounting\n0 for None");
		
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if (depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "dev";}
		else if (depChoice == 3) {return "acct";}
		else {return "";}
	}	
	
	private String randomPassword(int length) {
		String passwordSet = "1234567890";
		// An array of characters as the password.
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
	    return new String(password);
	}
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Get Methods
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	// Since this method is a string, you must have System.Out for it to be visible.
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + " mb";
	}
}