package ArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;
//with temp variable
public class ReverseArray { 
	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in an array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in an array before reversing:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		int i=0;
		int j=a.length-1;
		int temp;
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println("\nElements in array after reversing:"+Arrays.toString(a));
		
	}

}
