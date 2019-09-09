package day12_SwitchStatement;

public class SwitchStatement {
	/*
	 Swicth statement:
            switch(Expression){
                case CaseVale1: 
                        statements1
                        statements2
                        break;

                case CaseVale1: 
                        statements1
                        statements2
                        break;
                        
                default: 
                    statement;
                    break;
            }

                we can have as many cases as we want in switch statement

                We can only have one default section in a switch statetemnt

        break: closing statement => }
            exits the switch statement

 if there no break in swicth:

 







	 
	 
	 */
	
	public static void main(String[] args) {
		      
	
	
	int score=1;
	if(score==1) {//must give boolean expression
		System.out.println("1");
	}
	else if(score ==2) {
		System.out.println("2");
	} else {
		System.out.println("invalid");
	}
	 switch (score) {
	   case 1:
		   System.out.println("1");
		   break;
	   case 2:
		   System.out.println("2");
		   break;
		   
	default:
		System.out.println("Invalid");
		break;
		
		   
	 }
	 
	 String str="Java";
	 switch (str) {
	
	    
	 case "C#":
		 System.out.println("C# programming language");
		 break;
	 case "Python":
		 System.out.println("python programming language");
	 default:System.out.println("Invalid");//else 
	 }
	 
	 
	 
	 char grade ='A';
	 switch (grade) {
	 
	 case 'B':
		 System.out.println("Passed with B");
		 
	 case'C':
		 System.out.println("Passed with A");
	 default:
		 System.out.println("Failed");
		 
		 
	 }//switch statement only exits when there is break statement
	 
	




		
		
	}
	
	}


