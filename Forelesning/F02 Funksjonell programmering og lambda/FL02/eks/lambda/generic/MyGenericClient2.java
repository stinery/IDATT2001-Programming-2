package FL02.eks.lambda.generic;

import static lib.Out.*;

public class MyGenericClient2 {

	public static void main(String args[]) {

		IMyGeneric2<Integer, Integer> adderInt = (x, y) -> x + y;
		IMyGeneric2<Double, Double> adderDouble = (x, y) -> x + y;
		IMyGeneric2<String, String> adderStr = (x, y) -> x.concat(y);

		out(adderStr.compute("Lambda ", "Demo"));
		out(adderInt.compute(100, 50));
		out(adderDouble.compute(100.5, 50.1));
	}
}
