package FL02.eks.lambda.streams.anyMatch;

import static lib.Out.out;

import java.util.ArrayList;

import FL01.eks.tabell.object.Student;


public class StudentArrayListKlient {

	public static void main(String[] args) {

		ArrayList<Student> studenter = new ArrayList<Student>();

		Student student1 = new Student("Ole Petter", "Hansen", 19801212, "Mann");
		Student student2 = new Student("Ingrid", "Olsen", 19751210,"Kvinne");
		Student student3 = new Student("Åse Marie", "Jensen", 19730506,"Kvinne");

		studenter.add(student1);
		studenter.add(student2);
		studenter.add(student3);

		
		out("\nTradisjonell måte: ");
		boolean womanExists = false; 
		for (Student student : studenter) {
		    if (student.getKjoenn() == "Kvinne") {
		        womanExists = true;
		        break;
		    }
		}		
		out(womanExists);
		
		
		out("\nMed lambda: ");
		out(studenter.stream().anyMatch(p -> p.getKjoenn() == "Kvinne"));
		
	}
}

