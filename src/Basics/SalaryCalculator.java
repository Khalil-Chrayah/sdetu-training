package Basics;



public class SalaryCalculator {
   public static void main(String[] args) {
	   // Let's create a variable to define our career

	   // Declare a variable
	   String carrer;
	   System.out.println("Programe is starting");
	   
	   // Defined a variable
	   carrer = "Software Developer";
	   System.out.println("My career is: " + carrer);
	   
	   // Declare & Define
	   int hoursPerweek = 40;
	   int weeksPerYear = 50;
	   double rate = 42.50;
	   carrer = "web Developer";
	   
	   double salary = hoursPerweek * weeksPerYear * rate;
	   System.out.println("My salary as a " + carrer + " at the rate of $" + rate + "per hour is $" + salary + " per year.");
	   // computer our annual salary
	   // rate "hoursPerweek" weeksPerYear
   }
}
