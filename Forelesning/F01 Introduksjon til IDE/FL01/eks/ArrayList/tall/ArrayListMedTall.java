package FL01.eks.ArrayList.tall;

import static lib.Out.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMedTall {

	public static void main(String[] args) throws IOException {
		ArrayList<Double> tallene = new ArrayList<Double>();
		BufferedReader br = null;
		
		String tallLest = "-1";
		br = new BufferedReader(new InputStreamReader(System.in));
		
		while (!tallLest.isEmpty()) {
			System.out.print("Oppgi et tall:  ");
            tallLest = br.readLine();	
			
			if (!tallLest.isEmpty()) {
				double tall = Double.parseDouble(tallLest);
				tallene.add(tall);
			}
		}

		out("\nTest 1");
		ArrayList<Object> o = new ArrayList<Object>(tallene);
		out(o);

		out("\nTest 2");
		Iterator<Double> tallIterator = tallene.iterator();
		while (tallIterator.hasNext()) {
			out(tallIterator.next());
		}
	}

}
