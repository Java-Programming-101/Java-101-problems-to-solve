package translator;

public class Translator {
	public static void translator(String s) {
		String[] aStrings = s.split(" ");
		
		boolean isEnglish = false;
		
		for(String string: aStrings){
			String sub= string.substring(string.length()-2);
			if (sub.equals("ay")){
				continue;
			}else{
				isEnglish = true;
			}
		}
		
		
		if (isEnglish) {
			System.out.println("Language detected: English \n"
					+ "Will be translated to PigLatin. . .");
			translateToPigLatin(s);
		}else {
			System.out.println("Language detected: PigLatin \n"
					+ "Will be translated to English. . .");
			translateToEnglish(s);
		}
		
	}

	public static void translateToPigLatin(String s) {
		s=s.toLowerCase();
		String[] array = s.split(" ");
		StringBuilder pigString = new StringBuilder();
		
		for(String aString: array){
			StringBuilder sBuilder = new StringBuilder();
			String firstletter = aString.substring(0, 1).toLowerCase();
	
			sBuilder.append(aString.substring(1));
			sBuilder.append(firstletter);
			sBuilder.append("ay");
			pigString.append(sBuilder + " ");
		}
		
		pigString.replace(0, 1, pigString.substring(0, 1).toUpperCase());
		
		System.out.println(pigString);
	}
	
	
	public static void translateToEnglish(String s){
		s = s.toLowerCase();
		String[] array = s.split(" ");
		StringBuilder englishString = new StringBuilder();
		
		for (String aString : array){
			StringBuilder englishString2 = new StringBuilder();
			englishString2.append(aString.substring(0, aString.length()-3));
			englishString2.insert(0, aString.charAt(aString.length()-3));
			englishString.append(englishString2 + " ");
			
		}
		englishString.replace(0, 1, englishString.substring(0, 1).toUpperCase());
		System.out.println(englishString);
	}
}
