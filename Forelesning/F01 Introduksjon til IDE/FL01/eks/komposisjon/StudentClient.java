package FL01.eks.komposisjon;

import java.util.ArrayList;
import static lib.Out.*;

public class StudentClient {

	public static void main(String[] args) {
		ArrayList<Student> studenter = new ArrayList<Student>();
		
		studenter.add(new Student("Odd Even", "Primtallet",31122001,7000,"Trondheim"));
		studenter.add(new Student("Huppasahn", "DelFinito",01122002,7001,"Trondheim"));

		out(studenter);
	}

}
