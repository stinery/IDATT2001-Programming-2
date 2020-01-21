package FL01.eks.tabell.object.sortering.eks2;

import static lib.Out.out;

import java.util.ArrayList;

/**
 * SorteringAvFlater.java - "Programmering i Java", 4.utgave - 2009-07-01
 *
 * Prøver sorteringsmetodene på en tabell av Flate-objekter
 */
class FlaterKlient {
	public static void main(String[] args) {
		ArrayList<Flate> flater = new ArrayList<>();
		
		flater.add(new Flate("E", 10, 6));
		flater.add(new Flate("B", 1, 50));
		flater.add(new Flate("Ø", 1, 50));
		flater.add(new Flate("F", 5, 7));
		flater.add(new Flate("A", 5, 80));
		

		out("\nUten sortering:");
		out(flater);
		
		
		flater.sort(new FlateKompAreal());
		out(flater);
		
		flater.sort(new FlateKompOmkrets());		
		out(flater);
		
	}
}
