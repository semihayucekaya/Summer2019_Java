package day15_ScannerString;

public class StringMethods {
	
public static void main(String[] args) {
	/*
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

	// index num:    01234567

		

		// charAt(index):

		

			//	System.out.println( str.charAt(8));

			

				char ch = str.charAt(4);

				

				System.out.println(ch);

				

			String str2 ="Mu htar";

			// index numbers: 0123456	

			

			System.out.println( str2.charAt(2) );

			

			

	  // length():

			

			String name ="Donald J Trump";

				int n = name.length()  ;  

				

				

	// concat():

			String s1 = "Cybertek";

			

				s1.concat(" School"); // attempt to modify String s1

				// returns a brand new String value

				

				

			System.out.println(s1);  //Cybertek,  String is immutable,  

					

			s1 = s1.concat(" School");

			System.out.println(s1);  // Cybertek School

			

	

	// toUpperCase():

			String N ="cybertek";

					N.toUpperCase();

				

				System.out.println(N); //cybertek,  String is immutable

			

				N = N.toUpperCase();

			System.out.println(N);  // CYBERTEK

			

			System.out.println(N);

			

			

	// toLowerCase():	

			String name1 = "ABDURAHMAN";

					name1.toLowerCase(); 

				System.out.println(name1); // ABDURAHMAN,   String is immutable

		

				name1 = name1.toLowerCase();

				System.out.println(name1);

			

	

	/*

	 charAt(index) ,  length(), concate(Str), toUpperCase(), toLowerCase()

	 */

			

				String a = "Batch 12 Javengers";  // 18 characters

				// index:   0123456789 .....	

				

					System.out.println(	a.charAt(9) );

					

						char ch1 = a.charAt(11);

				System.out.println(ch1);

				/*

				 charAt() methods extracts a specific character for them String,

				 and returns it as char value

				 */

				

				

				int Length = a.length();

				System.out.println(Length);

				

				int HighestInexNum = a.length()-1;

				System.out.println(HighestInexNum);

				/*

				 	length() method returns the total number of 

				 	character in the String as an int value

				 */

				

		

				String b="Cybertek";

					b.concat(" Batch12 Javengers"); 

						// "Cybertek Batch12 Javanger"

				

				System.out.println(b); //"Cybertek" ,   STring is immutable

				

				String c = b.concat(" Batch12 Javengers"); 

				System.out.println(c);

					

				b = b.concat(" Batch12 Javengers"); 

							// "Cybertek Batch12 Javengers"

				System.out.println(b);

				

				/*

				 concat() method concats the value to the variable' value 

				 and then returns a NEW String value

				 */

				

				

				String d = "book";

				

				System.out.println( d.toUpperCase() );

				

				System.out.println( d ); //book

				

					d =	d.toUpperCase();

					

					System.out.println(d);  // BOOK

			

			/*

			 toUpperCase() method converts the String value to 

			 upper case and returns it as a NEW String

			 

			 */

					

			

			String e ="JAVA IS FUN";

				 e.toLowerCase(); // "java is fun"

				System.out.println(e); // JAVA IS FUN

				

			String f = e.toLowerCase();

				e =  e.toLowerCase();

				System.out.println(e);

				System.out.println(f);

			

			/*

			 toLowerCase() method converts String' value to 

			 lower case and returns it as a NEW string value		

			 */

					

					

					

					

					

		

		

	}

}
