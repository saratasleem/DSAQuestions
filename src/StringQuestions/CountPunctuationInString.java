package StringQuestions;

public class CountPunctuationInString {

	public static void main(String[] args) {
	String str = "Oh! Its too hot.";
	int count=0;
	for(int i=0;i<str.length();i++) {
		if((str.charAt(i)=='!')||(str.charAt(i)=='.')||(str.charAt(i)=='?')||(str.charAt(i)==',')||(str.charAt(i)=='-')||(str.charAt(i)=='\"')||(str.charAt(i)==';')||(str.charAt(i)==':')||(str.charAt(i)=='\'')) {
			count++;
		}
	}
	System.out.println("The punctuation characters in string: "+count);
	
}
}