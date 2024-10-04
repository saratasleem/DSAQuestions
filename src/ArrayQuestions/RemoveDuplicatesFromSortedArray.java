package ArrayQuestions;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
	public static int removeDuplicates(int a[]) {
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[j]!=a[i]) {
				a[j+1] =a[i];
			}
		}
		return j+1;
	}
	
	public static void main(String[] args) {
		int a[]=new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in array in sorted order:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in array:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nAfter removing duplicates:"+RemoveDuplicatesFromSortedArray.removeDuplicates(a));	}
 
}
