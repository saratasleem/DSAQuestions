package NumberSystem;

public class PallindromeNum {
	
	public static void main(String[] args) {
		int num=550;
		int temp;
		int sum =0;
		int remainder;
		temp=num;
		while(num>0) {
			remainder=num%10;
			sum=(sum*10)+remainder;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("The number is a pallindrome number");
		} else {
			System.out.println("The number is not a pallindrome number");
		}
		
	}

}
