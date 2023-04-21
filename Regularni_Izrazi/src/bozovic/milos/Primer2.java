package bozovic.milos;

import java.util.regex.*;

public class Primer2 {

	public static void main(String[] args) {

		
	
	System.out.println(Pattern.matches("[amn]", "abcd"));//false (nije samo jedno a ili jedno m ili jedno n)  
	System.out.println(Pattern.matches("[amn]", "a"));//true (ima samo jedno a, prihvatio bi i samo jedno m ili samo jedno n)  
	System.out.println(Pattern.matches("[amn]", "ammmna"));//false (nije samo jedno a ili jedno m ili jedno n)  	
	
	System.out.println(Pattern.matches("[amn]?", "a"));//true (samo jedno a ili jedno m ili jedno n)  
	System.out.println(Pattern.matches("[amn]+", "a"));//true (jedno a ili jedno m ili jedno n ili više)  	
	System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a ili m ili n se pojavljuju od nula do više puta)  
	
	System.out.println(Pattern.matches("\\d", "abc"));//false (nije cifra)  
	System.out.println(Pattern.matches("\\d", "1"));//true (cifra i pojavljuje se jednom) 
	
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true (sva mala i sva velika slova i sve cifre)
	
	System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (očekuje se 9 cifara, a ima ih 11) 
	
	}

}
