package day14_Scanner;

public class Ternary {
	public static void main(String[] args) {
		/*
		int num =0;
		if(true) {
			num=100;
		}else {
			num=50;
		}
		System.out.println(num);
		
		/*
		 if(condition)===>(condition)?
		 else         ===> :
		 else if (condition)     ===>:(condition)?
		 
		 Topic: Ternary and Scanner
Ternary:
int num=0;
if(true){
num=100.
}else{
num=200;
}
converting to ternary:
int num2 = true ? 100 : 200;
if(condition)      ==> (condition)?
else               ==>      :
else if(condition) ==>  :(condition)?
ternary MUST returns a value, and the value MUST be initialized to 
a variable or printed out
total numbers of  ? and : has to be equal.
in ternary's body we can only give a single value
() is not required in ternary
	
	 */
		
	/*	
	int num=0;	
	if(true) {
		num=100;
	}else {
		num=50;
	}
	System.out.println(num);
	*/
		int num=0;
	num=	(true)? 100 : 50;
	System.out.println(num);
		
	
	int n=(false)?100:50;
	int y=false?100:50;
	System.out.println(n);
	System.out.println(y);
	
	String Schoolname="";
	boolean Batch12=true;
	if(Batch12) {
		Schoolname="Cybertek";
	}else {
		Schoolname="Invalid";
	}
		
	
System.out.println(	Batch12 ?"Cybertek":"Invalid");
String BestScchool=Batch12?"Cybertek":"invalid";

double d=10;

if(true) {
	d=10.5;
	
}
	
	//	double z =true?10.5;//it is giving compile error ,in ternary,total number of ? and : has to be equal
		
		double interestRate =0;
		boolean GoodCredit= true;
	interestRate=	( GoodCredit==true )?0.5:0.9;
	System.out.println(interestRate);
	
	
	
	byte grade=60;
	boolean Passed= grade>=60 ?true:false;
	System.out.println(Passed);
	
	
	char FinalGrade='C';
	String Group="";
	/*
	if(FinalGrade=='A') {
		Group="Early Bird";
		
		
	}else if(FinalGrade=='B') {
		Group="Group1";
		
	}else if(FinalGrade=='C'{
	Group="Group2"
	}else{
		Group="After Group 1";
	}
	*/
		
Group=	(FinalGrade=='A')	?"Early bird":(FinalGrade=='B')?"Group 1":"After Group 1";
		System.out.println(Group);
		
		
		Group=(FinalGrade=='A')?"Early Bird":(FinalGrade=='B')?"Group1":(FinalGrade=='C')?"Group2":"After Group 1";
		System.out.println(Group);
		
		
		int score=90;
		char Finals=' ';
		String grupName="";
		
		if(score>=90&&score<=100) 
			Finals='A';
		else if(score>= 80&&score<=89)
			Finals='B';
		else if(score>=70&&score<=79)
		Finals='C';
		else if(score>=60&&score<=69)
			Finals='D';
		else if(score>=0&&score<=59)
			Finals='F';
		else
			Finals=' ';
			
		 Finals=(score>=90&&score<=100)?'A'
				 :(score>=80&&score<=89)?'B'
						 :(score>=70&&score<79)?'C'
								 :(score>=60&&score<=69)?'D'
										 :(score>=0&&score<=59)?'F'
		                                   :' ';
		
		System.out.println(Finals);
		
		int n1=200, n2=400, n3=100;
		int max =(n1>n2&&n1>n3)? n1 :(n2>n1 && n2>n3)?n2:n3;
		System.out.println(max);
				int i=10;
				int j=20;
				int k=j+=i/5;
				System.out.println(i+" "+j+" "+k);
		
	}

}


