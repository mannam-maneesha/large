/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int p, q, r; 
		 Scanner sc = new Scanner(System.in); 
		 p= sc.nextInt();
		 q= sc.nextInt(); r= sc.nextInt(); 
		 if (p>q&&p>r)
		 System.out.println(p);
		 else if (q>p&&q>r) 
		 System.out.println(q);
		 else if (r>p&&r>q)
		 System.out.println(r);
		 else
		 System.out.println("Entered numbers are not distinct");// your code goes here
	}
}
