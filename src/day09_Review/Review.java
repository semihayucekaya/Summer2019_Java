package day09_Review;

public class Review {
	 /*
	  relational:
	    > : greater    only return true when x>y
	    >= greater  than or equal  true :either equl
	    < :LESS THAN
	    <=:less than equal 
	    ==: equal
	    !=:not equal
	    
	    
	    logical operators:
	    &&: true :if both conditions are true
	    ||: true:just one condition is true
	  */
	
	public static void main(String[] args) {
		
		//  >:
		    System.out.println('z'>'a');//true
		    System.out.println('z'>='a');//true
		    System.out.println('a'>'A');//TRUE
		    System.out.println('a'<'A');  //FALSE
		    
		    char ch1=123;
		    System.out.println(ch1);
		    
		    System.out.println('A'<='A');// TRUE
		    System.out.println('A'<='a'); 
		
		    System.out.println(false ==false);//true
		    System.out.println(false !=true);//true
		    byte x=10; int y=10;
		    System.out.println(x==y);//true
		    System.out.println(true==true && false !=true);//true
		    System.out.println(true !=true || false ==true);
		                      //false||false===>false
		    
		    
		    System.out.println("Monday"=="Funday"|| true==!false);
		                    //false||true===>true
	}
	
	
	
	

}
