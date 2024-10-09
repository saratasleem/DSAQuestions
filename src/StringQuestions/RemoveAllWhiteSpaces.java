package StringQuestions;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		String s ="I love java and spring boot";
		System.out.println("String before removing the white spaces: "+s);
		s=s.replaceAll("\\s", "");
		System.out.println("String after removing the white spaces: "+s);

	}

}
