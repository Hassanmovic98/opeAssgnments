import java.util.Scanner;
public class Opecalculator{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
	
	int sum = 0;
	int result = 0;
	int product = 0;
	 int choice = 1;
	while (true) {


            System.out.println("Hello,Welcome...");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("Select an option (0-4): ");
            
	
 	if (choice == 0) {
                System.out.println("calculator switch off");
                break;
            }


	 choice=input.nextInt();
		switch (choice){
			case 1: System.out.print ("enter first number");
				  int numberA = input.nextInt(); 
				  System.out.print ("enter second number");
				  int numberB = input.nextInt();
					sum = numberA + numberB;
				System.out.println ("Answer:" + sum);
				break;

			  
			
			case 2: System.out.print("enter first number");
					numberA = input.nextInt();
				 System.out.print ("enter second number");
					numberB = input.nextInt();
					   result = numberA - numberB;
				System.out.println ("Answer:" + result);
				 break;				 
				 
			case 3: System.out.print ("enter first number"); 
					numberA = input.nextInt();
				 System.out.print ("enter second number");
					numberB = input.nextInt();
					 product = numberA * numberB;
				 System.out.println ("Answer: "+ result);
				 break;

			case 4: System.out.print ("enter first number"); 
					numberA = input.nextInt();
				 System.out.print ("enter second number");
					numberB = input.nextInt();
					int Quotient = numberA / numberB;
				 System.out.println ("Answer:" + result);
				break;
				 }	

		}
	}


}





