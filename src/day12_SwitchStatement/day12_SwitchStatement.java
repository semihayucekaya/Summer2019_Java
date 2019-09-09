package day12_SwitchStatement;

public class day12_SwitchStatement {
	public static void main(String[] args) {
		if(true) {
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
		} else {
			System.out.println("World");
		}
		//without curly brace: a single line of statement
		if (true)
			System.out.println("Hello World");
		//without curly brace if block cannot hold more than one statement
		else
		System.out.println("Hello Cybertek");
		
		
		
		System.out.println("============");
		
		//nested if:
		if(true)
			if(true)
				System.out.println("Hello World");
		
			else
				System.out.println("Hello cybertek");
		    else
			     System.out.println("invalid");
		
		
		//multi-branch if:
		int grade=80;
		if(grade<=100&&grade>=0)
		if(grade>=90) {
			System.out.println("A");
		} else if(grade>=80) {
			System.out.println("B");
		} else if(grade>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("Invalid Entry");
		}
		
		
	if (grade<=100&&grade>=0)	
		if(grade>=90) System.out.println("A");
		else if(grade>=80)  System.out.println("B");
		else if(grade>=70) System.out.println("C");
		else System.out.println();//this else statement belongs to the"else if statement"
	else System.out.println("Invalid");//this else belongs to the pre condition
		
		
		
	}

}
