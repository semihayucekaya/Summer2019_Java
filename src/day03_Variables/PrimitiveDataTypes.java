
package day03_Variables;

public class PrimitiveDataTypes {
	
	/*
	 byte;we can assign integers that's no decimal                     -128<=byte<=127
	 variable name rules:
	 1.Must start with alphabets a-z/A-Z
	 2.cannot contain any special charachters other than_ and $
	 3.variable name must be unique
	 4.cannot be java reserved words
	 
	 
	 short:we can assign whole number .Must be in -32768<=short<=32767
	 
	 int:we can assign whole numbers.must be in -1247483648<=int<=21474883647
	 
	 long:we can only assign whole number ,AT the end of value we can give l or L
	 
	 byte<short<int<long
	 
	 small one can be assigned to larger one
	  float:we can assign decimals(MUST HAVE F letter or f)
	  
	  the variables datatype must be larger in order to containanother datatype
	  double(used more often):we can assign decimals
	 
	float<double
	 
	 
	 */
public static void main(String[] args) {
	byte length =3 ;
	System.out.println(length);
	byte width = 4;
	System.out.println(width);
	
	//byte num_and$ = 90 ;
	//byte length =6; variable name is not unique
	//byte public= 199; variable names cannot be java  reserved words
	//byte myNum1 = -129; out of byte range
	//byte myNum2 = 126;
	
	
	short num2 =100;
	//short num3 =100000;out of range
	
	int num4 =-100000;
	//100,000,000
	
	int num5 = 1_000_000_00;//easier to read 
	
	long longNumber =10l;
	//int intNumber =10;
	byte byteNumber =10;
	short shortNumber =byteNumber;
	
	short shortNumber2 =18;
	//byte byteNumber2=shortNumber2;  short is greater than byte
	
	int intNumber =-19876;
	long longNumber2 =intNumber;  //long is greater than int
	//left side of the =has to be equal or greater than
	
	short shortNumber3=-30000;
	short shortNumber4 =shortNumber3;
	System.out.println(shortNumber4);
	
	//int exampleNum1 =10.5;
	float exampleNum2 =10.5f;
	float exampleNum3 =20.5F;
	
	double doubleNumber = 10.5;
	
	double doubleNumber2 =30.5;
	//float floatNumber =doubleNumber2; 
	
	byte bNum =10;
	short sNum=20;
	int iNum=30;
	long lNum=40;
	System.out.println(bNum);
	
	float fNum =bNum;
	float fNum2=sNum;
	float fNum3 =iNum;
	float fNum4 =lNum;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
