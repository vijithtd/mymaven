//package screenshot;

  //import java.util.Arrays;

public class Main {
	//public static int minimumBiasAmount(int[] ratings) {
		//Arrays.sort(ratings);
		//int n = ratings.length;
		//int minBias = Integer.MAX_VALUE;
		//for (int i = 0; i < n / 2; i++) {
			//int bias = ratings[n - i - 1] - ratings[i];
			//minBias = Math.min(minBias, bias);
		//}
		//return minBias;
	//}

	//public static void main(String[] args) {
		//int[] ratings = {16, 17, 18, 19, 20, 21, 22, 23, 24};
		//System.out.println("Minimum total bias amount: " + minimumBiasAmount(ratings));
	//}
//}


public class Main {
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
  

  public static void main(String[] args) {
    long n = 15;
    System.out.println("Number of ways to represent " + n + ":" + findWays(n));
  }


















