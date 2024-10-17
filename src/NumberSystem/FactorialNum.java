package NumberSystem;

public class FactorialNum {
	static int factoNum(int num) {
		if(num==0) {
			return 1;
		} else {
			return (num*factoNum(num-1));
		}
		
	}
	public static void main(String[] args) {
		int num=9;
		System.out.println("Factorial of number "+num+" is: "+FactorialNum.factoNum(num));
	}

}
