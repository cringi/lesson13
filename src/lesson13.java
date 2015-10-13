/**
 * @(#)lesson13.java
 *
 * lesson13 application
 *
 * @author
 * @version 1.00 2015/10/13
 */

public class lesson13 {
    public static void main(String[] args) {
    	// Things that are illegal

    	// char ch = aString; chars cant equal strings
    	// char ch = "A"; again, chars cant equal strings
    	// String x = xChar; strings cant equal chars either
    	// String x = 'X'; again strings cant equal chars;

    	// Things that are legal
    	/* int x = 1; // Why is this a surprise?
    	char ch = 'A'; // ASCII code A is 65.
    	int y = x + ch; // 1 + 65 essentially
    	System.out.println(y);
    	int z = ch; // Setting an integer to basically 65
		*/

    	// ILLEGAL!
    	// storing an int into a char
    	// char ch = j; IF J IS AN INT THIS IS BAD JUJU AND YOU WILL BE AN ILLEGAL PROGRAM
    	// char ch = (char)j; IF J IS LESS THAN 65536 OR WINDOWS 98 WILL COME IN ABOUT HOW THIS IS AN ILLEGAL OPERATION

    	/* String s = "W";
    	char a = s.charAt(0); // a now equals 'W'

    	System.out.println(a);
    	a = 'X';
    	s = "" + a; // concentraiton of a string and character is permitted
    				// end result is a string. the string concentrates an empty string.

    	char bigLetter = 'H';
    	char smallLetter = (char)(bigLetter + 32);

    	System.out.println(smallLetter);
    	System.out.println(bigLetter);

    	char c;
    	for (int j = 97; j <= 122; j++) {
    		c = (char)(j-32);
    		System.out.print(c);
    	}

    	String s = "Alfred E. Nueman";
    	char ch;
    	for (int x = 0; x < s.length(); x++) {
    		ch = s.charAt(x);
    		if ((ch <= 90) && (ch >= 65))
    			ch = (char)(ch + 32);
    		System.out.print(ch);
    	} */
    	/* // probably not
    	char ch = 'V';
    	String sd = ch;
    	// i was right */
    	// why not
    	//char ch = 'V';
    	//char x = (char)(ch + 56);
    	// i was right
    	// i know this one
    	// char aa = "X";
    	// i was right
    	//char k = 'B';
    	//System.out.println(k + 3); //69 GIGGLE TEEE HEE GIGGGITY
    	//System.out.println((char)(k + 3));

    	//char boy = 'q';
    	//char cv;
    	//cv = (char)(boy - 32);
    	//System.out.println(cv);

    	for (int j = 0;j <= 127;j++) {
    		char ch = (char)j;
    		if (Character.isWhitespace(ch))
    			System.out.println(j);
    	}
    }
}
