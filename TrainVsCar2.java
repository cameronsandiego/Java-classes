/**You want to decide whether you should drive your car
 to work or take the train. You know the one-way distance
  from your home to your place of work, and the fuel 
  efficiency of your car (in miles per gallon). 
  You also know the one-way price of a train ticket. 
  You assume the cost of gas at $4 per gallon, and 
  car maintenance at 5 cents per mile. Write an 
  algorithm to decide which commute is cheaper.

  sometimes I need to go to LAX, so I'm going to use the surf 
  liner ticket @ $30
  My FJ cruiser averages around 15mpg
@author cameron smith & cody bray
@version 2/1/2018
*/
import javax.swing.JOptionPane; 
public class TrainVsCar2

{
	public static void main(String[] args)
	{
		double priceOfGas = 4.00, trainTicket = 30.00, carMpg = 15;
		double carMaintenance = 0.05, distance = 99.9, carTotal = 0, savingsDollars = 0; 
		int savingsCents =0;

		String carMpgString = JOptionPane.showInputDialog("What is your mpg?");       
		
		String trainTicketString = JOptionPane.showInputDialog("What is your train ticket price in dollars?");       
		//System.out.print("Hello " + carMpgString);
		trainTicket=Double.parseDouble(trainTicketString);

		String distanceString = JOptionPane.showInputDialog("What is your commute distance in miles?");       
		//System.out.print("Hello " + carMpgString);
		distance=Double.parseDouble(distanceString);

		String priceOfGasString = JOptionPane.showInputDialog("how much is your gas, dollars per gallon?");       
		//System.out.print("Hello " + carMpgString);
		priceOfGas=Double.parseDouble(priceOfGasString);

		carTotal = (distance/carMpg*priceOfGas)+distance*carMaintenance;
		System.out.printf("%s %.2f\n", "cost of taking the train is: $", trainTicket);
		System.out.printf("%s %.2f\n", "cost of driving is:  $", carTotal);
		//savingsDollars = (int)((carTotal-trainTicket)*100+0.5)/100d;
			if (carTotal < trainTicket) {
				//System.out.println("The car is $"+(carTotal-trainTicket)" cheaper than the train.");
				System.out.printf("%s %.2f %s\n", "The car is", (trainTicket-carTotal) , "cheaper");
			}else {
				System.out.printf("%s %.2f %s\n", "The train is", (carTotal-trainTicket) , " cheaper than the car.");
				
			}


	}
}