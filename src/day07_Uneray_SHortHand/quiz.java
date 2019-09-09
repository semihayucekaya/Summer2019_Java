package day07_Uneray_SHortHand;

public class quiz {
	public static void main(String[] args) {
		
		//question 01:
	    int a=30;
	  //  int b=(long)a;
	    int b=(int)a;
	    System.out.println(b);//30
	    
	    //question 03:
	      System.out.println("Result A"+0+1);  //ResultA01
	      System.out.println("Result B"+(1)+(2));//ResultB12
	      System.out.println("Result B"+(1+2));//ResultB3
	      
	    //question 04: 
	       System.out.println("5+2="+3+4);//5+2=34
	       System.out.println("5+2="+(3+4));//5+2=7
	    //question05:
	       float FloatNum=100.9876532f;
	       short ShortNum=(byte)FloatNum;//100    float is larger than short
	       System.out.println(ShortNum);
		
		//Question06:
	    //   byte a=200;//200 is out of range
	      // byte BNum=200;
	      // int b=2;
	     //  System.out.println(a+b-a*b+a/b);//it  gives compile error
	       
	       //Question 7:
	       System.out.println((3+2)*2/3%2);//1
	                           //10/3%2
                               //3%2===>1	
	       
	       //Question8:
	      // int num1=9, num2=0, num3=num1/num2;
	       //System.out.println(num3);//it is giving error because dive bye zero ****compilation error java gives error it is not running
	                                                                             //***error message java runs but it gives error message at console
	       
	       //Question9:
	       
	       long Lnum =3_000L;
	       double Dnum =(float)Lnum;   //narrowing
	       int Inum=(short)Dnum; //int,short,byte
	       
	       System.out.println(Inum%1000);//0
	       
	       //Question10:
	       double  result1 =10/3;
	       //result1=3;===>3.0
	       System.out.println(result1);//3.0
	       
	       //Question11:
	       System.out.println(10.0/3);//3.333333333
	       
	       //Question12:
	          String str="10.5";  //string text
	         // int num=str;   we cannot assign
	         // int num=(int)str; it is giving compile error because string is not primitive data type
	          
	          //Question 13:
	          int I1=10, I2=20, I3=30;
	          I1=I1%5;//0
	          I2=I2%5;//0
	          I3=I3%5;//0
	          
	          System.out.println(I1+"\t"+I2+"\t"+I3);
	          
	          System.out.println(10/3f);//3.3333
	          System.out.println(10/3D);//3.333333
	          System.out.println(10/3L);//3
	          
	          
	       
		
	}
	
	
	

		}               


