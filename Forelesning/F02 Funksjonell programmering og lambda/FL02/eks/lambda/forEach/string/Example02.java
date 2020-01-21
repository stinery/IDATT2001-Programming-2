package FL02.eks.lambda.forEach.string;

import static lib.Out.out;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Example02 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Hans");
		names.add("Ola");
		
		out("\nUten lambda, alternativ 1");
		for (int i=0;i<names.size();i++) {
			out(names.get(i));
		}

		out("\nUten lambda, alternativ 2");
		for (String name: names) {
			out(name);
		}
		
		out("\nBruk av lambda");		
		
		Consumer<String> con = s -> out(">"+s+"<");
		
		con.accept("Hei!");
		
		names.forEach(con);
	
	}
}
