package FL02.eks.lambda.forEach.object;

import static lib.Out.out;

import java.util.ArrayList;

import FL01.eks.tabell.object.Student;


public class StudentArrayListKlient {

	public static void main(String[] args) {

		ArrayList<Student> studenter = new ArrayList<Student>();

		Student student1 = new Student("Ole Petter", "Hansen", 19801212,"Mann");
		Student student2 = new Student("Ingrid", "Olsen", 197512101,"Kvinne");
		Student student3 = new Student("Åse Marie", "Jensen", 19730506,"Kvinne");

		studenter.add(student1);
		studenter.add(student2);
		studenter.add(student3);
		studenter.add(student1);

		out("\nUtskrift UTEN bruk av lambda:");
		for (Student s : studenter) {
			out(s);
		}		

		out("\nUtskrift MED bruk av lambda alt 1:");
		studenter.forEach(p->System.out.println(p));

		out("\nUtskrift MED bruk av lambda alt 2:");
		studenter.forEach(p->out(p));
	}
}

