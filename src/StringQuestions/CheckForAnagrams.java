package StringQuestions;

import java.util.Arrays;

public class CheckForAnagrams {
	
	public static void main(String[] args) {
		String st="Sara";
		String str="Asra";
		//converting to lower-case
		st=st.toLowerCase();
		str=str.toLowerCase();
		//checking the length
		if(st.length()!=(str.length())) {
			System.out.println("Sorry, cant be anagrams already.");
		} else {
		//convert to charArray()
		char[] stChar=st.toCharArray();
		char[] strChar=str.toCharArray();
		//sort the char
		Arrays.sort(stChar);
		Arrays.sort(strChar);
		//compare using the built-in arrays function
		if(Arrays.equals(stChar, strChar)==true) {
			System.out.println("Yes,anagrams.");
		} else {
			System.out.println("Sorry,not an anagrams.");
		}
	  }
	}

}
