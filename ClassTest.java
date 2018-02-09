/**
*
*/
import java.util.Scanner;
public class ClassTest{
	public static void main (String[] args){
	Scanner keyboard = new Scanner(System.in);
	System.out.print("enter your first name:");
	String name = keyboard.next();
 	System.out.println("your name is " + name.length() + " characters long");
 	String greeting = "Hello";
 	greeting.equals("Hello") returns true;
 	greeting.equals("Good-Bye") returns false;
 	greeting.equals("hello") returns false;
	}
}