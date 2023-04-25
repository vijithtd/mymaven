package scripts;

public class Upcast {
	int a=101;
	public static void main(String[] args) {
		Upcast upcast=null;
		
		try{
			System.out.println(upcast.a);
		}
		catch(NullPointerException e) {
			System.out.println("hend");
			
		}
	}

}
