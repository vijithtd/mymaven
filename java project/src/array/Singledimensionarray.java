package array;

public class Singledimensionarray {

	public static void main(String[] args) {
		
		// approach1
	
		// declare an array
		/*
		 * int a[]=new int[5];
		 * 
		 * 
		 * a[0]=100; a[1]=200; a[2]=200; a[3]=200; a[4]=200;
		 */
		
		
		// approach2
		
		int a[]= {100,200,300,400,500};
				
		//find size of an array
		System.out.println(a.length); //5 prints size of an array
 
       // read single value from an array
		System.out.println(a[3]);
		
		// read multiple value from an array
		/*
		 * for(int i=0; i<a.length; i++) // i<=length-1 // i<5 {
		 * System.out.println(a[i]); //100 200 300 400 500 }
		 */
		
		// reading multiple values from array by using for each loop
		
		for(int value:a) {
			System.out.println(value);
		}
	}

}

