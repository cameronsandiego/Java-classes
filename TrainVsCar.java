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
@author cameron smith
@version 1/31/2018
*/
import javax.swing.JOptionPane; 
public class TrainVsCar

{
	public static void main(String[] args)
	{
		double priceOfGas = 4.00, trainTicket = 30.00, carMpg = 15;
		double carMaintenance = 0.05, distance = 99.9, carTotal = 0, savingsDollars = 0; 
		int savingsCents =0;

		carMpg = JOptionPane.showInputDialog("What is your mpg?");       
		System.out.print("Hello " + carMpg);

		carTotal = (distance/carMpg*priceOfGas)+distance*carMaintenance;
		System.out.println("cost of taking the train is: $" + trainTicket);
		System.out.println("cost of driving is:  $"+(carTotal));
		savingsDollars = (int)((carTotal-trainTicket)*100+0.5)/100d;
			if (carTotal < trainTicket) {
				//System.out.println("The car is $"+(carTotal-trainTicket)" cheaper than the train.");
				System.out.println("The car is" + (trainTicket-carTotal) + "cheaper");
			}else {
				System.out.println("The train is $ " + savingsDollars + " cheaper than the car.");
				
			}


	}
}