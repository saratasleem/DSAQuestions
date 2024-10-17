package StringQuestions;

public class SeparateCharctersFromString {
	
	public static void main(String[] args) {
		String s="CHARACTERS";
		System.out.println("Individual characters from a given string:");
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}

}
