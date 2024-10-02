package ArrayQuestions;

import java.util.Scanner;

public class SumOfAllElements {
	
	public static void main(String[] args) {
		int sum=0;
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some elements in an array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt(); //will take the value from user on ith position and fill till the length
		}
		System.out.println("Elements in array: ");//to print the elements of array entered by the user
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		    sum=a[i]+sum; //to do the sum
		}
		System.out.println("\nSum of array:"+sum);//to print the sum
	}
		

}
