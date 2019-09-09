package day10_ifStatement;

public class Example {
	

	public static void main(String[] args) {
		
		
		int grade=15;
		if(grade>=60&&grade<=100) {
			System.out.println("you passed");
			if(grade>=90&&grade<=100) {
				System.out.println("your grade is A");
			}
			else if(grade>=80&&grade<90) {
				System.out.println("your grade is B");
				
			}
			else if(grade>=70&&grade<80) {
				System.out.println("your grade is C");
			}
			else if(grade>=60&&grade<70) {
				System.out.println("your grade is D");
			}
			
			
		}
		
		else {
			if(grade<60) {
				System.out.println("you are failed");
			
			 if(grade>=50&&grade<60) {
				System.out.println("Your grade is E");
			}
			else if(grade>=40&&grade<60) {
				System.out.println("your grade is F ");
			}
			else if(grade>=30&&grade<40) {
				System.out.println("your grade is G");
			}
			else if(grade>=20&&grade<30) {
				System.out.println("your grade is H");
			}
			else{
				
				System.out.println("your grade is too bad,you must study hard");
			}
			
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
