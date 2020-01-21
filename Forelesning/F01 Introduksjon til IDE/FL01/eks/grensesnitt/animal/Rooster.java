package FL01.eks.grensesnitt.animal;

import static lib.Out.out;

public class Rooster implements Animal {

   public void eat() {
      out("Rooster eats");
   }

   public int noOfLegs() {
      return 2;
   }
} 