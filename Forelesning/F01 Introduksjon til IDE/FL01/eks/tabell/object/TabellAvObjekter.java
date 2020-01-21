package FL01.eks.tabell.object;

import static lib.Out.out;


public class TabellAvObjekter {

	public static void main(String[] args) {

		// Alternativ 1:
		Student[] gruppe1 = new Student[3];
		gruppe1[0] = new Student("Kåre", "Ulfsen", 19801212,"Mann");
		gruppe1[1] = new Student("Anders", "Vik", 19770510,"Kvinne");
		gruppe1[2] = new Student("Tove", "Ås", 19831002,"Kvinne");

		out(gruppe1);

		// Alternativ 2:
		Student[] gruppe2 = { new Student("Nils", "Tesdal", 19801212,"Mann"), 
							  new Student("Majid", "Rouhani", 19770510,"Mann"),							  
							};
		
		out(gruppe2);

	}
}
