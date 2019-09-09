package day10_ifStatement;

public class without_CurlyBrace {
	public static void main(String[] args) {
		/*
		 single if statement:
		 if(condition){
		 //some codes
		  }
		  
		 */
		
		
		
		if(false) {
			System.out.println("Today is friday");
			System.out.println("Tomorrow is day off");
			System.out.println("there is no java class tomorrow");
		}
		
		if(false)
			System.out.println("today is friday");
		
		    System.out.println("tomorrow there is no class");//if statement without curly braces ,it has just only a single line of statement 
		
		
		if (true)
			System.out.println("hello");
		    System.out.println("world");
		
		    
		    /*
			 if-else statement:
			 if(condition)
			 //single line of statement
			  * else
			  //single line of statement
			   if-else without curly braces:
			   if (condition)
			       //only one line
			     else(condition2)
			     //only one line
			 */
		    if(true)
		    	System.out.println("Hello");
		   // System.out.println(); it is be compile error
		    else
		    	System.out.println("Hola");
		
		    
		    if(false)
		    	System.out.println("this is if");
		    
		     else
		    	System.out.println("this is else");
		        
		    /*
		     multi-branch if statemen :
		     if(condition1)
		     //single line of statement
		      else if(condition2)
		      //single line statement
		       else
		       //single line of statement
		     */
		
		    
		    if(true)
		    	System.out.println("if block");
		    else if(true)
		    	System.out.println("else-if block");
		    else
		    	System.out.println("else block");
		
		
	}

}
