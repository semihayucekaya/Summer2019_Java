package day09_Review;

public class Task02_Time {
    public static void main(String[] args) {
		int hour=11;
		int minute=45;
		int second=37;
		
		
		
		
		if(hour>=12) {
			System.out.println(hour+":"+minute+":"+second+" PM");
		}
		if (hour<12) {
			System.out.println(hour+":"+minute+":"+second+" AM");
		}
		
		
		//Muhtar's Way
		
		int hours=12;
		int minutes=45;
		int seconds=30;
		String amOrPm="AM";  
				System.out.println(hours+":"+minutes+":"+seconds+" "+amOrPm);
		
		
		
		
		
		
	}
}
