package ArrayQuestions;

import java.util.Scanner;

public class EvenOrOddOccurences {
	
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements of an array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evenCount++;
			} else {
				oddCount++;
			}
		} 
		System.out.println("The odd counts: "+oddCount+" and even counts: "+evenCount);
	}

}
