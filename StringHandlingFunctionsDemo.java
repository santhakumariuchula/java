import java.io.*;
import java.lang.String;
class StringHandlingFunctionsDemo{
	public static void main(String args[]){
		String s1="Welcome";
		String s2=new String("Welcome");
		String s3="Wel";
		boolean x=s1.equals(s2);
		System.out.println("s1 ans s2 are equal "+x);
		boolean y=s1.equals(s3);
		System.out.println("s1 and s3 are equal "+y);
		System.out.println("The character at 2nd position in s3 is "+s3.charAt(2));
		System.out.println("The character at 4th position in s1 is "+s1.charAt(4));
		System.out.println("Length of s1 "+s1.length());
		System.out.println("s1 in uppercase is "+s1.toUpperCase());
		System.out.println("The substring from 2,5 in s1 is "+s2.substring(2,5));
		System.out.println("The index of c in s2 is "+s2.indexOf('c'));
		System.out.println("After concatenating s1 and s3 is "+s1.concat(s3));
		System.out.println("After concatenating s1 and s3 is "+s3.concat(s1));
		System.out.println("s1 contains s3 "+s1.contains(s3));
		System.out.println("s3 contains s1 "+s3.contains(s1));
	}
}