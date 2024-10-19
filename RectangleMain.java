import java.io.*;
import java.util.Scanner;
class RectangleArea{
    int l,b;
    int area(){
        return (l*b);
    }
}
class RectangleMain{
    public static void main(String args[])
    {
        RectangleArea ra=new RectangleArea();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth values: ");
        ra.l=sc.nextInt();
        ra.b=sc.nextInt();
        System.out.println("Area of rectangle is "+ra.area());
    }
}
