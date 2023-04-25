package corejava;

//import java.util.Scanner;

public class Fibbonic {

	public static void main(String[] args) {
		
		//Scanner a=new Scanner(System.in);
//		System.out.println("enter the number");
		int f1 =0;
		int f2=1;
		int f3=0;
		System.out.println(f1+"  "+f2);
		for(int i=1; i<=10; i++) {
			f3=f1+f2;
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;	
		}
//		System.out.print(" "+f3);
	}
}
