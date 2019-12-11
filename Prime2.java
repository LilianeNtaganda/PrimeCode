
public class Prime2 {

	public static void main(String[] args) {
		OddOrEven obj = new OddOrEven();
		System.out.println("Enter an integer number to check if it is prime or not:");
		int number = obj.getIntNumber();
		Prime2 primeObj2 = new Prime2();
		boolean isPrime2 = primeObj2.checkPrime2(number);
		if (isPrime2) System.out.println(number + " is prime");
		else 		 System.out.println(number + " is not prime");
	}
	
	public boolean checkPrime2(int num) {
		if (num < 2) return false;
		int count = 0;
		for (int divisor = 2 ;divisor <= num/2 ; divisor ++) {
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
