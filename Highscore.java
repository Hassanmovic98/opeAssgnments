import java.util.Scanner;

    public class Highscore{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);

	String highestScore = "";
	int largestScore = -234567890;


	System.out.print ("enter number of students: ");
	int number  = input.nextInt(); 

	int largestNumber = 0;

		for(int counter =0; counter <= number; counter = counter + 1){

			System.out.print ("enter more names: ");
			
	
			String name = input.next();
			System.out.print ("score");
			int score= input.nextInt();

			if (score > largestNumber){
			largestNumber = score; 
			highestScore = name;
			}
	}

		 if (number == 0){
		System.out.print("wrong number");
	}



	System.out.println ("The highestScore: " + largestNumber);

	System.out.println ( "student with highestScore: "+ highestScore);



}


}