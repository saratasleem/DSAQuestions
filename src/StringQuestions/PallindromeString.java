package StringQuestions;

public class PallindromeString {

	public static void main(String[] args) {
		String st="bob";
		boolean flag=true;
		st=st.toLowerCase();
		for(int i=0;i<st.length()/2;i++) {
			if(st.charAt(i)!=st.charAt(st.length()-i-1)) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Yes,Pallindrome");
		} else {
			System.out.println("Sorry, not a Pallindrome");
		}
		
	}

}
