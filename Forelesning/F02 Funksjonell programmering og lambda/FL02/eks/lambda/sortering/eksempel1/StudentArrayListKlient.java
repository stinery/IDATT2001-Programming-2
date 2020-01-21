package FL02.eks.lambda.sortering.eksempel1;

import static lib.Out.out;

import java.util.ArrayList;
import java.util.Comparator;

import FL01.eks.tabell.object.Student;


public class StudentArrayListKlient {

	public static void main(String[] args) {

		//Definer listen studenter.
		ArrayList<Student> studenter = new ArrayList<Student>();

		Student student1 = new Student("Ole Petter", "Hansen", 19801212, "Mann");
		Student student2 = new Student("Ingrid", "Olsen", 19751210,"Kvinne");
		Student student3 = new Student("Åse Marie", "Jensen", 19730506,"Kvinne");

		studenter.add(student1);
		studenter.add(student2);
		studenter.add(student3);

		out("\nFør sortering:");
		studenter.forEach(s->out(s));
		

		out("\nSortering (tradisjonell måte:");		
		studenter.sort(new Comparator<Student>() {
			@Override
		    public int compare(Student a, Student b) {
		        return a.getNavn().compareTo(b.getNavn());
		    }			
		});
		studenter.forEach(s->out(s));
		
		out("\nSortering (med lambda:");
		studenter.sort((a,b)->a.getNavn().compareTo(b.getNavn()));
		studenter.forEach(s->out(s));

		out("\nSortering på fødselsdato (med lambda:");
		studenter.sort((a,b)->b.getFdato()-a.getFdato());
		studenter.forEach(s->out(s));
		
	}
}

