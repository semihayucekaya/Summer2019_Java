package day05_Recap;

public class Primitives_Review {
	
	/*
	 Primitives:
	 byte:only takes whole number
	 short:only takes whole number
	 int:only takes whole number(used more often)
	 long:only takes whole number
	 float:can take decimals (must have F or f at the end)
	 double:can take decimals(used more often)
	 boolean:true or false boolean expressions
	 char:character within single quote''also takes number
	 
	 

	 */
	
	public static void main(String[] args) {
		byte bNum = 127;
		//byte range :-128 to 127
	//	byte bNum2 =126.5  //byte takes only whole number
		
		short sNum2 =1000;
		//short sNum3 =126.5;// compile error short only whole number
		
		//bNum =sNum; we cannot assign ,short is greater than byte
		
		sNum2 =bNum;//sNum2=127
		System.out.println(sNum2);//100
		
		
		
		int intNum =100;
		//int intNum2 =100.5;//int takes whole number
		System.out.println(intNum);
		
		//byte ByteNum =intNum;//int>byte
		//short ShortNum=intNum;//int>short
		short ShortNum2 =105;
		intNum =ShortNum2;
		System.out.println(intNum);//105
		
		
		//long
		
		
		long LongNum =100l;
		long LongNum2 =100L;
		
		//byte ByteNum3 =LongNum;//long>byte
		//short ShortNum3 =100l;//long>short
		//int IntNum3 =100L;//long>int
		
		byte a=10;
		int b=30;
		short c =40;
		
		long LongNumber =a;
		long LongNumber2=b;
		long LongNumber3=c;
		
		
		
		
		//float:
		
		//float floatNumber =10.5; //when declare decimals number we have to use f or F
		
		float floatNumber2=10.5f;
		
		short a1=10; byte b1=20; long c1=30; int d1=40;
		
		float Floats=a1;
		float Floats2=b1;
		float Floats3=c1;
		
		System.out.println(Floats);//10.0
		
		
		
		//double:takes all the whole and decimal numbers 
		double DoubleNum1 =10L; //long is smaller than double
		double DoubleNum2=10.5F;
		
		
		//boolean:
		boolean result=true;
		boolean result2=false;
		
		
		boolean result3=9>10;
		
		
		//char:takes character,char values must be declared within single letter
		
		
		char character1='A';
		System.out.println(character1);
		//char character2=A;
	//	char character3='AA'//only a single character can be declared
		//ALL THE characters have representive number:
		
		char charvalue=98;
		System.out.println(charvalue);//character
		
		int num3='B';
				System.out.println(num3);//66
		
		float fnum='B';
		System.out.println(fnum);//66.0
		
		byte bValue='B';
		System.out.println(bValue);
		
		
		
		//float:
		float fnum2=5.5f;//5.5
		float fnum3=5;//5
		
		
		char specialCharacter= 38;
		System.out.println(specialCharacter);
		
		//practices:
		
		/*
		 8  ,  9,         #,    @,       8.5,    5.5F,      128,     40000,        9>10,        true ,       false
		 */
		
		
		//8:
		byte Bnum=8;    short SNum=8;int INum=8;  long LNum=8;    float FNum=8;    double DNum=8; char character='8';
		System.out.println(Bnum);//8
		System.out.println(SNum);//8
		System.out.println(LNum);
		System.out.println(FNum);
		System.out.println(DNum);
		System.out.println(character);
		
		
		//# @&:
		char character2='#';
		char character3='@';
		System.out.println(character2);
		System.out.println(character3);
		
		
		
		
		
		
		
		
		
	}

}
