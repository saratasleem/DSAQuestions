package StringQuestions;

public class CountVowelsOrConsonants {

	public static void main(String[] args) {
		String str="Hello Jenny, you are awesome";
		int countVowel=0;
		int countConsonants=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				countVowel++;
			} else {
				countConsonants++;
			}
		}
      System.out.println("The total vowel: "+countVowel);
      System.out.println("The total consonants: "+countConsonants);
      
	}

}
