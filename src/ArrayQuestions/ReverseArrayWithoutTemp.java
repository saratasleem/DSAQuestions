package ArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayWithoutTemp {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the elements in an array:");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Elements in an array before reversing:");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		int i=0; //first-index pointing to zero
		int j=a.length-1;//last index pointing to 4th index
		while(i<j) {
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			i++;
			j--;
		}
		System.out.println("\nElements in an array after reversing:"+Arrays.toString(a));

	}

}
