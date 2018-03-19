package CrackingTrhCodingInterview;

public class ReverseString {

	public static void main(String[] args) {
		String word = "Dog*bites*man";
		System.out.println( reverseWords(word));
	}
	
	static String reverseWords(String wordString) {
		StringBuilder sb = new StringBuilder();
 		String[] words = wordString.split("\\*");
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);
			sb.append("*");
		}
		return sb.toString().trim();

	}
}
