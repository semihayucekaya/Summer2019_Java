package day09_Review;

public class Task05_number {
public static void main(String[] args) {
	
    int num=-89;
    if(num>0) {
    	System.out.println("positive");
    }
    
    if(num<0) {
    	System.out.println("negative");
    }
    if(num==0) {
    	System.out.println("zero");
    	
    }
    
    
    //Muhtars way
    int number=300-400;
    String str="zero";
    if(number>0) {
    	str="positive";
    	System.out.println(number+" is "+ str);
    	
    }
    
    if(number<0) {
    str="negative";
    System.out.println(number+" is "+ str);
    }
   
    
    
    
    
    
    
    
    
    
    
}
}
