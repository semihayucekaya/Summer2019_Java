package day15_ScannerString;

import java.util.Scanner;

public class Task02 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter num1");
	double n1= input.nextDouble();
	
	System.out.println("Enter num2");
	double n2=input.nextDouble();
	
	System.out.println("Enter num3");
	double n3=input.nextDouble();
	
	double Largest=(n1>n2&&n1>n3)?n1:(n2>n1&&n2>n3)?n2:n3;
	
	
	
	
	
}
}
