import java.io.*;
import java.util.*;
class CircleArea1{
    double r;
    double area(){
        return (22/7.0)*r*r;
    }
}
class CircleMain1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        CircleArea1 ca1=new CircleArea1();
        CircleArea1 ca2=new CircleArea1();
        System.out.println("Enter radius of 1st circle: ");
        ca1.r=sc.nextDouble();
        System.out.println("Enter radius of 2nd circle: ");
        ca2.r=sc.nextDouble();
        System.out.println("Area of 1st circle is "+ca1.area());
        System.out.println("Area of 2nd circle is "+ca2.area());
    }
}
