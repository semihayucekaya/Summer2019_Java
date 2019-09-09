package day16_JavaRecap;

import java.util.Scanner;

public class Replit{
	public static void main(String[] args) {
		
		 Scanner scan=new Scanner(System.in);
	   	 System.out.println("Enter Item1, count and its price:");
			    String item1=scan.next();
			               
			      int count1=scan.nextInt();
			       double price1=scan.nextDouble();
			 
			    
			    System.out.println("Enter Item2, count and its price:");
			    String item2=scan.next();
			           scan.nextLine();
			   int count2=scan.nextInt();
			    double price2=scan.nextDouble();
			    
			    
			    System.out.println("Enter Item3, count and its price:");
			    String item3=scan.next();
			           scan.nextLine();    
			    int count3=scan.nextInt();
			    double price3=scan.nextDouble();
			    
			    
			 if(count1>0&&count2>0&&count3>0) {
				double totalPrice=price1+price2+price3;
				 System.out.println("Item1: "+item1+" Price: "+price1+", Item2: " +item2+ " Price: "+price2+ ", Item3: " + item3+ " Price: "+price3 );
				 System.out.println("Total price is "+totalPrice);
			 }
			 else if(count1>0&&count2>0&&count3==0) {
				 double totalPrice=price1+price2;
				 System.out.println("Item1: "+item1+" Price: "+price1+", Item2: "+ item2+  ", Price: "+price2);
				
				 System.out.println("Total price: "+totalPrice);
			 }
			 else if(count2>0&&count3>0&&count1==0) {
				 double totalPrice=price2+price3;
				 System.out.println("Item2: "+ item2+ " Price: "+price2+ ", Item3: " + item3 +" Price: "+price3 );
				 
				 System.out.println("Total price: "+totalPrice);  
			 }
			 else if(count1>0&&count3>0&&count2==0) {
				 double totalPrice=price1+price3;
				 System.out.println("Item1: "+item1+" Price: "+price1+", Item3: " + item3+" Price: "+price3 );
				
				 System.out.println("Total price: "+totalPrice);
			 }
		    		
			 
	    	
	    }
	    
	}


