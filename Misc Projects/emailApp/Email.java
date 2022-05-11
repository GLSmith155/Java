package emailApp;

public class Email {
	
	// Variables
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
		
	// Constructor
	Email() {
		System.out.println(firstName + "." + lastName + "@company.com");
	}
	
	// Methods
	public void setName(String firstName, String lastName) {
		firstName = "Apple";
		lastName = "Dunn";
		
		this.firstName = firstName;
		this.lastName = lastName;
	}	
	
	public String getName() {
		return this.firstName;
	}	
	
	public void setPassword(String password) {
		this.password = "432";
		this.password = password;
	}
}
