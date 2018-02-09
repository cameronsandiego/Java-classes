/**
*
*/
public class UsingString{
	public static void main (String[] args){
		String blessing = "live long and prosper";
		System.out.println(blessing);
		System.out.println("the length of blessing string is: " + blessing.length());
		//int count = blessing()
		System.out.println("The answer is " + 42);
		System.out.println("the first character of blessing string is: " + blessing.charAt(0));
		char theThirdCharacter = blessing.charAt(3);
		String theFirstWord = blessing.substring(0,5);
		System.out.println ("the first word in the blessing string is: " + theFirstWord);
		System.out.println(blessing.indexOf("prosper"));
	}
}