import java.util.Scanner;
public class Minmaxinteger{
public static void main (String[] args){

Scanner input = new Scanner (System.in);

System.out.print ("Input first number");
int num1 =input.nextInt();

System.out.print ("Input second number");
int num2 =input.nextInt();




int sum = num1 + num2;
int product = (num1 * num2);
int average = (num1 + num2)/2;
int distance = num1 - num2;

System.out.printf("%d%n", sum);
System.out.printf("%d%n", product);
System.out.printf("%d%n", average);
System.out.printf("%d%n", distance);


if (num1 > num2){
System.out.printf("%d > %d%n",  num1, num2);
}
if (num2 > num1){
System.out.printf ("%d%n > %d%n", num1, num2);
}





}

}
