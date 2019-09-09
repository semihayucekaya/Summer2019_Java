package day08_ShortHandOperators;

public class LogicalOperators {
	public static void main(String[] args) {
		/*
		 &&: and logic   true&true,if both conditionals are true.,other wise ===>false
		 ||:or logic     true||false ====>true
		                 true||true ====>true
		                 false||false==>false
		 */
		
		//&&:
		boolean ResultA=9 ==0 && "Muhtar"=="good";
		                //false    false=======>false
		System.out.println(ResultA);
		
		boolean ResultB=8>5 && 7==(8-2+1);
		System.out.println(ResultB);
		
		boolean ResultC =!false==true && !false==!(!true);
		System.out.println(ResultC);//TRUE
		
		
		
		//||:
		   boolean A="Monday" =="Fun-day" ||6==6;
		            //false ||true ===>true
		   System.out.println(A);
		   
		   
		   boolean B=true ||false; //===>true
		    System.out.println(B);
		    
		    boolean C=!(8>5) ||!("Today" !="friday");
		            //  false ||false  ==>false
		    System.out.println(C);
		    
		    
		  // || &&:
		     boolean D= true &&true ||false;
		                //true||false===>true
		     System.out.println(D);//TRUE
		     
		     boolean E =!(7>5 && 6 !=5) && (9>5 || 10>4);
		               //!(TRUE&&TRUE)&&(TRUE||TRUE)
		               //FALSE&&TRUE===>FALSE
		     System.out.println(E);
		     
		     
		
	}
	
	
		
		
	}

	
	

