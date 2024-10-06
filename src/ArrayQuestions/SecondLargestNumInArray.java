package ArrayQuestions;

import java.util.Scanner;
//with a approach which first sort the whole array & then look for the desired output
public class SecondLargestNumInArray {
	
	public static void main(String[] args)
	{
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in an array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in an array:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) { //change it to > for second smallest
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			/*	if(i==2) {
					break; //this block will sort the array uptill 1 index position
				}*/
			}
		}
		//System.out.println("\nElements that have been sorted:");
		/*for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" "); to check where it has sorted
		}*/
		System.out.println("\nThe second largest element in an array:"+a[1]);
	}

}
