package FL02.eks.lambda.generic;

import static lib.Out.*;

public class MyGenericClient {

	public static void main(String args[]) {

		// String version of MyGenericInteface
		IMyGeneric<String> reverse = (str) -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};

		// Integer version of MyGeneric
		IMyGeneric<Integer> factorial = (n) -> {
			int result = 1;
			
			for (int i = 1; i <= n; i++)
				result = i * result;

			return result;
		};

		// Output: omeD adbmaL
		out(reverse.compute("Lambda Demo"));

		// Output: 120
		out(factorial.compute(5));
	}
}
