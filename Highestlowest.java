import java.util.Scanner;
public class Highestlowest{
public static void main (String[]args){
	Scanner input = new Scanner(System.in);

int highnumber = 1000000;
int lownumber = 1;

int counter = 11;

while (counter <= 11){
System.out.print ("enter any number");
int number = input.nextInt();
highnumber = highnumber + number;
counter= counter =0;
}
System.out.print ("The numbers are;"+ highnumber + lownumber);




}


}