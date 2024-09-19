import java.io.*;
import java.util.*;
class ArrayDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of elements of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter"+n+"values into array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the elements of the array are");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}