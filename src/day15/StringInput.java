package day15;

import java.util.Scanner;

public class StringInput {
	/*
	 next() vs nextLine();
	 */
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your first name");
	String firstName=scan.next();
	

	System.out.println("Enter your last name");
	String lastname=scan.next();
	System.out.println("first name is:"+firstName);
	System.out.println("your last name is:"+lastname);
	
	
	
	
}
}
