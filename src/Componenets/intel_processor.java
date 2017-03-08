package Componenets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class intel_processor {
	
	static int a;
	public int gen;
	public int lga;
	public int priority;
	/*
	priority order for different chips as follows
	lga 1155 - 2nd and 3rd gen - priority- 1 to non overclockable, 2 to overclockable.
	lga 1150 - 4th and 5th gen - priority- 1 to non overclockable, 2 to less budget overclockable, 3 to high budget overclockable.
	lga 1151 - 6th and 7th gen - priority- 1 to low budget non overclockable , 2 to high budget non OC, 3 to low budget OC, 4 to high budget OC
	*/
	public String choice_i3;
	public String choice_i5;
	public String choice_i7;
	
	String i3_2130 = "i3 2130";
	String i3_3250 = "i3 3250";
	String i3_4170 = "i3 4170";
	String i3_4370 = "i3 4370";
	String i3_6100 = "i3 6100";
	String i3_6300 = "i3 6300";
	String i3_7100 = "i3 7100";
	String i3_7300 = "i3 7300";
	String i3_7320 = "i3 7320";
	String i3_7350k = "i3 7350k";
	
	String i5_2550k = "i5 2550k";
	String i5_3570k = "i5 3570k";
	String i5_4460 = "i5 4460";
	String i5_4590 = "i5 4590";
	String i5_4670 = "i5 4670";
	String i5_4670k = "i5 4670k";
	String i5_4690 = "i5 4690";
	String i5_4690k = "i5 4690k";
	String i5_5675R = "i5 5675R";
	String i5_6400 = "i5 6400";
	String i5_6402P = "i5 6402P";
	String i5_6500 = "i5 6500";
	String i5_6600 = "i5 6600";
	String i5_6600k = "i5 6600k";
	String i5_7400 = "i5 7400";
	String i5_7500 = "i5 7500";
	String i5_7600 = "i5 7600";
	String i5_7600k = "i5 7600k";
	
	String i7_2600k = "i7 2600k";
	String i7_2700k = "i7 2700k";
	String i7_3930k = "i7 3930k";
	String i7_3970X = "i7 3970X";
	String i7_4771 = "i7 4771";
	String i7_4770k = "i7 4770k";
	String i7_4790 = "i7 4790";
	String i7_4790k = "i7 4790k";
	String i7_5820k = "i7 5820k";
	String i7_5930k = "i7 5930k";
	String i7_5960X = "i7 5960X";
	String i7_6700 = "i7 6700";
	String i7_6700k = "i7 6700k";
	String i7_6800k = "i7 6800k";
	String i7_6850k = "i7 6850k";
	String i7_6900k = "i7 6900k";
	String i7_6950X = "i7 6950X";
	String i7_7700 = "i7 7700";
	String i7_7700k = "i7 7700k";
			
	public void choice() throws Exception
	{
		Scanner nc1 = new Scanner(System.in);
		
        if(a == 3){
			
			System.out.println("\nToo many wrong inputs, please restart!");
			System.exit(0);
			
		}
		
		System.out.println("Chose from the following:\n1. Intel Core i3\n2. Intel Core i5\n3. Intel Core i7\nINPUT:");
		
		try{
		int nc1s = nc1.nextInt();
		
		if (nc1s == 1)
		  this.i3();
		
		else if (nc1s == 2)
			this.i5();
		
		else if (nc1s == 3)
			this.i7();
		
        else{
			
			System.out.println("Wrong input, try again\n");
			a++;
			this.choice();
	}
		}catch(InputMismatchException e){
			
			System.out.println("Exception caught! Please enter a number as input.\n");
		    this.choice();
		
		} finally{
			nc1.close();
		}
	}
	
	public void i3() throws Exception
	{
		Scanner nc2 = new Scanner(System.in);
		
		System.out.println("Make a choice:\n2nd Gen\n3rd Gen\n4th Gen\n5th Gen\n6th Gen\n7th Gen\nINPUT( the gen): ");
		
		try{
		int nc2s = nc2.nextInt();
	    
		if (nc2s == 2){
			gen = 2;
			lga = 1155;
			this.i3g();
			
		}
		
		else if (nc2s == 3){
			
			gen = 3;
			lga = 1155;
			this.i3g();
		}
		
		else if (nc2s == 4){
			
			gen = 4;
			lga = 1150;
			this.i3g();
		}
		
		else if (nc2s == 5){
			
			gen = 5;
			lga = 1150;
			this.i3g();
		}
		
		else if (nc2s == 6){
			
			gen = 6;
			lga = 1151;
			this.i3g();
		}
		
		else if (nc2s == 7){
			
			gen = 7;
			lga = 1151;
			this.i3g();
		}
		
		else {
			
			System.out.println("Wrong input, please try again!");
			this.i3();
		}
		
		}catch(InputMismatchException e){
			
			System.out.println("Exception caught! Please enter a number as input.\n");
			this.i3();
		
		} finally{
			nc2.close();
		}
	}
	
    public void i5()
	{
        Scanner nc3 = new Scanner(System.in);
		
		System.out.println("Make a this.choice:\n2nd Gen\n3rd Gen\n4th Gen\n5th Gen\n6th Gen\n7th Gen\nINPUT( the gen): ");
		
		try{
		int nc3s = nc3.nextInt();
	    
		if (nc3s == 2){
			
			gen = 2;
			lga = 1155;
			this.i5g();
		}
		
		else if (nc3s == 3){
			
			gen = 3;
			lga = 1155;
			this.i5g();
		}
		
		else if (nc3s == 4){
			
			gen = 4;
			lga = 1150;
			this.i5g();
		}
		
		else if (nc3s == 5){
			
			gen = 5;
			lga = 1150;
			this.i5g();
		}
		
		else if (nc3s == 6){
			
			gen = 6;
			lga = 1151;
			this.i5g();
		}
		
		else if (nc3s == 7){
			
			gen = 7;
			lga = 1151;
			this.i5g();
		}
		
        else {
			
			System.out.println("Wrong input, please try again!");
			this.i5();
		}
		
		}catch(InputMismatchException e){
			
			System.out.println("Exception caught! Please enter a number as input.\n");
			this.i5();
		
		} finally{
			nc3.close();
		}
	}
	
	public void i7() throws Exception
	{
        Scanner nc4 = new Scanner(System.in);
		
		System.out.println("Make a this.choice:\n2nd Gen\n3rd Gen\n4th Gen\n5th Gen\n6th Gen\n7th Gen\nINPUT( the gen): ");
		
		try{
		int nc4s = nc4.nextInt();
	    
		if (nc4s == 2){
			
			gen = 2;
			lga = 1155;
			this.i7g();
		}
		
		else if (nc4s == 3){
			
			gen = 3;
			lga = 1155;
			this.i7g();
		}
		
		else if (nc4s == 4){
			
			gen = 4;
			lga = 1150;
			this.i7g();
		}
		
		else if (nc4s == 5){
			
			gen = 5;
			lga = 1150;
			this.i7g();
		}
		
		else if (nc4s == 6){
			
			gen = 6;
			lga = 1151;
			this.i7g();
		}
		
		else if (nc4s == 7){
			
			gen = 7;
			lga = 1151;
			this.i7g();
		}
		
        else {
			
			System.out.println("Wrong input, please try again!");
			this.i7();
		}
		}catch(InputMismatchException e){
			
			System.out.println("Exception caught! Please enter a number as input.\n");
			this.i3();
		
		} finally{
			nc4.close();
		}
	}

	public void i3g() throws Exception{
		
		Scanner i3 = new Scanner(System.in);
		
		priority = 1;
		
		if (gen == 2){
		    
			System.out.println("Only one available processor i.e " + i3_2130 + ". ENTER 1 TO CHOSE THIS OR 2 TO GO BACK:");
			
			try{
			int i3i = i3.nextInt();
			
			if (i3i == 1)
				choice_i3 = i3_2130;
			
			}catch(InputMismatchException e){
				
				System.out.println("Exception caught! Please enter a number as input.\n");
				this.i3();
			
			} 
		}
			
			else if (gen == 3){
			
			System.out.println("Only one available processor i.e " + i3_3250 + ". ENTER 1 TO CHOSE THIS OR 2 TO GO BACK:");
			
			
			try{
			int i3i = i3.nextInt();
			
			if (i3i == 1)
				choice_i3 = i3_3250;
			
			else{
				System.out.println("Please enter a valid input!");
				this.i3();
			}
			
			}catch(InputMismatchException e){
				
				System.out.println("Exception caught! Please enter a number as input.\n");
				this.i3();
			
			} 
		}
		
		
			else if (gen ==4){
			
			System.out.println("Available processors:\n1. i3_4170\n2. i3_4370");
			System.out.println("INPUT (the number besides the processor you want) :");
			
			
			try{
			int i3i = i3.nextInt();
			
			if (i3i == 1)
				choice_i3 = i3_4170;
			
			else if (i3i == 2)
				choice_i3 = i3_4370;
			
			else{
				System.out.println("Please enter a valid input!");
				this.i3();
			}
			
			
			}catch(InputMismatchException e){
				
				System.out.println("Exception caught! Please enter a number as input.\n");
				this.i3();
			
			} 
		}
		
		
			else if(gen == 5){
			
			System.out.println("No available i3 processors for the 5th Gen");
			this.i3();
			
		}
		
		
			else if(gen == 6){
		
			System.out.println("Available processors :\n1. i3_6100\n2. i3_6300\nINPUT(you know the drill)");
			
			try{
				int i3i = i3.nextInt();
				
				if (i3i == 1)
					this.choice_i3 = i3_6100;
				
				else if (i3i == 2)
					choice_i3 = i3_6300;
				
				else{
					System.out.println("Please enter a valid input!");
					this.i3();
				}
				
				
				}catch(InputMismatchException e){
					
					System.out.println("Exception caught! Please enter a number as input.\n");
					this.i3();
				
				} 
			
		}
		
		
			else if(gen == 7){
				
				System.out.println("Available processors :\n1. i3_7100\n2. i3_7300\n3. i3_7320\n4. i3_7350k\nINPUT(you know the drill)");
				
				try{
					int i3i = i3.nextInt();
					
					if (i3i == 1)
						choice_i3 = i3_7100;
					
					else if (i3i == 2)
						choice_i3 = i3_7300;
					
					else if (i3i == 3)
						choice_i3 = i3_7320;
					
					else if (i3i == 4){
						
						choice_i3 = i3_7350k;
					    priority = 3;
					    
					}
					else{
						System.out.println("Please enter a valid input!");
						this.i3();
					}
				
					}catch(InputMismatchException e){
						
						System.out.println("Exception caught! Please enter a number as input.\n");
						this.i3();
					
					} 
			}
		
       MoBo obj = new MoBo();
       obj.rec(choice_i3 , lga , priority);
		}
		
	void i5g(){
		
		
        Scanner i5 = new Scanner(System.in);
		priority = 1;
		if (gen == 2){
		    
			System.out.println("Only one available processor i.e " + i5_2550k + ". ENTER 1 TO CHOSE THIS OR 2 TO GO BACK:");
			
			try{
			int i5i = i5.nextInt();
			
			if (i5i == 1){
				
				priority = 2;
				choice_i5 = i5_2550k;
			}
			}catch(InputMismatchException e){
				
				System.out.println("Exception caught! Please enter a number as input.\n");
				this.i5();
			
			}
		}
			
			else if (gen == 3){
			
			System.out.println("Only one available processor i.e " + i5_3570k + ". ENTER 1 TO CHOSE THIS OR 2 TO GO BACK:");
			
			
			try{
			int i5i = i5.nextInt();
			
			if (i5i == 1)
				choice_i5 = i5_3570k;
			
			else{
				System.out.println("Please enter a valid input!");
				this.i5();
			}
			
			}catch(InputMismatchException e){
				
				System.out.println("Exception caught! Please enter a number as input.\n");
				this.i5();
			
			} 
		}
		
		
			else if (gen ==4){
			
			System.out.println("Available processors:\n1. i5 4460\n2. i5 4590\n3. i5 4670\n4. i5 4690\n5. i5 4690k");
			System.out.println("INPUT (the number besides the processor you want) :");
			
			
			try{
			int i5i = i5.nextInt();
			
			if (i5i == 1)
				choice_i5 = i5_4460;
			
			else if (i5i == 2)
				choice_i5 = i5_4590;
			
			else if (i5i == 3)
				choice_i5 = i5_4670;
			
			else if (i5i == 4)
				choice_i5 = i5_4690;
			
			else if (i5i == 5){
				
			    priority = 3;
				choice_i5 = i5_4690k;
			}
			else{
				System.out.println("Please enter a valid input!");
				this.i5();
			}
			
			
			}catch(InputMismatchException e){
				
				System.out.println("Exception caught! Please enter a number as input.\n");
				this.i5();
			
			}
		}
		
		
			else if(gen == 5){
			
				System.out.println("Only one available processor i.e " + i5_5675R + ". ENTER 1 TO CHOSE THIS OR 2 TO GO BACK:");
				
				try{
				int i5i = i5.nextInt();
				
				if (i5i == 1)
					choice_i5 = i5_5675R;
				
				}catch(InputMismatchException e){
					
					System.out.println("Exception caught! Please enter a number as input.\n");
					this.i5();
				
				} 
			
		}
		
		
			else if(gen == 6){
			
			System.out.println("Available processors :\n1. i5_6400\n2. i5_6402P\n3. i5 6500\n4. i5 6600\n5. i5 6600k\nINPUT(you know the drill)");
			
			try{
				int i5i = i5.nextInt();
				
				if (i5i == 1)
					choice_i5 = i5_6400;
				
				else if (i5i == 2)
					choice_i5 = i5_6402P;
				
				else if (i5i == 3)
					choice_i5 = i5_6500;
				
				else if (i5i == 4){
				    priority = 2;
					choice_i5 = i5_6600;
				}
				else if (i5i == 5){
					
					priority = 3;
					choice_i5 = i5_6600k;
				}
				else{
					System.out.println("Please enter a valid input!");
					this.i5();
				}
				
				
				}catch(InputMismatchException e){
					
					System.out.println("Exception caught! Please enter a number as input.\n");
					this.i5();
				
				} 
			
		}
		
		
			else if(gen == 7){
				
				System.out.println("Available processors :\n1. i3_7400\n2. i3_7500\n3. i3_7600\n4. i3_7600k\nINPUT(you know the drill)");
				
				try{
					int i5i = i5.nextInt();
					
					if (i5i == 1)
						choice_i5 = i5_7400;
					
					else if (i5i == 2)
						choice_i5 = i5_7500;
					
					else if (i5i == 3){
						
						priority = 2;
						choice_i5 = i5_7600;
					}
					else if (i5i == 4){
						
						priority = 3;
						choice_i5 = i5_7600k;
					}
					else{
						System.out.println("Please enter a valid input!");
						this.i5();
					}
				
					}catch(InputMismatchException e){
						
						System.out.println("Exception caught! Please enter a number as input.\n");
						this.i5();
					
					} 
			}
		
		MoBo obj = new MoBo();
		
		obj.rec(choice_i5 ,  lga , priority);
	}
	
	void i7g() throws Exception{
		
        Scanner i7 = new Scanner(System.in);
		
        priority = 3;
        
		if (gen == 2){
		    
			System.out.println("Available processors:\n1. i7 2600k\n2. i7 2700k\nINPUT:");
			
			try{
			int i7i = i7.nextInt();
			
			if (i7i == 1){
				
				 priority = 2;
				choice_i7 = i7_2600k;
			}
			else if (i7i == 2){
				
				 priority = 2;
				choice_i7 = i7_2700k;
			}
			else{
				System.out.println("Please enter a valid input!");
				this.i7();
			}
			}catch(InputMismatchException e){
				
				System.out.println("Exception caught! Please enter a number as input.\n");
				this.i7();
			
			} 
		}
			
			else if (gen == 3){
			
			System.out.println("Available processors:\n1. i7 3930k\n2. i7 3970X\nINPUT:");
			
			
			try{
			int i7i = i7.nextInt();
			
			if (i7i == 1)
				choice_i7 = i7_3930k;
			
			else if (i7i == 2)
				choice_i7 = i7_3970X;

			else{
				System.out.println("Please enter a valid input!");
				this.i7();
			}
			
			}catch(InputMismatchException e){
				
				System.out.println("Exception caught! Please enter a number as input.\n");
				this.i7();
			
			} 
		}
		
		
			else if (gen ==4){
			
			System.out.println("Available processors:\n1. i7 4771\n2. i7 4770k\n3. i7 4790\n4. i7 4790k");
			System.out.println("INPUT (the number besides the processor you want) :");
			
			
			try{
			int i7i = i7.nextInt();
			
			if (i7i == 1){
				 priority = 2;
				choice_i7 = i7_4771;
			}
			else if (i7i == 2)
				choice_i7 = i7_4770k;
			
			else if (i7i == 3)
				choice_i7 = i7_4790;
			
			else if (i7i == 4)
				choice_i7 = i7_4790k;
			
			
			else{
				System.out.println("Please enter a valid input!");
				this.i7();
			}
			
			
			}catch(InputMismatchException e){
				
				System.out.println("Exception caught! Please enter a number as input.\n");
				this.i7();
			
			} 
		}
		
		
			else if(gen == 5){
			
				System.out.println("Available processors:\n1. i7 5820k\n2. i7 5930k\n3. i7 5960X");
				
				try{
				int i7i = i7.nextInt();
				
				if (i7i == 1)
					choice_i7 = i7_5820k;
				
				else if (i7i == 2)
					choice_i7 = i7_5930k;
				
				else if (i7i == 3)
					choice_i7 = i7_5960X;
				
				else{
					System.out.println("Please enter a valid input!");
					this.i7();
				}
				
				}catch(InputMismatchException e){
					
					System.out.println("Exception caught! Please enter a number as input.\n");
					this.i7();
				
				} 
			
		}
		
		
			else if(gen == 6){
			
				System.out.println("Available processors:\n1. i7 6700\n2. i7 6700k\n3. i7 6800k\n4. i7 6850k\n5. i7 6900k\n6. i7 6950X");
				System.out.println("INPUT (the number besides the processor you want) :");
				
				
				try{
				int i7i = i7.nextInt();
				
				if (i7i == 1){
					 priority = 2;
					choice_i7 = i7_6700;
				}
				else if (i7i == 2)
					choice_i7 = i7_6700k;
				
				else if (i7i == 3){
					 priority = 4;
					choice_i7 = i7_6800k;
				}
				else if (i7i == 4){
					
					 priority = 4;
					choice_i7 = i7_6850k;
				}
				else if (i7i == 5){
					 priority = 4;
					choice_i7 = i7_6900k;
				}
				else if (i7i == 6){
					 priority = 4;
					choice_i7 = i7_6950X;
				}
				
				else{
					System.out.println("Please enter a valid input!");
					this.i7();
				}
				
				
				}catch(InputMismatchException e){
					
					System.out.println("Exception caught! Please enter a number as input.\n");
					this.i7();
				
				} 
			
		}
		
		
			else if(gen == 7){
				
				System.out.println("Available processors :\n1. i3_7700\n2. i3_7700k\nINPUT(you know the drill)");
				
				try{
					int i7i = i7.nextInt();
					
					if (i7i == 1){
						 priority = 2;
						choice_i7 = i7_7700;
					}
					else if (i7i == 2){
						 priority = 4;
						choice_i7 = i7_7700k;
					}
					else{
						System.out.println("Please enter a valid input!");
						this.i7();
					}
				
					}catch(InputMismatchException e){
						
						System.out.println("Exception caught! Please enter a number as input.\n");
						this.i7();
					
					} 
			}
        MoBo obj = new MoBo();
		System.out.println("yolo, typing this on phone xD");
		obj.rec(choice_i7 ,  lga ,  priority);
		
	}
	
	
}
