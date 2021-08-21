
public class MainMethodRegEx {

	public static void main(String[] args) {

	}

	public static boolean firstNameValidation(String name) {

		boolean valid = name.matches( "[A-Z][a-z]*");

		return valid;
	}
}
