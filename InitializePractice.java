/**
*
*
*@author cameron smith
*@version 01/30
*
*
*
*/


public class InitializePractice
{
	public static void main(String[] args)
	{
		boolean male = true, lightIsOn = true;
		int age = 32, carsInParkingLot = 32, quarters = 3, friends = 5, siblings = 4, five = 65, sandwichesEatenToday = 12, textsReceived = 45, batteryLifeRemaining = 44, farts = 2, poos = 3;
		float weight = 196.7f;
		double percentHwCompleted = 10000, howMuchMilk = 0.0;
		double amountOfLastCheck = 500.00, priceOfMilk = 2.99, areaOfMyRoomSqFt = 0.00;
		char agree = 'y', grade = 'a', letter = 'x';
		byte numberOfProfessors = 1;
		String hello = "こんにちは"; 
		//int fuey = 2.78;


		System.out.println("Do you agree?   " + agree);
		System.out.println("Light is on: " + lightIsOn);
		System.out.println(hello);
		System.out.println("how many poos: " + poos);
		System.out.println("how old: " + age);
		System.out.println("how many cars in parking lot: " + carsInParkingLot);
		System.out.println("how heavy: " + weight + "lbs");
		System.out.println("how much milk: " + howMuchMilk + "gallons");
		age += 2;	
		carsInParkingLot -= poos;
		weight *= 2;
		howMuchMilk = amountOfLastCheck /= priceOfMilk;
		System.out.println("how many poos: " + poos);
		System.out.println("how old: " + age);
		System.out.println("how many cars in parking lot: " + carsInParkingLot);
		System.out.println("how heavy: " + weight + "lbs");
		System.out.println("how much milk: " + howMuchMilk + "gallons");
		
		amountOfLastCheck *= 10e5;
		howMuchMilk = amountOfLastCheck /= priceOfMilk;
		System.out.println("how much milk: " + howMuchMilk + "gallons");
		int x =20, y =0;
		int z = 5*3/2;
		System.out.println(z);
		y= x/z;
		System.out.println(x + " " y " " + z);
	}
}