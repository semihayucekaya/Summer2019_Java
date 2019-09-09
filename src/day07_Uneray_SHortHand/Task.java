package day07_Uneray_SHortHand;

public class Task {

	
public static void main(String[] args) {
	//TASK1:
	int x=2;
	int y=x++;
	System.out.println(y);//2
	System.out.println(x);
	
	x=2;
	System.out.println(x++);//2
	
	x=2;
	System.out.println(--x);//1
	
	int z=8;
	int n=z--;
	System.out.println(n--);//8
	
	int a=1;
	a =-a--+a++/-a--*--a;
	// -1+0/-1*-1==>-1
	
	System.out.println(a);//-1
	
	int f=50;
	f=--f+f++ + f-- + f++;
	//49 + 49 +50+49  ===>197
	
	System.out.println(f);//197
	
	int a1 =4;
	int b1=a1*4 -a1++;
	  //   16-4===>12
	System.out.println(b1);
	
	
	
	

}
}
