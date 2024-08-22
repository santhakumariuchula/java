import java.io.*;
public class Formattedoutput{
    public static void main(String args[]){
        String str="santhi";
    System.out.printf("the string value is:%s\n",str);
    int x=512;
    System.out.printf("\n the integer value is:%d\n",x);
    double f=5.25412368;
    System.out.printf("\n the decimal value is: %f\n",f);
    System.out.printf("\n after formatting to specific with the values:%.4f\n",f);
    System.out.printf("after formatting to right margin the values:%20.4f\n",f);
}
}
   