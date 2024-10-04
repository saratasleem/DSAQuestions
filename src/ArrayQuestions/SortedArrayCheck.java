package ArrayQuestions;

import java.util.Scanner;

public class SortedArrayCheck {
	public static boolean sortedArrayorNot(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int a[]=new int[7];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in an array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();		
			}
		System.out.println("Elements in an array:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");	
		}
		System.out.println("\nResult: "+SortedArrayCheck.sortedArrayorNot(a));
	}

}
