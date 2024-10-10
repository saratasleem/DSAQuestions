package StringQuestions;

public class MaxOccuringChar {

	public static void main(String[] args) {
		 String s="Nothing comes easy";
		 /*int[] freq = new int[s.length()];
         char maxCharacter=s.charAt(0);
         char minCharacter=s.charAt(0);
         int i,j,min,max;
         char[] ch = s.toCharArray();
         for(i=0;i<ch.length;i++) {
        	 freq[i]=1;
        	 for(j=1+1;j<ch.length;j++) {
        		 if(ch[i]==ch[j] && ch[i]!=' ' && ch[i]!='0') {
        			 freq[i]++;
        			 ch[j]='0';
        		 }
        	 }
        	 min = max = freq[0];
        	 for(i=0;i<freq.length;i++) {
        		 if(min>freq[i] && freq[i]!='0') {
        			 min=freq[i];
        			 minCharacter=ch[i];
        		 }
        		 
        		 if(max<freq[i]) {
        			 max=freq[i];
        			 maxCharacter=ch[i];
        		 }
        	 }
        	 
        	 System.out.println("The min occuring character: "+minCharacter);
        	 System.out.println("The max occuring character: "+maxCharacter);
        	 
         }*/
		 int arr[]=new int[127];
		 for(int i=0;i<s.length();i++) {
			 arr[s.charAt(i)]=arr[s.charAt(i)] + 1;
		 }
		 int max=-1;
		 char c=' ';
		 for(int i=0;i<s.length();i++) {
			 if(max<arr[s.charAt(i)]) {
				 max=arr[s.charAt(i)];
				 c=s.charAt(i);
			 }
		 }
         System.out.println("The maximum occurring character: "+c);
	}

}
