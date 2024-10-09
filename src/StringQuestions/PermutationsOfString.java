package StringQuestions;

public class PermutationsOfString {
	
public static String swapstring(String a, int i, int j) {
		char[] b=a.toCharArray();//putting char array for string a in b
		char ch;//temporary char variable
		ch=b[i];//swapping technique with third variable for int i which is start and int j which is end
		b[i]=b[j];
		b[j]=ch;
		return String.valueOf(b);
	}
	public static void generatePermutation(String s,int start,int end){
		if(start==end-1) {
			System.out.println(s);
		} else {
			for(int i=start;i<end;i++) {
				s=swapstring(s,start,i);
				generatePermutation(s,start+1,end);
				s=swapstring(s,start,i);
			}
		}
	}

	public static void main(String[] args) {
		String s="ABC";
        int len = s.length();
        System.out.println("All possible permutations are:");
        generatePermutation(s,0,len);
	}

}
