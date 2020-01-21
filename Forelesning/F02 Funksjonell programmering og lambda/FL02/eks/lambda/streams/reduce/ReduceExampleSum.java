package FL02.eks.lambda.streams.reduce;

import static lib.Out.out;

import java.text.ParseException;
import java.util.ArrayList;

public class ReduceExampleSum {

	public static void main(String[] args) throws ParseException {

		ArrayList<Student> studenter = new ArrayList<Student>();
		studenter.add(new Student("Ole Petter", "Hansen", "1980/12/12", "Mann"));
		studenter.add(new Student("Ingrid", "Olsen", "1975/12/10", "Kvinne"));
		studenter.add(new Student("�se Marie", "Jensen", "1973/05/06", "Kvinne"));

		out("\nTradisjonell m�te: ");
		int sumAlder = 0;
		for (Student student : studenter) {
			sumAlder += student.getAlder();
		}
		out(sumAlder);

		out("\nLambda: ");
		sumAlder = studenter.stream().map(Student::getAlder).reduce((a, b) -> a + b).get();
		out(sumAlder);
	}
}
