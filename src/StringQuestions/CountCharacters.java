package StringQuestions;

public class CountCharacters {
	public static void main(String[] args) {
		String st = "My name is Sara";
		int count=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("Occurences of characters: "+count);
	}

}
