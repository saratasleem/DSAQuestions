package StringQuestions;

public class RotationOfString {

	public static void main(String[] args) {
		String s1="abcde";
		String s2="deabc";
		if(s1.length()!=s2.length()) {
			System.out.println("Sorry, they cant be a rotation strings");
		} else {
			 s1 = s1.concat(s1); //concatenated string
			 if(s1.indexOf(s2)!=-1) {
				 System.out.println("Yes, Rotation");
			 } else {
				 System.out.println("Not a Rotation");
			 }
			
		}
	

	}

}
