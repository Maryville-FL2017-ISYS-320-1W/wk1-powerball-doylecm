import java.math.BigInteger; // I know this is needed, but can't figure out how to make it work
// I keep getting errors and have restarted this assignment numerous times.

public class LotteryOdds {

	public static void main(String[] args) {

		int r;
		int w = 69; // 69 
		int s = 5; // 5
		int pb = 26;
	    r = factorial(w) / (factorial(s) * (factorial(w-s)));  // Superduper magic equation!!
	    r = r * pb;
	    
	    System.out.println("The odds of winning the PowerBall are 1:" + r);
	    System.out.println("The PowerBall website says that it's 1:292201338");
	    
    }

	public static Integer factorial(int n) {
	    int i = 1;
	    int f = 1;
	 
	    for (int c = 1; c <= n; c++) {
	      f = f * i++;
	    }

		return f;
	}
}
