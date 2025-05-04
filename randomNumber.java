import java.util.Scanner;
import java.util.Random;

public class randomNumber{
public static void main (String[]args){

	Scanner input = new Scanner (System.in);
	Random rNumber = new Random();

int compNumber = rNumber.nextInt(3);	

System.out.print ("Scissor(0) rock(1) papper (2)");
int userNumber = input.nextInt();

if (userNumber == compNumber){
System.out.print("draw");
}
if (userNumber > compNumber){
System.out.print ("sorry try again,too High!");
}
if (userNumber < compNumber){
System.out.print ("sorry try again,too low");
}


 

}

}