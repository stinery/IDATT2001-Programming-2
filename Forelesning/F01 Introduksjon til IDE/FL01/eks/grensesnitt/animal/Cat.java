package FL01.eks.grensesnitt.animal;

import static lib.Out.out;

public class Cat implements Animal {

	public void eat() {
		out("Cat eats");
	}

	public int noOfLegs() {
		return 4;
	}
}

