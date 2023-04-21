package bozovic.milos;

import java.util.regex.*;

public class Primer1 {

	public static void main(String[] args) {

		// Prvi način

		// jedna tačka pretstavlja jedan karakter
		Pattern p = Pattern.compile("..s");
		Matcher m = p.matcher("pas");

		boolean b = m.matches();

		// Drugi način

		boolean b2 = Pattern.compile("..s").matcher("as").matches();

		// Treći način

		boolean b3 = Pattern.matches("..s", "pas");

		System.out.println("Prvi način: " + b + "\nDrugi način: " + b2 + "\nTreći način: " + b3);

	}

}
