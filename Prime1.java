
public class Prime1 {
	
	public static void main(String[] args) {
		OddOrEven obj = new OddOrEven();
		System.out.println("Enter an integer number to check if it is prime or not:");
		int number = obj.getIntNumber();
		Prime1 primeObj1 = new Prime1();
		boolean isPrime1 = primeObj1.checkPrime1(number);
		if (isPrime1) System.out.println(number + " is prime");
		else		  System.out.println(number + " is not prime");
	}
	
	public boolean checkPrime1(int num) {
		if (num < 2) return false;
		int count = 0;
		for (int divisor = 2 ;divisor < num ; divisor ++) {
			count++;
			if (num % divisor == 0){
				System.out.println("loop count:" + count);
				return false;
			}
		}
		System.out.println("loop count:" + count);
		return true;
	}

}