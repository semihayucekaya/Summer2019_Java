package day16_JavaRecap;

import java.util.Scanner;

public class WarmUp {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
	System.out.println("Enter your first name and last name");
	String firstname=scan.nextLine();
	String lastname=scan.nextLine();
	
	String fullname = firstname.concat(" "+lastname).toUpperCase();

	fullname=fullname.toUpperCase();
	
	System.out.println("your full name is:"+fullname);
		
		
		scan.close();
		
		
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
