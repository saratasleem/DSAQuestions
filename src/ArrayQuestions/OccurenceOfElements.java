package ArrayQuestions;

import java.util.Scanner;

public class OccurenceOfElements {
	int num;
	public static int occurence(int a[],int num) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				count++;
			}
		}
		return count;
	}
       public static void main(String[] args) {
    	   int a[] = new int[5];
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter the elements in array:");
    	   for(int i=0;i<a.length;i++) {
    		   a[i]=sc.nextInt();
    	   }
    	   System.out.println("Elements in array:");
    	   for(int i=0;i<a.length;i++) {
    		   System.out.print(a[i]+" ");
    	   }
    	   System.out.println("\nEnter the element whose occurence you want to check:");
    	   int num=sc.nextInt();
    	   
    	   System.out.println("This element occurs: "+OccurenceOfElements.occurence(a, num));
       }
}
