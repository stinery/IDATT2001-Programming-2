package FL01.eks.tabell.object;

import static lib.Out.*;

public class TabellAvObjKopiering {

	public static void main(String[] args) {
		Student[] gruppe = new Student[3];
		gruppe[0] = new Student("Kåre", "Ulfsen", 19801212, "Mann");
		gruppe[1] = new Student("Anders", "Vik", 19770510,"Kvinne");
		gruppe[2] = new Student("Tove", "Ås", 19831002,"Kvinne");

		out("Test 1:");
		out(gruppe);
		
		Student[] kopier = new Student[3];		
		
		for (int i = 0; i < gruppe.length; i++) {
			kopier[i] = gruppe[i];
		}
		
		out("Test 2:");
		out(kopier);
		
		gruppe[0].setFornavn("Birger");
		
		out("Test 3:");
		out(gruppe);

		out("Test 4:");
		out(kopier);

		gruppe[1] = new Student("Eva", "Ås", 19800506,"Kvinne");
		gruppe[2].setEtternavn("Bjørndal");
		
		out("Test 5:");
		out(gruppe);

		out("Test 6:");
		out(kopier);		
	}
}
