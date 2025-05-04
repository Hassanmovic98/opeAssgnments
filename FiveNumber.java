import java.util.Scanner;
public class  FiveNumber{
public static void main (String[]args){

Scanner input = new Scanner(System.in);

double even = 0; 
double evenCounter = 0;


System.out.print ("Enter the number");
double  first = input.nextInt();

System.out.print ("Enter the number");
double second = input.nextInt();

System.out.print ("Enter the number");
double third = input.nextInt();

System.out.print ("Enter the number");
double fourth = input.nextInt();

System.out.print ("Enter the number");
double fifth = input.nextInt(); 


if (first % 2 == 0){
even = even + first;
 evenCounter = evenCounter + 1;
 }
if (second % 2 == 0){
even = even + second;
evenCounter = evenCounter + 1;
}
if (third % 2 == 0){
even = even + third;
evenCounter = evenCounter + 1;
}
if (fourth % 2 == 0){
even = even + fourth;
evenCounter = evenCounter + 1;
}
if (fifth % 2 == 0){
even = even + fifth;
evenCounter = evenCounter + 1;
}


if (first > second && first > third && first> fourth && first > fifth){
System.out.println (first + " is largest number");
}
if (second >first && second > third && second > fourth && second > fifth){
System.out.println (second +" is the largest number");
}
if (third > first && third > second && third > fourth && third > fifth){
System.out.println (third + " is the largest number");
}
if (fourth > first && fourth > second && fourth > third && fourth > fifth){
System.out.println (fourth +" is the largest number");
}
if (fifth > first && fifth > second && fifth > third && fifth> fourth){
System.out.println (fifth + " is the largest number");
}

if (first < second && first < third && first < fourth && first < fifth){
System.out.println (first +"is the lowest number");
}
if (second < first && second < third && second < fourth && second < fifth){
System.out.println (second +"is the lowest number");
}
if (third < first &&  third < second && third < fourth && third < fifth){
System.out.println (third +"is the lowest number");
}
if (fourth < first && fourth < second && fourth < third && fourth < fifth){
System.out.println (fourth +"is the lowest number");
}
if (fifth < first && fifth < second && fifth < third && fifth < fourth){
System.out.println (fifth +"is the lowest number");
}

double average = even /evenCounter;
System.out.printf ("the average of even %.1f", average );


















}

}

