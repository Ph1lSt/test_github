package rekursion;

public class Sum {
	
	public static int calculateSum(int n) {
		if(n==0) {
			return 0;
		}else {
			return Integer.sum(calculateSum(n-1), n);
		}
	}

	public static void main(String[] args) {
		System.out.println(calculateSum(5));
	}
}
