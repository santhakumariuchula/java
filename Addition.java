import java.io.*;
import java.util.*;
public class Addition
{
    int x,y,z;
    int add(int x,int y)
    {
        z=x+y;
        return z;
    }
    public static void main(String args[])
    {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        Addition a=new Addition();
        System.out.println("Enter two integers for addition");
        x=sc.nextInt();
        y=sc.nextInt();
        z=a.add(x,y);
        System.out.println("sum of "+x+" and "+y+" is "+z);
    }
}