import java.util.Scanner;
import java.util.Random;

	public class Mysterygame{
	 public static void main (String[]args){
		Scanner input = new Scanner (System.in);
			Random rnumber = new Random();
	System.out.print ("enter any number between 0 and 10:");
	double number= input.nextDouble();
	double mysterynumber= rnumber.nextDouble(11);
	
	if (number < 0 || number > 10){
	System.out.print ("kindly pick between 0 and 10");
	}
	 else if (number == mysterynumber){
	System.out.print ("congratulation! You Win");
	} 
	 else if ( number > mysterynumber){
	 System.out.print ("too high,try again");
	}
	 else if (number < mysterynumber){
	System.out.print ("too low ,try again");
	}



}



}