package src;

import java.util.regex.Pattern;

public class Validacoes {
	public static boolean validaEmail(String email) {
		String PADRAO_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern padrao = Pattern.compile(PADRAO_EMAIL);

		return padrao.matcher(email).matches();
	}
}
