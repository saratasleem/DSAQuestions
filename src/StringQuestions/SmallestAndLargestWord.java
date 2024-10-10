package StringQuestions;

public class SmallestAndLargestWord {

	public static void main(String[] args) {
		String s="Hardships often prepare ordinary people for an extraordinary destiny";
		s=s+"";
		String word="";
		String small="";
		String large="";
		String words[]=new String[100];
		int length=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				word=word+s.charAt(i);
			} else {
				words[length]=word;
				length++;
				word="";
			}
		}
		small=large=words[0];
		for(int k=0;k<length;k++) {
			if(small.length()>words[k].length()) {
				small=words[k];
			} else {
				if(large.length()< words[k].length()) {
					large=words[k];
				}
			}
		}
		System.out.println("The smallest word: "+small);
		System.out.println("The largest word: "+large);

	}

}
