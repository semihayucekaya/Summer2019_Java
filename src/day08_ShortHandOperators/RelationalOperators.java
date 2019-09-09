package day08_ShortHandOperators;

public class RelationalOperators {
	/*
	 relational operators:
	 >  :greater than
	 >= :greater than is equal
	 <  :less than
	 <= :less than or equal
	 == :equal
	 != :not equal
	 =:assign
	 ! :exclamation mark in java means the logical opposite
	 
	 */
	public static void main(String[] args) {
		System.out.println(10>9);  //
		boolean resultA=10>9;
		System.out.println(resultA);
		
		System.out.println(10>=9);//TRUE
		boolean resultB=10>=9;
		System.out.println(resultB);//TRUE
		
		boolean resultC=10<=9;
		System.out.println(resultC);//FALSE
		
		boolean resultD=1100<1200;
		System.out.println(resultD);//TRUE
		
		boolean resultE =1000<1000;
		System.out.println(resultE);//FALSE
		
		boolean resultF=1000<=1000;
		System.out.println(resultF);//true
		
		//==
		
		boolean resultG=19==19;
		System.out.println(resultG);//TRUE
		
		
		// !
		boolean resultH=20!=20;
		System.out.println(resultH);//FALSE
		
		boolean A=false !=true;
		System.out.println(A);//TRUE
		
		boolean B=!true;//false
		
		/*
		in java 
		     true ==true,false==false
		     !false equal to true,!true equal to false
		     
		     so therefore:
		       !false does not equal !true
		       and
		       true equal !false.
		 */
		
		boolean C=!false !=!true;
		System.out.println(C);
		
		boolean D=true==!false;
		System.out.println(D);
		
		boolean E=!(!true);
		System.out.println(E);//TRUE
		
		boolean F=10>9 ==9<10;
		      // true==true====>true
		System.out.println(F);
		
		boolean h="BATCH12"=="BATCH13";
		System.out.println(h);//false
		
		System.out.println("cybertek"!="club");//true
		 
		
		int z=198;
	     System.out.println(z%=2);//0
	     
	     byte ByteNum=30;
	    // int Inum=Inum+=ByteNum; we can initilazed inum
	    // ,we must give value to local variables
	     
	     String str;
	   // System.out.println(str);
	     
		
		
	}

}
