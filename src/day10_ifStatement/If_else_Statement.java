package day10_ifStatement;

public class If_else_Statement {
	
	public static void main(String[] args) {
		/*
		 *if&else:
		 *if (condition){
		 //A
		  * }
		     else{
		     //B
		      //else block only gets executed if the condition is false
		       }
		 */
		
		
		
   
  if (9>=8) {
	   System.out.println("9 is greater than or equal 8");
   }
		
  else {
	  System.out.println("9 is less than 8");
  }
  
  
  if(false==!false) {
	  System.out.println("if block");
  }
  else {
	  System.out.println("else block");
  }
  
  int score=59;
  if(score>=60) {
	  System.out.println("passed");
  }
  else {
	  System.out.println("Failed");
  }
  
//task:
  /*
   1.triangle has three angles and sum of three angles must be equal to180
   1.declare three variables angle1,angle2,angle3
   2.write a program to check if the triangle is valid or not
   */
		
  int angle1=20;
  int angle2=50;
  int angle3=75;
  boolean valid=(angle1+angle2+angle3)==180;
  if (valid) {
	  System.out.println("it's a valid triangle");
	  
  }
  else {
	  System.out.println("Invalid triangle,do some math");
  }
  
		
		
		
		
		
		
		
		
	}

}
