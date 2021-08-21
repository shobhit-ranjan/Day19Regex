
//import java.util.regex.Pattern;
import java.util.regex.*;

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

	public static boolean isValidMobileNo(String str) {

		Pattern ptrn = Pattern.compile("(0/91)?[6-9][0-9]{9}");

		Matcher match = ptrn.matcher(str);

		return (match.find() && match.group().equals(str));
	}

	public class PasswordValidator {

		// digit + lower case char + upper case char + punctuation + symbol
		private final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

		private final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

		public boolean isValid(final String password) {
			Matcher matcher = pattern.matcher(password);
			return matcher.matches();
		}

	}
}
