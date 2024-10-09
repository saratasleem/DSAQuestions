package StringQuestions;

public class SubsetsOfString {

	public static void main(String[] args) {
		String s="Fun";
		int length=s.length();
		int temp=0;
		String[] strarr=new String[length*(length+1)/2];
		for(int i=0;i<length;i++) {
			for(int j=i;j<length;j++) {
				strarr[temp]=s.substring(i, j+1);
				temp++;
			}
		}
		System.out.println("The possible subsets of the string are:");
		for(int i=0;i<strarr.length;i++) {
			System.out.println(strarr[i]);
		}
	}

}
