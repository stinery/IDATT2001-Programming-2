package FL01.eks.grensesnitt.animal;

import static lib.Out.*;

public class AnimalClient {

	public static void main(String args[]) {

		Dog d = new Dog();
		d.eat();
		d.travel();

		Cat c = new Cat();
		c.eat();

		Animal animalDog = (Animal) new Dog();
		animalDog.eat();
		out(animalDog.noOfLegs());
		
		Animal animalCat = (Animal) new Cat();
		animalCat.eat();
		out(animalDog.noOfLegs());

		Animal animalRooster = (Animal) new Rooster();
		animalRooster.eat();
		out(animalRooster.noOfLegs());
	}
}
