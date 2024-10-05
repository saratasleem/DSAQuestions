package ArrayQuestions;

import java.util.Scanner;

public class NegativeElementsCount {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in array:");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		int negativeCount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				negativeCount++;
			}
		}
		System.out.println("The count of negative numbers in an array:"+negativeCount);

	}

}
