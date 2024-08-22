import java.io.*;
class Outer{
    static int data=30;
    static class Inner{
        void message(){
            System.out.println("the value of data is"+data);
        }
    }
    public static void main(String arg[]){
        Outer.Inner obj=new Outer.Inner();
        obj.message();
    }
}