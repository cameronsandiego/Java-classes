
/**
 * Hello World
 * 
 * @author Cam Smith     
 * @version 02/06/2018
 * 
 * HW Proj. Handout 1. PO 1  problem 1
 */
import java.util.Scanner;

public class StringThery
{
    public static void main(String[] args)
    {
    	int fun = 699/10;
    	Scanner keyboard = new Scanner(System.in); 
    	/*keyboard 
    	String gel = "tacos";
    	//String cam = "cam is nice";
    	String lizard = "trex";
    	String eyebrows = "eyebrows";
    	String funky = "chicken";
    	String chicken;
    	String screenTime;
    	String faoSux;
    	String lucky;
    	String unlucky = "13"; 
    	String kid;
    	// math, calculus, boy, value, sense, print;
    	double kombucha = 999.99;
    	char letterGrade = 'f';
    	boolean iAmTired = true;*/
    	System.out.print("Please Enter six numbers: ");
    	int num1 = keyboard.nextInt();
    	int num2 = keyboard.nextInt();
    	int num3 = keyboard.nextInt();
    	int num4 = keyboard.nextInt();
    	int num5 = keyboard.nextInt();
    	int num6 = keyboard.nextInt();
    	System.out.println(" The number I typed is: ");

    	System.out.printf("%5d%n%5d%n%5d%n%5d%n%5d%n%5d%n",num1, num2, num3, num4, num5, num6);
        
        InputOutput compiler = new InputOutput();
        compiler.printSomething();
        //System.out.println (funky);	
        //String phrase = "Make hay while the sun is shining.";
		//char c = phrase.charAt(10);
		//System.out.println(c);

    }
    public void printSomething() {
    	System.out.println("something");
    }
}
