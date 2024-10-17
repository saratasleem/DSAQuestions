package NumberSystem;
//nth fibonacci num using recursion
public class FibonnaciNum {
	
	/*public static int fibo(int n) {
		//if(n<2) return n;
		if(n==0)return n;
		if(n==1)return n;
		return fibo(n-1)+fibo(n-2);
	}
	
	public static void main(String[] args) {
		System.out.println(FibonnaciNum.fibo(1));
	}*/
	static int n1=0, n2=1, n3=0;
	public static void fibo(int count) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibo(count-1);
		}
	}
	public static void main(String[] args) {
		int count=9;
		System.out.print(n1+" "+n2);
		fibo(count-2);
	}

}
