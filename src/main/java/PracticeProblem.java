public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String[] addString(String[] wordArr, String word, int index) {
		String[] modWordArr = new String[wordArr.length + 1];
		for (int start = 0; modWordArr.length > start; start++) {
			if (start < index) {
			modWordArr[start] = wordArr[start];
			}
			else if (start == index) {
				modWordArr[start] = word;
			}
			else {
			modWordArr[start] = wordArr[start - 1];
			} 
		}
		return modWordArr;
	}

	public static char[] removeChars(char[] letterArr, char letter) {
		int counter = 0;
		for (int start = 0; start < letterArr.length; start++) {
			if (letterArr[start] == letter) {
				counter++;
			}
		}
		char[] modLetterArr = new char[letterArr.length - counter];
		int charIndex = 0;
		for (int start = 0; start < letterArr.length; start++) {
			if (letterArr[start] != letter) {
				modLetterArr[charIndex] = letterArr[start];
				charIndex++;
			}
		}
		return modLetterArr;
	}
}
