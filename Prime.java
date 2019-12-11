
public class Prime {

	public static void main(String[] args) {
		OddOrEven obj = new OddOrEven();
		System.out.println("Enter an integer number to check if it is prime or not:");
		int number = obj.getIntNumber();
		Prime primeObj = new Prime();
		boolean isPrime = primeObj.checkPrime(number);
		if (isPrime) System.out.println(number + " is prime");
		else 		 System.out.println(number + " is not prime");
	}
	
	public boolean checkPrime(int num) {
		if (num < 2) {
			return false;
		}
		/* 1.num has no other same pair factors greater than sqrt(num)
		   2.one of the pair factors of num must be <= sqrt(num)
		   3.loop from 2 to divisor until divisor*divisor becomes greater than num 
		*/
		int count = 0;
		for (int divisor = 2; divisor * divisor <= num ; divisor ++) {
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
