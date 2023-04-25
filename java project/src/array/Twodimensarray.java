package array;

public class Twodimensarray {

	public static void main(String[] args) {
		
		// declaration and insert
		// approach1
		/*
		 * int a[][]=new int [3][2];
		 * 
		 * a[0][0]=100; a[0][1]=100; a[1][1]=100; a[1][2]=100; a[2][3]=100; a[2][3]=100;
		 */
		
		//approach2 
		// declaration and initialization
		int a[][]= {{100,200},{300,400},{500,600}};
		
		// size of an array
		System.out.println("the no of rows:"+a.length);
		System.out.println("the no of columns:"+a[0].length);
		
		// read single value from an array
		System.out.println(a[2][1]);        //600

	}

}
