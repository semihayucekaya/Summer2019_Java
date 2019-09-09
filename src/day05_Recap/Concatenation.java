package day05_Recap;

public class Concatenation {
	
	/*
	 String:represents the sequences of characters,used for storing text
	        String values are surrendered by a double quote
	        
	        Concatenation: combining ,linking things together ====>creaters a 
	        achived by using + operator
	        we can concat any 
	       
	 */
	
	public static void main(String[] args) {
		
		String str ="any text goes here";
		System.out.println(str);
		
		String str2 ="1";
		System.out.println(str2);
		
		System.out.println("Hello Wworld");
		
		String Hello ="Hello World";
		System.out.println(Hello);
		
		String myName ="Cybertek" +" School";
		System.out.println(myName);
		
		String Year = "This is" + 2019;
		System.out.println(Year);
		
		//example:
		String name ="Muhtar";
				System.out.println("My Name is " + name);
				/*
				 cucumber is variable $
				 Tomato is variablename $
				 */
				
				int cucumber =3; int tomato=5;
				System.out.println("cucumber is "+cucumber+ '$');
		         System.out.println(" Tomato is "+"$"+tomato);
		         
		         String newStr ="100" +10;//10010
		         System.out.println(newStr);
		         
		         System.out.println(1+2+3);//6
		         System.out.println("1"+2+3);//123
		         
		         System.out.println("Batch 12"+1+2);//Batch1212
		         System.out.println(2+1-1+"4");//24
		         
		         
		         
		         System.out.println("Batch 12"+(1+2));//Batch123
		         
		         
		         System.out.println(1+"123"+4+5);//112345
		         
		         System.out.println("123"+(4+5));//1239
		         
		         
		         System.out.println(1+("1"+2));//112
		         
		         System.out.println(4+3-(9+3));//-5
		         
		         System.out.println((1+2)+"3");//33
		        // System.out.println((1+2)-"3"); it is not combine
		         
		         String BookName ="I like the book called \'Game of throne'\"";
		         System.out.println(BookName);
		         String MyInfo="My name is:\n\tCybertek";
		         System.out.println(MyInfo);
		         
		         System.out.println("3"+'3');
		         
		         System.out.println(12+'3');//if we concat char to number,representive number ofchar 63
		         
		         System.out.println('7'+3);
		                          //55+3
		         System.out.println('7'+"3");//73
		         
		         System.out.println('7'+9);//64
		         
		         System.out.println("8"+'9');//89
		         System.out.println(8+'9');  //65
		         
		         
		         
		   
		         
		         
	}
	
	

}
