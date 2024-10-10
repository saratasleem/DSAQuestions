package StringQuestions;

public class FindDuplicateWords {
	
	public static void main(String[] args) {
		String s ="Big black bug bit a bug black dog ";
		int count;
		s=s.toLowerCase();
		String words[]=s.split(" ");
		System.out.println("Duplicate words in the string: ");
		for(int i=0;i<words.length;i++) {
			count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
			}
			if(count>1 && words[i]!="0") {
				System.out.println(words[i]);
			}
		}
	}

}
