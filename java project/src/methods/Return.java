package methods;

public class Return {
	public static void main(String[]args) {
		System.out.println("hiiii");
		 int x=add();
		 System.out.println(x);
		 System.out.println("helooo");
	}

	private static int add() {
		
		int a=10;
		int b=20;
		int res=a+b;
		return res ;
	}

}
