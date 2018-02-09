/**
*A program displaying the name that the user typed in.
*
*
*
*@author Cameron Smith
*@version 01/30/2018
*HW Proj. Handout 1. PO 1  problem 5
*
*
*/
import javax.swing.JOptionPane; 
public class DialogViewer
{    
	public static void main(String[] args)    
	{       
		String name = JOptionPane.showInputDialog("What is your name?");       
		System.out.print("Hello ");  
		System.out.print(name); 
		System.out.println();
	}
} 


/**public class return
	{
		public static void main(string[] args)
		{

		}

	}
}**/