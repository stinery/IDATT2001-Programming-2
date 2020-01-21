package FL01.eks.aggregering;

import static lib.Out.out;

import java.util.ArrayList;

public class StudentClient {

	public static void main(String[] args) {
		ArrayList<Student> studenter = new ArrayList<Student>();
		
		Navn navn1 = new Navn("Odd Even","Primtallet");
		Poststed poststed1 = new Poststed(7000,"Trondheim");

		Navn navn2 = new Navn("Huppasahn","DelFinito");
		Poststed poststed2 = new Poststed(7001,"Trondheim");
		
		studenter.add(new Student(navn1,poststed1));
		studenter.add(new Student(navn2,poststed2));
		

		out(studenter);
	}

}
