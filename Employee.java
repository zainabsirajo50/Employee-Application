import java.util.*;
public class Employee {
	private int employeeId;
	private String employeeLastName;
	private String employeeFirstName;
	private double salary;
	private String workHours;
	private boolean isFullTime;

	private Role role;
	private Gender gender;



	public Employee() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome! Please enter your employee id to continue. (1-3)");
		
		employeeId = input.nextInt();
		
		
		
		if(employeeId == 1) {
			
			employeeFirstName = "Zainab";
			employeeLastName = "Sirajo";		
			gender = Gender.FEMALE;
			role = Role.ENGINEER;
			workHours = "9 - 5";
			isFullTime = true;
		} else if(employeeId == 2) {
			employeeFirstName = "John";
			employeeLastName = "Smith";
			gender = Gender.MALE;
			role = Role.TESTER;
			workHours = "8 - 4";
			isFullTime = false;
		} else if(employeeId == 3) {
			employeeFirstName = "Alex";
			employeeLastName = "Johnson";
			gender = Gender.NONBINARY;
			role = Role.ENGINEER;
			workHours = "10 - 6";
			isFullTime = true;
		}
		
	}

	String getFullName() {
		return employeeFirstName + " " + employeeLastName;

	}

	@Override
	public String toString() {
		return "Hello " + getFullName() + "\nRole: " + role + "\nGender: " + gender + "\nHours: " + workHours + "\nFull Time Employee Status: " + isFullTime;
	}
	
	



}
