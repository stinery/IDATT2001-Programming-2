package FL02.eks.lambda.doublevalue;

import static lib.Out.*;

public class DoubleValueComputerClient {

	public static void main(String[] args) {
		IDoubleValueComputer adderNormal = new IDoubleValueComputer() {
			@Override
			public double compute(double x, double y) {
				return x + y;
			}
		};

		IDoubleValueComputer multiplierNormal = new IDoubleValueComputer() {
			@Override
			public double compute(double x, double y) {
				return x * y;
			}
		};

		out(adderNormal.compute(10, 20));
		out(multiplierNormal.compute(10, 20));

		IDoubleValueComputer adderLambda = (x, y) -> x + y;
		IDoubleValueComputer multiplierLambda = (x, y) -> x * y;

		out(adderLambda.compute(10, 20));
		out(multiplierLambda.compute(10, 20));

	}
}
