
public class MainMethodRegEx {

	public static void main(String[] args) {

	}

	public static boolean firstNameValidation(String name) {

		boolean valid = name.matches("(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$");

		return valid;
	}
}
