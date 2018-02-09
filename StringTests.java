


public class StringTests{

public static void main (String[] args){

	//String str = "string";
	String greeting = "Hello";
	String typistName = "me";
	String weekendPlans = "study";
	String bottle = "Klean Kanteen";
	String carBrand = "toyota";
	String computerBrand = "crapple";
    int count = greeting.length();
    //System.out
    System.out.println("The length of " + greeting + " is " + greeting.length()
    	//if greeting.equals
     + "\nThe replace of " + typistName  + " is " +  typistName.replace('t', 'f')  
     + "\nThe replace of " + weekendPlans + " is " +   weekendPlans.replace('t', 'f')
     + "\nThe replace of " + bottle + " is " + bottle.replace('t', 'f') 
     + "\nThe replace of " + carBrand + " is " + carBrand.replace('t', 'f'));



    /*int length()
Returns the length of the calling object (which is a string) as a value of type int. EXAMPLE
After program executes String greeting = "Hello!"; greeting.length() returns 6.
boolean equals(Other_String)
Returns true if the calling object string and the Other_String are equal. Otherwise, returns false. EXAMPLE
After program executes String greeting = "Hello"; greeting.equals("Hello") returns true greeting.equals("Good-Bye") returns false greeting.equals("hello") returns false
Note that case matters. "Hello" and "hello" are not equal because one starts with an uppercase letter and the other starts with a lowercase letter.
boolean equalsIgnoreCase(Other_String)
Returns true if the calling object string and the Other_String are equal, considering upper- and lowercase versions of a letter to be the same. Otherwise, returns false.
EXAMPLE
After program executes String name = "mary!"; greeting.equalsIgnoreCase("Mary!") returns true
Display 1.4 Some Methods in the Class String (part 2 of 4)
The Class String 39
 
String toLowerCase( )
Returns a string with the same characters as the calling object string, but with all letter characters converted to lowercase.
EXAMPLE
After program executes String greeting = "Hi Mary!"; greeting.toLowerCase() returns "hi mary!".
String toUpperCase( )
Returns a string with the same characters as the calling object string, but with all letter characters converted to uppercase.
EXAMPLE
After program executes String greeting = "Hi Mary!"; greeting.toUpperCase() returns "HI MARY!".
String trim( )
Returns a string with the same characters as the calling object string, but with leading and trailing white space removed. White space characters are the characters that print as white space on paper, such as the blank (space) character, the tab character, and the new-line character '\n'.
EXAMPLE
After program executes String pause = " Hmm "; pause.trim() returns "Hmm".
char charAt(Position)
Returns the character in the calling object string at the Position. Positions are counted 0, 1, 2, etc. EXAMPLE
After program executes String greeting = "Hello!"; greeting.charAt(0) returns 'H', and greeting.charAt(1) returns 'e'.
String substring(Start)
Returns the substring of the calling object string starting from Start through to the end of the calling object. Positions are counted 0, 1, 2, etc. Be sure to notice that the character at position Start is included in the value returned.
EXAMPLE
After program executes String sample = "AbcdefG"; sample.substring(2) returns "cdefG".*/
    }
    }