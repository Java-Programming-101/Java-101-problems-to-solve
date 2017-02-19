package translator;

public class MainApp {
	
	/*
	 * The purpose of this program is to translate a string to or from pig latin to english or vice versa.
	 * 
	 * Pig Latin is where you take the first letter of the word and move it to the end and add "ay"
	 * 
	 * eg. "The" becomes "hetay"
	 */

	public static void main(String[] args) {
		
		
		String english = "The quick brown fox";
		String pig = "hetay uickqay rownbay oxfay";
		
		Translator.translator(english);
		Translator.translator(pig);
	}
	
	
}
