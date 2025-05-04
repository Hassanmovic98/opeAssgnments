import java.util.Scanner; 

public class Factorialvalue {
public static void main (String[] args){
	Scanner input = new Scanner (System.in);

System.out.print ("enter a number");
int number = input.nextInt();

long factorial = 1;
if (number < 0){
System.out.println("not a nagative number");
}
else{
for (int i =1; i <= number; i++){
	factorial*=i;
}
System.out.println ("Factorial of " + "number"+ factorial);
}


}

} 