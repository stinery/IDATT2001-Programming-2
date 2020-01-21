package FL01.eks.ArrayList.object;

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

		out("\nTest 1:");
		Object s = studenter.get(0);		
		out(s);
		
		out("\nTest 2:");
		ArrayList<Object> o = new ArrayList<Object>(studenter);
		out(o);
		
		out("\nTest 3:");
		o.remove(2);
		out(o);

		out("\nTest 4:");
		o = new ArrayList<Object>(studenter);
		out(o);
		
		out("\nTest 5:");
		studenter.remove(student1);
		
		studenter.get(1).setEtternavn("Andersen");
		o = new ArrayList<Object>(studenter);
		out(o);
		
	}
}

