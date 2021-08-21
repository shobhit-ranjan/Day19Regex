import java.util.regex.Pattern;

public class MainMethodRegEx {

	public static void main(String[] args) {

	}

	public static boolean firstNameValidation(String name) {

		boolean valid = name.matches("[A-Z][a-z]*");

		return valid;
	}

	public static boolean lastNameValidation(String name) {

		boolean valid = name.matches("[A-Z]+([ '-][a-zA-Z]+)*");

		return valid;
	}

	public static boolean EmailValidation(String name) {
		{

			boolean regex = name.matches("^[A-Za-z0-9+_.-]+@(.+)$");

			return regex;
		}

	}
}
