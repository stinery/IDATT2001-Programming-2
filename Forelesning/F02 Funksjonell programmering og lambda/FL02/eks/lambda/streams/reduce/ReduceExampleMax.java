package FL02.eks.lambda.streams.reduce;

import static lib.Out.out;

import java.text.ParseException;
import java.util.ArrayList;

public class ReduceExampleMax {

	public static void main(String[] args) throws ParseException {

		ArrayList<Student> studenter = new ArrayList<Student>();
		studenter.add(new Student("Ole Petter", "Hansen", "1980/12/12","Mann"));
		studenter.add(new Student("Ingrid", "Olsen", "1975/12/10","Kvinne"));
		studenter.add(new Student("Åse Marie", "Jensen", "1973/05/06","Kvinne"));

		
		out("\nTradisjonell måte: ");
		int maxAlder=0;
		for (Student student : studenter) {
			int alder = student.getAlder();
			if(alder>maxAlder) {
				maxAlder = alder;
			}
		}
		out(maxAlder);		


		out("\nLambda: ");
		maxAlder = studenter.stream().map(Student::getAlder).reduce(Math::max).get();
		out(maxAlder);		
	}
}
