
/**
 * Hello World
 * 
 * @author Cam Smith     
 * @version 02/08/2018
 * 
 * Lab 3
 */
import java.util.Scanner;

public class NameTest {

	public static void main(String[] args){
		/*Planner student1 = new Display();
		Planner student2 = new Display();
		Planner student3 = new Display();*/
		Scanner keyboard = new Scanner(System.in);


		System.out.println("enter your street name:");
		String streetName = keyboard.next();
		System.out.println("enter pet name:");
		String petName = keyboard.next();
		System.out.println("your adult name in capitals is " + petName.toUpperCase( ) + " " + streetName.toUpperCase( ) + "!!");
		System.out.println("If you had a lisp your adult name would be " + petName.replace('s', 'f') 
			+ " " + streetName.replace('s', 'f'));
		System.out.println("The length of your new Adult name is " + petName.length() + streetName.length());
		System.out.println("your adult name in lower case is " + petName.toLowerCase( ) + " " + streetName.toLowerCase( ) + "!!");
		System.out.println("your adult name in lower case is " + petName.trim( ) + " " + streetName.trim( ) + "!!");
//5 different prperties ask user a few strings, something interesting perform
		/*System.out.println(student2.isOn());
		s107_display.turnOn();
		System.out.println(student2.isOn());
		*/

	}




}