import java.io.*;
import java.util.*;
public class Palindrome
{
    public static void main(String args[])
    {
        int r,s=0,temp,x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an positive integer to check it is palindrome or not");
        x=sc.nextInt();
        temp=x;
        while(x>0)
        {
            r=x%10;
            s=(s*10)+r;
            x=x/10;
        }
        if(temp==s)
        {
            System.out.println(temp+"is a palindrome");
        }
        else{
            System.out.println(temp+"is not a palindrome");
        }
    }
}