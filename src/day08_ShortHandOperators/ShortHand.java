package day08_ShortHandOperators;

public class ShortHand {
	/*
	 
	 +=addition assignment         x+=y===>x=x+y 
	 -=subtraction assignment      x-=y===>x=x-y
	 *=multiplication assignment   x*=y===>x=x*y
	 /:division assignment         x/=y===>x=x/y
	 %:remainder assignment         x%=y===>x=x%y
	 
	 
	 
	 */

	 public static void main(String[] args) {
		
		 int a=9;
		// a=a+3;//12
		 a+=3;
		 System.out.println(a);//12
		 
		 int b=a+=5;
		         //12+5===>17   a==17
		 System.out.println(b);
		 
		 int c= a+=b;
		       //17+=17     a=34,   c=34,   b=17
		 System.out.println(c);
		 
		 int d =a+=c;    //a=68, d=68,   c=34 , b=17
		 //     34+=34
		 
		 int e=(d+=b)*2;
				 //(68+17 )*2    
		 System.out.println(e);  //d=85,   b=17,  e=170
		 
		int f=b+=d*2;
		//b+=170
		
		System.out.println(f);
		
		//-=:
		int g= 101;
		int h=g-=1;
		System.out.println(h  );//g=100 h=100
		
		int i=g+=h+5;
		   //100+=100+5==205
		
		System.out.println(i);
		
		int j=h+=g%i;
		     //100+=205%205  h=100,j=100
		   // 100+=0
		
		System.out.println(j);
		
		int k=j-=h*2%5;
		    //100=200%5
		    //100-0===>100
		System.out.println(k);   //j=100
		
		
		int A=100;
		A*=200;
		System.out.println(A);//A=20000
		
		int B=100;
		B*=100/10;
		System.out.println(B);//1000
		
		B*=B-1000;
		//System.out.println(B);//0
		
		
		//  division:
		
		int C=1000;
		    C/=5;
		   // System.out.println(C);//C=200
		    
		    int D=10;
		     //  C/=D-10;
		     //  System.out.println(D);   DENIMINATOR CAN'T BE ZERO
		       C/=D+10;
		       //  200/20===>10
		     //  System.out.println(C);
		       
		       //%:REMAINDER CANNOT BE NEGATIVE
		       
		       int Z=10%3; //REMAINDER :1
		       
		      int E=10;
		      E%=2;
		      System.out.println(E);
		      int F=100;
		      F%=2;
		      System.out.println(F);  //REMAINDER IS ZERO IT MEANS EVEN NUMBER
		      
		      System.out.println(10.5%3);//1.5
		       System.out.println(10.0%3);//1.0
		       
		       
		       int J=300;
		       int K=10;
		       J+=J%=K;  //300
		       System.out.println(J);
		       
		       
		      
		      
		
	}
}
