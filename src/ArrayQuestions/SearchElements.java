package ArrayQuestions;

import java.util.Scanner;

public class SearchElements {
	//int a[] = new int[5];
	int num;
	public static int searchElement(int a[],int num) {
		for(int i=0;i<a.length;i++) {
			if(num == a[i]) {
				return i;
				} 
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in an array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in array:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter the element that you want to search:");
		int num = sc.nextInt();
		System.out.println("The element that you're looking for is on the position: "+SearchElements.searchElement(a,num));
		
	}

}
