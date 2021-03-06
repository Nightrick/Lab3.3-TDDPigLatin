public class PigLatin {


	public static String translate(String string1) {
		
		
		//Split input into a string array consisting of individual words
		String[] translationArray = string1.split(" ");
		String translatedString = "";
		
		for(int i = 0; i < translationArray.length; i++) {
			if(i > 0) {
				translatedString += " ";
			}
			translatedString += wordTranslator(translationArray[i]);
		}
		return translatedString;
		}
	
		public static boolean vowelChecker(char c) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				return true;
			} else {
				return false;
			}
		}
		
		public static String wordTranslator(String string1) {
			
			int vowelIndex  = -1;
			
			for(int i = 0; i < string1.length(); i++) {
				if(vowelChecker(string1.charAt(0))) {
					return string1 + "way";
				} else if (vowelChecker(string1.charAt(i))) {
					vowelIndex = i;
					break;
				}							
			}
			return string1.substring(vowelIndex) + string1.substring(0, vowelIndex) +"ay";
		}
}


