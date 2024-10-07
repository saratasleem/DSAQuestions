package StringQuestions;

public class DivideStringInEqualParts {

	public static void main(String[] args) {
		String s="aaaabbbbcccc";
		int length=s.length();//store the length of string in length variable
		int n=3;//divisions or parts in which we want our string to be
		int temp=0;//storing & then incrementing
		int chars=length/n;  //whole length of string divided by the divisions
		String[] strarr=new String[n];
		if((length%n)!=0) {
			System.out.println("Sorry, this string cant be divided into "+n+"equal parts");
		} else {
			for(int i=0;i<length;i=i+chars) {
				String division=s.substring(i, i+chars);
				strarr[temp]=division;
				temp++;
			}
			System.out.println("The given string can be divided into "+n+" equal parts as:" );
			for(int i=0;i<strarr.length;i++) {
				System.out.println(strarr[i]);
			}
		}

	}

}
