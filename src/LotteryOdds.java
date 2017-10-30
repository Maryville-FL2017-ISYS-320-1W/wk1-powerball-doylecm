import java.math.BigInteger;

public class LotteryOdds {

	public static void main(String[] args) {

		BigInteger oddsofwinning = new BigInteger("292201338");
		BigInteger whiteballs = new BigInteger("69");
		BigInteger whiteballschosen = new BigInteger("5");
		BigInteger redballs = new BigInteger("26");
	    oddsofwinning = factorial(whiteballs).divide (factorial(whiteballschosen).multiply (factorial(whiteballs-whiteballschosen)));  // Superduper magic equation!!
	    oddsofwinning = oddsofwinning.multiply (redballs);
	    
	    System.out.println("The odds of winning the PowerBall are 1:" + oddsofwinning);
	    System.out.println("The PowerBall website says that it's 1:292201338");
	    
    }

	private static BigInteger factorial(BigInteger whiteballs) {
	    int i = 1;
	    int f = 1;
	 
	    for (int c = 1; c <= whiteballs; c++) {
	      f = f * i++;
	    }

		return f;
	}
}
