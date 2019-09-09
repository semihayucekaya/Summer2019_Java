package day06_ArithmaticOperators;

public class PrimitivesCasting {
	
/*
 casting:converting larger primitive to smaller size
           datatype variablename =(datatype)value
           
           castings:Explicit&implicit
          explicit:is used when  we are converting from larger type to smaller type
          
           ex:inta=10
          byte b=(byte)a;
          
          
          implicit casting:automatic casting from smaller type into larger primitive type.
          
          ex:byte a= 10;
          int b =a; automatically casts
          
          int c =(int)d
          
          
          
          //Local Variables:variables are declared within the method
          
         
 primitives:byte,short,int,long,float,double
 
 	
 	
 	
 */
	
	public static void main(String[] args) {
		int a=128;
		//byte b=a;we cannot assign we have to cast
		
		byte b=(byte)a;//explicit casting
		System.out.println(b);
		
		double DecimalNumber=10.5;
		float FloatNumber =(float)DecimalNumber;   //double>float
		System.out.println(FloatNumber);
		
		float FloatNumber1=(int)DecimalNumber;
		System.out.println(FloatNumber);
		
		long LongNum =300L;
		//  int IntNum=(int)LongNum;
		int IntNum =(short)LongNum;
		
		System.out.println(IntNum);
		
		
		//implicit casting
		     byte ByteNum =100;
		     int IntNum2 =ByteNum;
		    
		    
		    //same with:
		    int IntNum3 =(int)ByteNum;
		    
		    
		short ShortNum =100;
		long LongNum2=ShortNum;
		//same with:
		long LongNum3 =(long)ShortNum;
		
		
		//explicit casting practice:
		       double LargestNumber =100.8765;
		       byte ByteValue=(byte)LargestNumber;//100
		       System.out.println(ByteValue);
		       
		      float FloatValue =(byte)LargestNumber;//100
		       
		       float FloatValue2 =(float)LargestNumber;
		       float FloatValue3=(int)LargestNumber;
		       float FloatValue4 =(short)LargestNumber;
		       float FloatValue5 =(long)LargestNumber;

		       System.out.println(FloatValue);//100
		       System.out.println(FloatValue2);//100.8765
		       System.out.println(FloatValue3);//100.0
		       System.out.println(FloatValue4);//100.0
		       System.out.println(FloatValue5);//100.0
		       
		       
		       float FloatNumber2=500.67F;
		       int myNumber =(short)FloatNumber2;
		            //500
		       int myNumber2 =(int)FloatNumber2;
		       System.out.println(myNumber);
		       
		/*       
		      int Num1=100;
		      int Num2=200;
		      int Num3=300;        ther are same writing way
		       
		 */
		       
		       int Num1=100, Num2=200,Num3=300;
		 //      System.out.println(num1+"\t"+num2+"\t");
		       
		       boolean result;
		     //  System.out.println(result);//we can't use this data type ,we didn't initialized yet.it gives compile error
		
		char Character1;
		//System.out.println(Character1);it is giving compile error.because we didn/t initialized.
		boolean result1,
		       result2,
		       result3;
		//System.out.println(result1);
		
		long LongNum9=400l;
				int IntNum9=(int)LongNum9;
				System.out.println(IntNum9);//400
				
				int IntNum10=(short)LongNum9;
				System.out.println(IntNum10);//400
				long IntNum11=(byte)LongNum9;
				 System.out.println(IntNum11);// -112
		
		
	}
	
	

}
