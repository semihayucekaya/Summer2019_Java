package day10_ifStatement;

public class Nested_if {
	/*
	 Nested if:
	 if(condition1){
	    if(condition2){
	    //some code
	     A:as long as condition1 true
	     B:IF condition1&condition2 are true
	        }
	     }
	 */
	public static void main(String[] args) {

        if(true) {
            System.out.println("Hello Cybertek");
            
            if(false) {
                System.out.println("Hello WOrld");
            }
            
        }
        
        
        
        if(true) {
            System.out.println("Hello batch 12"); // printed
            
            if(false) {
                System.out.println("Hello programmers");
            } 
            else {
                System.out.println("Hello Team SDET"); // printed
            }
            
        }
        
		
		
		
		
	
		
		/*
		 60<=grade<70===>d
		 70<=grade<80===>c
		 80<==grade<90===>b
		 90<=grade<=100==>a
		 
		 */
        
        int grade=75;
        
        if(grade>=60&&grade<=100) {
        	System.out.println("you passed");
        	if(grade>=90&&grade<=100) {
        		System.out.println("\twith a grade of A");
        	}
        	else if(grade>=80&&grade<90) {
        		System.out.println("\twith a grade of B");
        	}
        	else if(grade>=70&&grade<80) {
        		System.out.println("\twith a grade of C");
        	}
        	else {
        		System.out.println("\t with grade of D");
        	}
        	
        	}
        else {
        	if(grade<60) {
        		System.out.println("You failed with a grade of F");
        	}
        	else {
        		System.out.println("invalid score,error 404");
        	}
        }
        
        
        
        
        
		
	}
}
		
		