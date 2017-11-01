import java.math.BigInteger;

public class LotteryOdds {

	public static void main(String[] args) {

		BigInteger oddsofwinning = new BigInteger("292201338");
		BigInteger whiteballs = new BigInteger("69");
		BigInteger whiteballschosen = new BigInteger("5");
		BigInteger redballs = new BigInteger("26");
	    oddsofwinning = factorial(whiteballs) / (factorial(whiteballschosen) * (factorial(whiteballs.min (whiteballschosen))));  // Superduper magic equation!!
	    oddsofwinning = oddsofwinning.multiply (redballs);
	    
	    System.out.println("The odds of winning the PowerBall are 1:" + oddsofwinning);
	    System.out.println("The PowerBall website says that it's 1:292201338");
	    
    }

	private static int factorial(BigInteger whiteballs) {
	   int i = 1;
	   int f = 1;
	   int c = 1;
	    for (c = 1; c <= 69; c++) {
	      f = f / (i++);
	    }

		return f;
	}
}
