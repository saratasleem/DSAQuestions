package StringQuestions;

public class SwapStringWithoutThirdVar {
	
	public static void main(String[] args) {
		String s1="good";
		String s2="morning";
		System.out.println("Strings before swapping: ");
		System.out.println("First string: "+s1);
		System.out.println("Second string: "+s2);
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("\nStrings after swapping: ");
		System.out.println("First string: "+s1);
		System.out.println("Second string: "+s2);
	}

}
