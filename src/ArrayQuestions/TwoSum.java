package ArrayQuestions;

import java.util.Scanner;

public class TwoSum {
	//by array
	public static int[] twoSumNums(int a[],int value) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==value) {
					int twoSumArr[] = {i,j};
					return twoSumArr;
				}
			}
		}
		return null;
	}
	public static void main(String[] args) {
		int a[]=new int[5];
		int twoSumArr[];
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in an array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();		
		}
		System.out.println("Elements that you've enetered:");
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");		
		}
		System.out.println("\nEnter some targetted value for which you want a two sum:");
		value=sc.nextInt();
		System.out.println("Two sum pair:"+TwoSum.twoSumNums(a, value));
	}

}
