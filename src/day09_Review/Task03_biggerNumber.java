package day09_Review;

public class Task03_biggerNumber {
	public static void main(String[] args) {
		int n1=45;
		int n2=20;
		int n3=80;
		boolean result1=n1>n2;
		boolean result2=n1>n3;
				
		if(result1 ==true&&result2==true){
			System.out.println("n1 is bigger");
		
			
		}
		
		boolean result3=n2>n1;
		boolean result4=n2>n3;
		if(result3==true&&result4==true) {
			System.out.println("n2 is bigger");
		}
		boolean result5=n3>n2;
		boolean result6=n3>n1;
		if(result5==true&&result6==true) {
		System.out.println("n3 is bigger");
		
	}
		
		
		
		
		
		//Muhtars way
		int num1=100, num2=500, num3=700;
		
		int max=0;
		//in order to num1 be the maximum:num1>num2 &&num1>num3
		/*
		in order to num2 be the maximum:num2>
		 */
		if(num1>num2&&num1>num3) {
			max=num1;
		}
		
		if(num2>num3&&num2>num1) {
			max=num2;
		}
		if(num3>num1&&num3>num2) {
			max=num3;
			
		}
		System.out.println("Maximum number between "+num1+","+num2+","+num3+" is"+max);
		
		System.out.println(max);
		
		
		//solution2
		if(num1>num2&&num1>num3) {
			System.out.println("Maximum number is "+ num1);
		}
		
		if(num3>num1&&num3>num2) {
			System.out.println("Maximum number is "+ num3);
			
		}
		
		if(num2>num1&&num2>num3) {
			System.out.println("Maximum number is "+ num2);
		}
		
		
		
		int N1=20, N2=90, N3=40;
		if(N1>N2&&N1>N3) {
			System.out.println(N1+" is the bigger number");
		}
		else if(N2>N1&&N2>N3) {
			System.out.println(N2+" is the bigger number");
		}
		else if(N3>N1&&N3>N2) {
			System.out.println(N3+" is the bigger number");
		}
		else if(N3==N2&&N3>N1) {
			System.out.println(N3+" AND "+N2+" ARE THE BIGGEST NUMBER");
		}
		else if(N3==N1&&N3>N2) {
			System.out.println(N3+" AND "+N1+ " are the bigger number");
		}
		
		else if(N2==N1&&N2>N3) {
			System.out.println(N2+" AND "+N1+" ARE THE BIGGER NUMBER");
		}
		else {
			System.out.println("all of them are equal");
		}
		
		

}
}
