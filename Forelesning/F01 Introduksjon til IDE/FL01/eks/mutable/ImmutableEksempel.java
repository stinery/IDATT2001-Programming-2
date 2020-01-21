package FL01.eks.mutable;

public class ImmutableEksempel {

	private final String name;

	ImmutableEksempel (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	//no setter
	
	public static void main(String[] args) {

		ImmutableEksempel obj = new ImmutableEksempel("Ola");
		System.out.println(obj.getName());

	}
}
