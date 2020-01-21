package FL02.eks.lambda.numeric;

import static lib.Out.*;

public class NuericTestClient {

	public static void main(String args[]) {
		INumericTest isEven = (n) -> (n % 2) == 0;
		INumericTest isNegative = (n) -> (n < 0);

		// Output: false
		out(isEven.computeTest(5));

		// Output: true
		out(isNegative.computeTest(-5));
	}	
}
