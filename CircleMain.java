import java.lang.Math;
import java.io.*;
import java.util.Scanner;
class Circlearea{
    double x,y;
    double r;
    double area(){
        return (22/7.0)*r*r;
    }
}
    class CircleMain{
    public static void main(String args[]){
        Circlearea ca=new Circlearea();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter centre(x,y) values: ");
        ca.x=sc.nextInt();
        ca.y=sc.nextInt();
        ca.r=Math.sqrt((ca.x*ca.x)+(ca.y*ca.y));
        System.out.println("Area of the circle is "+ca.area());
    }
}
