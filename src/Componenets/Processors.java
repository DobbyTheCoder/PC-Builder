package Componenets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Processors{
	
	static int a;
	
	   public void choseP() throws Exception{
		
		   intel_processor obj = new intel_processor();

		if(a == 3){
			
			System.out.println("\nToo many wrong inputs, please restart!");
			System.exit(0);
			
		}
		
		System.out.println("What processor do you prefer?\n1. Intel\n2. AMD\nEnter you choice( in resp. digits):");
		
		Scanner ch1 = new Scanner(System.in);
		
		try{
		int prch = ch1.nextInt();
		
		if (prch == 1)
			obj.choice();
		
		else if(prch == 2)
			obj.choice();
		
		else{
			
			System.out.println("Wrong input, try again\n");
			a++;
			this.choseP();
			
			
		} }catch(InputMismatchException e){
			
			System.out.println("Exception caught! Please enter a number as input.\n");
			this.choseP();
		
		} finally{
			ch1.close();
		}
			
	}    
	
}
