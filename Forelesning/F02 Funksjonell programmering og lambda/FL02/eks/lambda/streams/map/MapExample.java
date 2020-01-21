package FL02.eks.lambda.streams.map;

import static lib.Out.out;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import FL01.eks.tabell.object.Student;

public class MapExample {

	public static void main(String[] args) {

		ArrayList<Student> studenter = new ArrayList<Student>();
		studenter.add(new Student("Ole Petter", "Hansen", 19801212,"Mann"));
		studenter.add(new Student("Ingrid", "Olsen", 197512101,"Kvinne"));
		studenter.add(new Student("Åse Marie", "Jensen", 19730506,"Kvinne"));

		
		out("\nTradisjonell måte: ");
		List<Integer> fDatoer = new ArrayList<Integer>();		
		for (Student student : studenter) {
			fDatoer.add(student.getFdato());
		}
		out(fDatoer);				

		out("\nLambda: ");
		fDatoer = studenter.stream().map(Student::getFdato).collect(Collectors.toList());
		out(fDatoer);		
	}
}
