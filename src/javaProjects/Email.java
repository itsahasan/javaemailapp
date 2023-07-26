package javaProjects;

import java.util.Scanner;

public class Email {
	
	private String firstName ;
	private String lastName ;
	private String department ;
	private String password ;
	private String email ;
	private int emailCapacity ;
	private String alternetEmail ;
	
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName ;
		this.lastName = lastName;
		//System.out.println("Email Created:" + this.firstName + " " +this.lastName);
		
		this.department = setDepartment();
		System.out.println("Department code is: " + this.department);
		
		this.password = createPassword(8);
		//System.out.println("You Passwork is: " + this.password);
		
		email =  firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+"company.com" ;
		//System.out.println(email);
	}
	
	
	//set the department by user
	
	private String setDepartment() {
		System.out.print("SELECT DEPARTMENT CODES\n1 Design\n2 Development\n3 Accounting\n0 None	\nEnter Department Code: ");
		Scanner in = new Scanner(System.in);
		int depat = in.nextInt();
		if(depat == 1) {return "Design" ;}
		else if (depat == 2) {return "Development" ;}
		else if (depat == 3) {return "Accounting" ;}
		else {return "You Select None" ;}
			
	}
	
	//set password
	
	private String createPassword(int lenght) {
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#" ;
		char[] password = new char[lenght] ;
		for(int i = 0; i<lenght; i++) {
			int rand = (int)(Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password) ;
		
	}
	
	//set mailbox capacity 
	public void setEmailCapacity(int emailCapacity ) {
		this.emailCapacity = emailCapacity ;
	}
	
	
	
	//set alternative email
	public void setAlterEmail (String email) {
		this.alternetEmail = email ;
	}
	
	
	//change the password
	
	public void changePass(String password) {
		this.password = password ;
	}
	
	public int getEmailCapacity() {return emailCapacity ;}
	public String getAlterEmail() {return alternetEmail ; }
	public String getChangePass() { return password ;}
	
	public String dispayInfo() {
		return "Display Name: " + firstName + " " + lastName +
				"\nEmail Address: " + email +
				"\nEmail Capacity: " + emailCapacity+ "MB" + 
				"\nEmail Password: " + password+ " ";
	}
	

}
