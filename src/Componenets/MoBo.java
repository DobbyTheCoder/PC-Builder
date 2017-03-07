package Componenets;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MoBo /*extends intel_processor */{

	//lga 1155, priority 1
	public String i1155 = "Intel Desktop Board Media Series LGA 1155 BOXDH67BLB3";
			
	//lga 1155, priority 2
	public String i1155s = "Intel Z77 Extreme Series DZ77GA-70K ATX Motherboard";

	//lga 1150, priority 1
	public String i1150 = "Gigabyte LGA 1150 B85 (GA-B85M-DS3H-A)";
	
	//lga 1150, priority 2
	public String i1150s = "Gigabyte GA-Z97X-GAMING 7 Z97 ATX Motherboard";
	
	//lga 1150, priority 3
	public String i1150k = "MSI Z97 Intel LGA 1150";
	
	//lga 1151, priority 1
	public String i1151 = "GIGABYTE LGA1151 Intel H110 Micro ATX GA-H110M-A";
	
	//lga 1151, priority 2
	public String i1151s = "MSI Gaming Intel Skylake B150";
	
	//lga 1151, priority 3
	public String i1151k = "Asus Z170-K Desktop Motherboard";
	
	//lga 1151, priority 4
	public String i1151kk = "MSI Extreme Gaming Intel X99 (X99A SLI Plus)";
	
	public String rec;
	int ab;
	
	public void rec(String choice, int l , int pr){
			
		String newl = choice;
		int lc = l;
		int prc = pr;
		
		Scanner newC = new Scanner(System.in);
		
		if(l == 1151 && pr == 4){
		
			
	    System.out.println("Do you need a higher end motherboard with this or a med end motherboard?\n"
				+"1 for high, 2 for low\nINPUT:");
	    
	    try{
		
	    int a = newC.nextInt();
		
		if (a == 1)
		    	ab = 1;
		    
		else if (a == 2)
		    	ab = 2;
		    
		    else{
		    	System.out.println("Wrong entry, try again");
		    	this.rec(newl, lc, prc);
		    }
		}catch(InputMismatchException e){
			
			System.out.println("Exception caught! Please enter a number as input.\n");
			this.rec(newl, lc , prc);
		
		}
		
		if(l == 1155){
			
			if(pr == 1)
			rec = i1155;
			
			else if(pr == 2)
				rec = i1155s;
			
		}
		
		else if (l == 1150){
			
			if(pr == 1)
				rec = i1150;
			
			else if (pr == 2)
				rec = i1150s;
			
			else
				rec = i1150k;
			
		}
		
		else{
			
			if(pr == 1)
				rec = i1151;
			
			else if(pr == 2)
				rec = i1151s;
			
			else if(pr == 3)
				rec = i1151k;
			
			else{
				if(ab == 1)
			      rec = i1151kk;
				
				else
					rec = i1151k;
			}
			
		}
		
		System.out.println("\nRecommended Motherboard:\n" + rec);
	}

}
}
