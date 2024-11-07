import java.io.*;
class ThreadClassDemo2 implements Runnable{
	public void run(){
		System.out.println("The Thread is created and is executed");
	}
	public static void main(String args[]){
		ThreadClassDemo2 obj=new ThreadClassDemo2();
		Thread t=new Thread(obj);
		t.start();
	}
}
	
