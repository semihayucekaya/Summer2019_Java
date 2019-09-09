package day08_ShortHandOperators;

public class Task {
	
	 public static void main(String[] args) {
		//TASK:
		 int ApplesCount = 20;
		 int OrangesCount =30;
		 int PearsCount   =30;
		 
		 boolean comp =ApplesCount <OrangesCount || OrangesCount>=PearsCount;
		             //true||true===>true
		 System.out.println(comp);
		 
		 //TASK2
		   String OutsideWweather;
		   int Degree;
		  String  OutsideWeather ="Shinny";
		   Degree =70;
		   boolean comp2=(!(OutsideWeather=="Rainy"||Degree==70));
		                  //false
		   System.out.println(comp2);
		   
		   
		   //Task3
		   int b =2;
		   boolean res=++b ==2 ||--b==2&&--b==2;
		             //  false || true&&  false===>false
		   
		  System.out.println(res);
		  
		  boolean x =true, z =true;
		  int y=20;
		  x =(y!=10)||(z=false);
		   //  true||false ===>true
		  System.out.println(x);
		   
	}

}
