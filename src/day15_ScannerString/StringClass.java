package day15_ScannerString;

import java.util.Scanner;

public class StringClass {
	public static void main(String[] args) {
		/*
		 String class:
1.  String is an object
there are two ways to create object from String class:
1.  String literals:
String str = "Cybertek";
2.  by using "new" keyword:
String str = new String("Cybertek")
when the String object is created by String literals, 
that object will be saved at String pool (String pool does not take 
duplicates)
when the String object is created by using "new" 
keyword. the object will be saved at java heap memory (not within the 
String pool)
heap memory : the place where all the objects are 
store at
String pool : located in heap memory, stores all 
string literals' objects







everytime when we use "new" keyword, compiler will 
create a new object in java Heap memory
3.  String object represents the sequences of characters:
each character in String has its own index number.
index numbers start from 0
String str ="Cybertek"
//index number:      01234567
4.  String is immutable:
once you declare it you cannot modify it
String methods:
charAt(index num): it takes the index number and returns it's 
character as the a char value
Ex:
String str = "Cybertek";
//  index num:    012345
char ch = str.charAt(4);      ch ==> r
length(): returns the total number of characters
Ex:
String str   =   "Cybertek"
int num = str.length();
toUpperCase(): converts to Upper cases
Ex:
String str = "cybertek";
str = str.toUpperCase();
==> str ="CYBERTEK";
toLowerCase(): converts to the lower case
Ex: String str = "cybertek";
str = str.toUpperCase();
==> str ="CYBERTEK";







concat(str): it takes a String value and  conacts it to the String 
variable  and returns a NEW String value
EX:
String str = "Cybertek";
str = str.concat(" School");
str ==> Cybertek School







		 */
		String str ="Cybertek";

		String A = "Cybertek";

		String B = "Cybertek";

		System.out.println( A == B );//true

			// both String literals are stored at String pool

		

		

		String str2 = new String("Cybertek");

		

		System.out.println( str == str2 );  //false

				// different memory locations

		

		String str3 = new String("Cybertek");

		System.out.println(str2 == str3); //false

		

		

		String s1 = "cat";

		String s2 = "cat";

		System.out.println(s1==s2); // same memory locations in String pool

		

		String s3 = new String("cat");

		String s4 = new String("cat");

		System.out.println(s3 == s4); // different memory locations in java heap

		

		System.out.println(s1 == s4); // different memory

		

		

		String a = "Batch12";

		String b = "batch12";

		System.out.println(a == b);  // false, case sensitivity

		

		String c = new String("cybertek");

		String d = new String("Cybertek");

		System.out.println(c == d);

		

		
	}

}
