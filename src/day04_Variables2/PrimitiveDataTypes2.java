package day04_Variables2;

public class PrimitiveDataTypes2 {
	
	/*
	 Primitives:byte,short,int,long,float,double,boolean,char
	 
	 boolean: takes all boolean expression(true or false), and returns either true or false
	 boolean:takes either true or false boolean expression
	 char:declared with in the single quote'' single charachter only
	 ''is a must when you give character as value
	 
	 
	 
	 
	 
	 */
	
	public static void main(String[] args) {
		//boolean result = each is flat
		//boolean num1 = 100; boolean only takes true or false results
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9>3; 
		 System.out.println(result);
		 System.out.println(result2);
		 System.out.println(result3);
		
		 //char:
		 char char1 = 'a';
		 System.out.println(char1);
		 
		 char char2 ='9';
		 char char3 ='#';
		 System.out.println("\n\n");
		//char with numbers
		 char char4 =67;  //only time we use ''for char is when we are declaring single character
		 System.out.println(char4); //prints the character as it is
		 
		 char char5 ='C';
		 System.out.println(char5);
		 
		 char char6 ='{';
		 System.out.println(char6);
		 
		 char char7 = 123;
		 System.out.println(char7);//prints the character that has the number of 123 from ASCII Table 
				 
		 //initialzing char to other prmitives;  byte,short,int,long.float.double
		 
		 char MyChar1 ='b';
		 int MyInt ='b';   //the number that represents b is initialized to the int
		 System.out.println(MyInt);    //98
		 
		// byte MyByte =MyChar;   //char's memory is 2 byte,byte's memory is 1 byte
		 byte MyByte2 ='b';//b's corresponding number is 98
		 
		 System.out.println(MyByte2);
		 
		// short ShortNum = MyChar1; //char memory is could be bigger than short,range is gtear
		 short ShortNum2 ='b'; //b's corresponding number is 98 from ASCII table
		 
		System.out.println(ShortNum2);
		
		long LongNum =MyChar1; //long's memory is 8 bytes
		long LongNum2 ='b'; //98
		System.out.println(LongNum);
		
		float floatNum =MyChar1;
		float floatNum2 ='b';
		
		System.out.println(floatNum2);
		
		double doubleNum =MyChar1;
		double doubleNum2 ='b';
		System.out.println(doubleNum2);
		
		// java is case sensitive
		
	char myCharValue =57;
	System.out.println(myCharValue);
	
	
	
		
		
		 
	
		 
	}

}
