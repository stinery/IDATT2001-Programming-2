package FL02.eks.lambda.streams.filter;

import static lib.Out.out;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		List<Student> kvinner = new ArrayList<Student>();
		for (Student student : studenter) {
		    if (student.getKjoenn() =="Kvinne") {
		    	kvinner.add(student);
		    }
		}
		out(kvinner);
		
		
		out("\nMed lambda: ");
		kvinner=studenter.stream().filter(p -> p.getKjoenn() == "Kvinne").collect(Collectors.toList());	
		out(kvinner);
	}
}

