package day16_JavaRecap;

import java.util.Scanner;

public class NextLine2 {
	public static void main(String[] args) {
		/*
		 write program that accepts zipcode city state phonenumber and then displayed all those gathered information
		 Do not use next() method
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your zipcode");
		int zipcode =input.nextInt();
		input.nextLine();
		System.out.println("Please enter your city name");
		String cityname=input.nextLine();
		
		System.out.println("Zipcode is:"+zipcode);
		System.out.println("city name is:"+cityname);
		
		System.out.println("enter your phone number");
		int phonenumber=input.nextInt();
		System.out.println("Your phone number:"+phonenumber);
		input.nextLine();
		System.out.println("enter your state");
		String state=input.nextLine();
		System.out.println("Your state is:"+state);
		System.out.println(zipcode+","+cityname+","+state+","+phonenumber);
	}

}
