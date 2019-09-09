package day06_ArithmaticOperators;

public class ArithmaticOperators {
/*
     +:additional,adds two number together
     -:subtraction,subtracts a number from another number
     *:multiplication 
     /:devision
     %:remainder
 
 
 
 
 
 
 */
	public static void main(String[] args) {
		int a =100;
		int b=a-100;
		System.out.println(b);//0
		int c=a+b;
		System.out.println(c);//100
		
		int x=3, y=5, z=x*y;
		System.out.println(z);//15
		
		int length =100, wedth=10, Area=length*wedth;
		System.out.println(Area);//1000
		System.out.println(3+ 5 + 4 - 2);//10
		
		//double resultNum=9/0;             //denominator cannot be zero
		//System.out.println(resultNum);
		
		short Number1 =10/3;     //when we are giving int number it gives whole number
		System.out.println(Number1);//3
		double Number2=10/3;
		System.out.println(Number2);//3.0
		double Number3 =10/3f;
		System.out.println(Number3);//3.3333332538604736
	    double Number4=10/3.0;
	    System.out.println(Number4);//3.3333333333333335
	    
	    
	    int output =12+6/3;
	       //12+2=14
	    System.out.println(output);//14
	    
	    System.out.println(8+12*2);//32

	    
	    
	    //%:
	    /*
	     10/3===>3 with remainder of 1
	     12/5===>2 with remainder (12-(5*2))=2
	     */
	    
	    int result1=10%3;//1
	    
	    System.out.println(result1);
	    System.out.println(12%5);//2
	    //20, 45, 65, 67, 68
	    
	    
	    int Number20=20%2;//even
	    int Number45=45%2;//odd
	    int Number65= 65%2;
	    System.out.println(Number45);
	    System.out.println(Number20);
	    System.out.println(4+17%2-1);//4
	    		     //4+1-1=4
	    System.out.println(6-3*2+7-1);//6
	    
	    
	    
	    
	    System.out.println(6*3/2);//9
	    
	    
	    //%:
	    
	    //     10/4===>2 with remainder of(10 -2*4)=2
	    
	    
	    System.out.println(10/4);
	    
	    System.out.println((4+17)%2-1);//0
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
