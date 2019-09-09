package day12_SwitchStatement;

public class WarmUp {
	public static void main(String[] args) {
		
	
	/*
	 Wwarm up
	 declare 3 numbers
	 if n1 and n2 are equal
	 =>n1&n2are equal
	 
	 if n2 and n3 are equal
	 =>n2&n3 are equal
	 
	 ifn3 and n1 are equal
	 ==>n3&n1 are equal
	 
	 if all equal===>all equal
	 
	 if none of them are equal===>none of them are equal
	 
	 Do not use single if statemen
	 */
	
	int n1=67, n2=67, n3=67;
	if(n1==n2&&n1!=n2) {
		System.out.println("n1 and n2 are equal");
	}	else if(n2==n3&&n2!=n1) {
		System.out.println("n1 and n2 are equal");
			
		}
	else if(n1==n3&n1!=n2) {
		System.out.println("n1 and n3 are equal");
	}
	else if(n1==n2&&n2==n3) {
		System.out.println("all equal");
	}
	else {
		System.out.println("non equal");
		
	
		
	}
	System.out.println("\n\n\n");
	//second
	int num1=5, num2=7, num3=5;
	if(num1==num2 && num2==num3) {
		System.out.println("all equal");
	} else {
		if(num1==num2) {
			System.out.println("num1 and num2 are equal");
		}
		else if(num2==num3) {
			System.out.println("num2 and num3 are equal");
		}
	
	else if(num1==num3) {
		System.out.println("num1 and num3 are equal");
	}
	else {
		System.out.println("none of them are equal");
	}
	}
	System.out.println("\n\n");
	
	//third:
	int A=30, B=20, C=30;
	
	if(A==B&&B==C) {
		System.out.println("All are equal");
		
	}else {
		if(A==C) {
			System.out.println("A and C are equal");
		}
		else if(A==B) {
			System.out.println("A and B are equal");
		}
		else if(C==B) {
			System.out.println("B and C are equal");
		}
		else {
			System.out.println("None of them are equal");
		}
		
	}
	System.out.println("\n\n");
	/*
	 60~70==>D
	 70~80==>C
	 80~90==>B
	 90~100==>A
	 */
	int grade=85;
	if(grade>=0&&grade<=100) {
	if(grade>=60) {
		if(grade>=90) {
			System.out.println("A");
		}
		else if(grade>=80) {
			System.out.println("B");
		}
		else if(grade>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}
	else {
		System.out.println("Failed");
	}
	
	}
	else {
		System.out.println("Invalid Entry");
	}
	
	
	
		
	}

}
