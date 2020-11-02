package endrekursion;

public class enrekursionAusfuehrung {

	public static void main(String[] args) {
		System.out.println(aretmetischereihe(5));
	}
	
	public static int aretmetischereihe (int n) {
		if(n == 0) {
			return 0;
		}else {
			 return aretmetischereihe(n-1)+n;
		}
	}
	
	public static int potenz (int b, int p) {
		if(p == 1) {
			return b;
		}else{
			return b *potenz (b, p-1);
		}
	}
	
	public static int fibonacciRekursiv(int n) {
		if(n < 2){
			return 1;
		}else {
			return fibonacciRekursiv(fibonacciRekursiv(n-1) + fibonacciRekursiv(n-2));
		}
	}
	
	 public static int fib0(int x, int y, int i, int n) {
	        if (i > n)
	            return y;
	        else
	            return fib0(y, x + y, i + 1, n);
	    }
	 public static int fib(int n) {
	        return fib0(1, 1, 2, n);
	    }

}
