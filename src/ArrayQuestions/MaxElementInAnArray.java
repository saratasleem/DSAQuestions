package ArrayQuestions;

import java.util.Scanner;

public class MaxElementInAnArray {
	public static void main(String[] args) {
		int max;
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in an array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum element in an array:"+max);
	}

}
