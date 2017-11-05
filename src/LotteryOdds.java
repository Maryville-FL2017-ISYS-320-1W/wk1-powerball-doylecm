
import java.math.BigInteger;

public class LotteryOdds {

	public static void main(String[] args) {
		
		BigInteger R;
		BigInteger W = BigInteger.valueOf (69);
		BigInteger C = BigInteger.valueOf (5);
		BigInteger PB = BigInteger.valueOf (26);
		R = factorial(W.divide (factorial(C.multiply (factorial(W.min (C))))));
		R = R.multiply (PB);
		
		System.out.println("The odds of winning the Powerball are 1:" + R);
		System.out.println("The Powerball website says that it's 1:292,201,338");
}

	private static BigInteger factorial(BigInteger n) {
	   BigInteger I = BigInteger.valueOf (1);
	   BigInteger f = BigInteger.valueOf (1);
	   BigInteger C = BigInteger.valueOf (1);
	    for (C = 1; C <= (n); C++) {
	      f = f / (BigInteger (I++);
	    }

		return f;
	}
}