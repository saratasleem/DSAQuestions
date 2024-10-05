package ArrayQuestions;

import java.util.Scanner;

public class StrictlyGreaterElements {
	public static int strictlyGreater(int a[], int num) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>num) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int a[]=new int[6];
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number from above array whose strictly greater element you want to know:");
		num=sc.nextInt();
		System.out.println("Strictly greater value:"+StrictlyGreaterElements.strictlyGreater(a, num));
	
	
	}

}
