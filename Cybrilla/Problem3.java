/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		String reverse = "";
		
		int length = str.length();  
		
        for ( int i = length - 1; i >= 0; i-- )  
            reverse = reverse + str.charAt(i);  
            
        if (str.equalsIgnoreCase(reverse))  
            System.out.println("true");  
        else  
            System.out.println("false");   
	}
}
