package ArrayQuestions;

import java.util.Scanner;

public class LastOccurence {
	int num;
	public static int lastOccurence(int a[],int num) {
		int value=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
			   value = i;
			}
		} return value;
	}

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in array:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter the element whose last occuring index you want to know :");
		int num = sc.nextInt();
		System.out.println("This number occurs:"+LastOccurence.lastOccurence(a, num));
	}

}
