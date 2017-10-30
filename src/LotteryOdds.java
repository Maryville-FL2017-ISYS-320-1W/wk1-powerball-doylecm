import java.math.BigInteger;

public class LotteryOdds {

	public static void main(String[] args) {

		BigInteger oddsofwinning = new BigInteger("292201338");
		BigInteger whiteballs = new BigInteger("69");
		BigInteger whiteballschosen = new BigInteger("5");
		BigInteger redballs = new BigInteger("26");
	    oddsofwinning = factorial(whiteballs).divide (factorial(whiteballschosen).multiply (factorial(whiteballs.min (whiteballschosen))));  // Superduper magic equation!!
	    oddsofwinning = oddsofwinning.multiply (redballs);
	    
	    System.out.println("The odds of winning the PowerBall are 1:" + oddsofwinning);
	    System.out.println("The PowerBall website says that it's 1:292201338");
	    
    }

	private static BigInteger factorial(BigInteger whiteballs) {
	    BigInteger I = new BigInteger ("1");
	    BigInteger F = new BigInteger ("1");
	 
	    for (BigInteger C = new BigInteger ("1"); C <= whiteballs; C++) {
	      F = F.divide (BigInteger (I++));
	    }

		return F;
	}
}
