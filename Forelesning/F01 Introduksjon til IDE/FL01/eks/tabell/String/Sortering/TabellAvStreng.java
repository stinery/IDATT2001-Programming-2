package FL01.eks.tabell.String.Sortering;

import static lib.Out.out;

import java.util.Arrays;

public class TabellAvStreng {

	public static void main(String[] args) {
		String[] navneliste = new String[7];
		String soekeStreng="Kristian";
		
		navneliste[0] = "Hanne";
		navneliste[1] = "Berit";
		navneliste[2] = "Hans";
		navneliste[3] = "Olav";
		navneliste[4] = "Morten";
		navneliste[5] = "Janne";
		navneliste[6] = "Kristian";
		
		out("\nUtskrift 1 (ikke sorter, søk): ");		
		int i = Arrays.binarySearch(navneliste, soekeStreng);
		out(i);
		if (i>-1) {
			out(i+":"+navneliste[i]);
		}
		
		out("\nUtskrift 2 (sorter, søk):");		
		Arrays.sort(navneliste);
		out(navneliste);
		i = Arrays.binarySearch(navneliste, soekeStreng);
		out(i);
		if (i>-1) {
			out(i+":"+navneliste[i]);
		}		
	}
}

