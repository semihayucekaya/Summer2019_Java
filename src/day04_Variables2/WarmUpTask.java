package day04_Variables2;

public class WarmUpTask {
	
	/*
	 1.Cucumber      =>2.5$      =>float,double
	 2.Onion         =>1.5$      =>float,double
	 3.Green Pepper  =>2$        =>byte,short,int,long,float,double
	 4.Tomato        =>3$
	 5.Carrots       =>4$
	 
	 
	 
	 
	 
	 */
	public static void main(String[] args) {
		//Cucumber:
	//int Cucumber = 2.5; we can only assign whole numbers t int,byte,short
		
		float Cucumber =2.5f;//float cannot contain double
		double Cucumber2 =2.5f;//double can contain float
		double Cucumber3 =2.5;
		
		//Onion: 1.5
		float Onion =1.5F;
		double Onion2 =1.5;
		
		//Green Pepper:2$
		
		byte GreenPepper =2;
		short GreenPepper2 =2;
		int GreenPepper3 =2;
		long GreenPepper4=2l;
		float GreenPepper5 =2; //only time we add for F IS WHEN WE ARE ASSIGN DECIMAL
		double GreenPepper6 =2;
		System.out.println(GreenPepper);
		System.out.println(GreenPepper2);
		System.out.println(GreenPepper3);
		System.out.println(GreenPepper4);
		System.out.println(GreenPepper5); 
		System.out.println(GreenPepper6);   //double and float converts the whole number to decimal
		
		//Tomato:3$
		byte Tomato =  3;
		short Tomato2 = 3;
		int Tomato3 = 3;
		long Tomato4 = 3l;
		float Tomato5 = 3;
		double Tomato6 =3;
		System.out.println(Tomato);
		System.out.println(Tomato2);
		System.out.println(Tomato3);
		System.out.println(Tomato4);
		System.out.println(Tomato5);
		System.out.println(Tomato6);
		
		
		
		
	
	}

}
