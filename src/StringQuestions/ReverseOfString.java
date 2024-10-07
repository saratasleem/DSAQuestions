package StringQuestions;

public class ReverseOfString {

	public static void main(String[] args) {
		String str="Jenny you are just awesome";
		int count=0;
		char[] strtochatarr=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
		    System.out.print(strtochatarr[i]);	 
		}

	}

}
