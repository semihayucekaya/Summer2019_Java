package day13_Review;

public class SwitchStatement {
	
	

		/*

		 

		 switch(Expression){

		 		case caseValue:

		 					statements;

		 					break;

				

				default:

						statements;

						break;

		 

		 }
		 Java Reveiw day: Switch Statement
switch statement:
whenever you are writing code and checking if some variable equals 
different values:
1.  you can use multi-branch if
2.  switch statement
switch(Expression){
case CaseValue :
statement1;
statement2;
break;
case CaseValue :
statement1;
statement2;
break;
default:
statement1;
statement2;
break;
}
we can have as many cases as you want
caseValue MUSt match with the switch Expression' dataType
break statement:
used for exiting the switch statement.
if we don't have break statement, code will continue to 
run till next break statement or }.
after the break statement we cannot give any more 
statements, otherwise compiler will give errors.
case is similar with else-if.
default section is similar with else statemnt.
default section will get executed when there is no case that 
matches with the given expression.
default section can be placed any any where with in switch 
statement.
in switch statement, none of the blocks( cases and default ) or 
statements (break;) are mandatory.
switch statements expression MUSt be evaluate to a single value 
(either charcaters, digits, or text), therefore 4 dataTypes are not 
accepted: double, float, long, boolean







double a = 10L, 10D, 10D;
float a = 10F, 10f;
long a = 10, 10L, 10l;
boolean = true, false, 10 > 9
or logic in switch statement:
there is no direct way of using || operator
we can use multiple case blocks back to back.
char grade ='A';
if(grade == 'A' || grade =='B') {
System.out.println("Passed the exam");
} else {
System.out.println("Failed");
}
switch (grade) {
case 'A':
case 'B':
System.out.println("passed the exam");
break;
default:
System.out.println("failed the exam");
}

		 

		 */

		

		public static void main(String[] args) {

			

			int num = 5;

			

			switch( num ) {		

				case 7 :

					System.out.println("Sunday");

					break;  // case closed/dismissed

	//it's used for exiting switch statement after the case is executed

			

				default:

					System.out.println("Invalid Entry");

					System.out.println("Invalid");

					break; // exits the switch statement

			//	System.out.println("Wednesday");  

	// break statement means the closing statement, cannot give any more statements after the break

					

				case 5:

					System.out.println("Friday");

					break;		

			}

			

			

			String days ="Monday";

			

			switch ( days ) {

				default:

					System.out.println("Invalid");

					

				case "Monday": 

					System.out.println("Monday is fun day");	

					

				case "Tuesday":

					System.out.println("Tuesday is great day");	

					break;

			//		break;

					

				case "Wednesday":

					System.out.println("Wednesday is day off");								

			}

			

			

			long N1 = 10; // 10L

		//	switch (N1) { }

			

			float N2 =100; //100.0f

		//	switch(N2) { }

			

			double N3 = 10;

	//	switch (N3) {  }

			

			boolean N4 = true; //  9 < 8

		//	switch (N4) { }

			

			

			char ch = 'A';

			switch(ch) { }

		

			

			// or logic:

				char grade ='A';	

				if(grade == 'A' || grade =='B') {				

					System.out.println("Passed the exam");			

				} else {

					System.out.println("Failed");	

				}

			

				

				switch (grade) {

					case 'A':

					case 'B': 

						System.out.println("passed the exam");

						

					

					default:

						System.out.println("failed the exam");

				}

				

				

				String US ="USA";

				

				if( US == "USA" || US =="America" || US =="US") {

					System.out.println("American");

				} else {

					System.out.println("Not American");

				}

				

				switch ( US ) {

					case "US":

					case "USA":

					case "America":

						System.out.println("American");

						break;

						

					default:

						System.out.println("Not Amrican");

				}

				

				
float f1=124_56.02f;
float f2=f1+1024;
System.out.println(f2);
				

				

				

				

				

			

			

			

		}

		



	}
	
	


