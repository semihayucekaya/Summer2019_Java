package day09_Review;

public class If_Statement {
	
	public static void main(String[] args) {
		/*
		   if statements:
		    single if statement:
		       if(boolean expression){
		        some codes to run
		        }
		        if block only gets executed if the condition is true
		        
		 
		 
		 
		 
		 */
		
		if(true) {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off");
		}
	 
		int a=1000;
		if(true){
			//1000===>false
			a=2000;
			System.out.println("a is increased");
		}
		      System.out.println(a+"\n\n\n");
		      
		      int X=987654320;
		      if (X%2 == 0) {
		    	  System.out.println(X);
		    	  System.out.println("It is even number\n\n\n");
		      }
		      
		      if (X%2!=0) {
		    	  System.out.println(X);
		    	  System.out.println("it's an odd number");
		      }
		      
		      
		      int Y= 2345678;
		      if(Y%5 ==0) {
		    	  System.out.println("can be divided by 5");
		      }
		      
		      if(Y%5 !=0) {
		    	  System.out.println(Y+" CAN'T be divided by 5\n\n\n");
		      }
		      
		      String CEO="Main Boss";
		      String Kuzzat="Main Boss";
		      
		      System.out.println(CEO ==Kuzzat);
		      
		      if(Kuzzat ==CEO) {
		    	  System.out.println("GrEAT Person in the world");
		      }
		      
		      if(Kuzzat != CEO) {
		    	  System.out.println("Great Person in the world");
		      }
		      
		      double TotalNumber =100;
		      boolean Cybertek =true;
		      boolean BestSchool =true;
		      if(Cybertek ==BestSchool) {
		    	  TotalNumber +=500;
		      }
		      if(Cybertek!=BestSchool) {
		    	  TotalNumber -=50;
		    	  
		      }
		      System.out.println(TotalNumber+"\n\n\n");
		      
		      /*
		       1.Declare a variable, and initialized user age
		       2.write a program if the user is eligible to vote for Donald Trump
		            vote age:18
		       */
		      
		      byte PersonAge=78;
		      byte voteAge=18;
		      if(PersonAge>=voteAge) {
		    	  System.out.println("Yes you are eligible to vote");
		    	  System.out.println("have fun with building the wall");
		    	  System.out.println("MAGA");
		      }
		        
		         if(PersonAge<voteAge) {
		        	 System.out.println("You are not elligible to vote yet,please grow up");
		         }
		         
		         
		      
		      
		      
		      
	}
}

