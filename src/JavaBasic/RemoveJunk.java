package JavaBasic;

public class RemoveJunk {

	public static void main(String[] args) {
		// Use Regular Expression to remove junk values

		String s = "$$$$12 3%%%abc##A";

		s = s.replaceAll("[^a-z A-Z0-9]", "");
		System.out.println(s);
	}

}
