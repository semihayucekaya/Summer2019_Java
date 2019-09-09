package day07_Uneray_SHortHand;

public class UnerayOperators {
	
	public static void main(String[] args) {
		/*
		 +:positive
		 -:negative
		 ++:increment
		 --:decrement
		 
		 
		 
		 
		  */
		int a=10;
		int b=-10;
		System.out.println(b);//-10
		
		int c= +b; //+(-10)
		System.out.println(c);//-10
		
		int d=-c; //-(-10)
		System.out.println(d);//10
		
		int f=-(10);
		System.out.println(f);//-10
		
		
	//increment:increases the value by 1.
		       //increment are :
		           /*
	                       1.pre increment:operator is placed before the value
	                       ++a;the variable will be incremented by 1 immidetly
	                       
	                       2.post increment:operator is placed after the variable
	                       a++;it will pass the current value first,then it will increase by 1.
	                       
	                       
		            */
	//decrement:decreases the value by 1.
		
		//increment:
		//a pre increment;operator is placed before the variable
		      int num1=100;
		      ++num1;
		      
		      System.out.println(num1);//101 pre increment
		      
		      
		      System.out.println(++num1);//num1+1  ,102
		      
	//post increment:operator is placed after the variable:
		      
		   int IntNum =100;
		  // System.out.println(++IntNum);//101
		   System.out.println(IntNum ++);  //100
		   System.out.println(IntNum);//101
		   
		   
		   int IntNum2 =IntNum++ ; //IntNum2 =
		          //IntNum2=101
		   System.out.println(IntNum2);//101
		   System.out.println(IntNum);//102
		   
		   
		   int x=100;
		   int y=x++-1;
		      //y=100-1;
		   System.out.println(y);//99
		   
		   //decrement:decreses the value by 1 
		     //pre-decrement:operator is placed before the variable
		     //decreases the value by 1 immiditaly
		   
		   
		   int Z =100;
		   
		   System.out.println(--Z);//99
		   
		   
		   //Post-decrement:operator is placed after the variable
		   //it will pass the current value and then decrease
		   
		   int Y =95;
		    System.out.println(Y--);//95
		    System.out.println(Y);//94
		    
		    int T=25;
		    System.out.println(++T);//26
		    System.out.println(--T);//25
		    
		    
		    int P=50;
		    P =--P + P++ +      P-- +   P++;
		    //pre49   post 49   post50    post49
		    
		    
		    System.out.println(P);//197
		    
		    short Snum =4;
		    int R =Snum*4  - Snum--;
		            //16-    4   ===12
		    System.out.println(R);//12
		    System.out.println(Snum);//3
		    
		    
		    int W =1;
		    W= -W-- + W++ /-W--* --W;
		     //POST POST    POST   PRE  
	         //-1   +0  / -1 *  -1	 
		    
		    System.out.println(W);//-1
		    
		    //Task:
		    int gallon =200;
		    double liters= gallon*3.785;
		    System.out.println(liters);
		    System.out.println(gallon+" gallons equal "+ liters+" liters");
		    
		    
		    double liters2=4.5;
		    double gallon2= liters2/3.785;
		    System.out.println(gallon2);
		    System.out.println(liters2+" liter equal to "+gallon2+" gallon.");
		    
		    
		   
		
		
		
		
	}

}
