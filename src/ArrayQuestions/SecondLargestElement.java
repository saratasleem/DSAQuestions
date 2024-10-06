package ArrayQuestions;

import java.util.Scanner;

public class SecondLargestElement {
	public static void main(String[] args) {
		//int a[]= {6,7,3,2,9,8,1};
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in an array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in an array:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				secondLargest=largest;
				largest=a[i];
			} else if(a[i]>secondLargest && a[i]!=largest) {
				secondLargest=a[i];
			}
		}
		System.out.println("\nThe second largest element in an array: "+secondLargest);

	}

}
