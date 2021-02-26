package ep;

import java.util.regex.Pattern;

public class Email2_18 {

	public static boolean isValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
						"[a-zA-Z0-9_+&*-]+)*@" +
						"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
						"A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		if (email ==null)
			return false;
		return pat.matcher(email).matches();
		
	}
	public static void main(String[] args) {
		String email = "maltpearl@gmail.com";
		if (isValid(email))
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}
