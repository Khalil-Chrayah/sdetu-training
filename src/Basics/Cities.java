package Basics;
	
public class Cities {
	
 public static void main(String[] args) {
		// Declare and define and array
		String[] cities = {"New York ", "San Francisco ", "Miami ", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		
		
		//Declare array
		String[] contries;
		
		// Declare the array
		contries = new String[3];
		contries[0] = "USA";
		contries[1] = "CANADA";
		contries[2] = "UK";
		System.out.println(contries[1]);
		
		System.out.println("********************");
		// Declare the array
				String[] states = new String[5];
				states[0] = "California"; 
				states[1] = "Ohio"; 
				states[2] = "New Jersey"; 
				states[3] = "Texas"; 
				states[4] = "Utah"; 
				int i = 0;
				
				// Do Loop: enters the loop then tests condition
				do {
				    System.out.println("STATE:" + states[i]);
				    i = i + 1;
				
				}	while (i < 5);
				
				// while Loop: tests condition first then enters loop
				int n = 0; 
				boolean statefound = false;
				while (!statefound) {
					String state =  states[n];
					System.out.println(state);
					if (state == "Texas") {
						System.out.println("STATE FOUND");
						statefound = true;
						
					}
					n++;
				}
				System.out.println("\nPRINTING WITH FOR LOOP");
				// for loop: best structure for iterating through an array
				for (int x = 0; x < 5; x++) {
					System.out.println(states[x]);
				}
			}
		
		}
