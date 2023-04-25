package screenshot;

public class Hgf {

	
			  public static int findWays(long n) {
			    int count = 0;
			    for (int i = 2; i <= Math.sqrt(2 * n); i++) {
			      if ((2 * n) % i == 0) {
			        int a = (int) ((2 * n / i - i + 1) / 2);
			        if (a > 0) {
			          count++;
			        }
			      }
			    }
			    return count + 1;
			  }

			  public static void main(String[] args) {
			    long n = 15;
			    System.out.println("Number of ways to represent " + n + ": " + findWays(n));
			  }
			

	

}
