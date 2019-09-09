package day15_ScannerString;

import java.util.Scanner;

public class Task03 {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("Enter your first name:");
	   String firstName= input.next();
	   System.out.println("Enter your lastname:");
	   String lastName=input.next();
	   String fullname=lastName+" "+firstName;
	   System.out.println("Your full name is: "+fullname);
	   input.close();//gets rid of warning of the scanner class
	   
	   
}
}
