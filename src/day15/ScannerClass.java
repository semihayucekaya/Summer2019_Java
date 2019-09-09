package day15;

import java.util.Scanner;
/*
 package name :java.util
 class name   :Scanner
 */
import java.util.*;//we cannot use both of them
//imports all the classes from java.util
/*
 package name java.util
 class name :Scanner
 
 
 Topic: 
            1. Scanner class
            2. String class & String manipulations

Scanner class: used for reading user inputs
        
            Scanner class is presented in "java.util" package

            in order to use scanner, we MUST import it from its package:
                                    import java.util.Scanner;

                 // imports scanner class only from the java.util' package 

            the import statement MUSt be placed between class and pckage:

                            package A;
                                import java.util.Scanner;
                            public class B{  }


            wild import: 
                            import java.util.*;
            // imports all the classes within "java.util" package


            Decleration of scanner class:
                        Scanner variableName = new Scanner(System.in)


                        variableName: can reference an object of scanner class

                        new Scanner(System.in): creates an object from the scanner class


            Scanner methods:

                        variableName.nextByte():
                                        returns the user input as byte value

                        variableName.nextShort():
 
 
 
 
 
 
 
 
 */

public class ScannerClass {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		byte num= input.nextByte();//returns the user input as byte value
		System.out.println(num*5);
		
		System.out.println("Enter short value");//returns the user input as short value
		short num2 =input.nextShort();
		
		System.out.println("Enter int value");//returns the user input as int value
		int num3=input.nextInt();
		
		System.out.println("enter long value");
		long num4=input.nextLong();//returns the user input as long value
		
		System.out.println("enter boolean ");
		boolean num5=input.hasNextBoolean();
		
		
		
		
		
		
		System.out.println("Enter your first name ");
		String str=input.nextLine();
		
		
		
		
		
		
		
		
	}

}
