
public class Prime3 {
	
	public static void main(String[] args) {
		OddOrEven obj = new OddOrEven();
		System.out.println("Enter an integer number to check if it is prime or not:");
		int number = obj.getIntNumber();
		Prime3 primeObj3 = new Prime3();
		boolean isPrime3 = primeObj3.checkPrime3(number);
		if (isPrime3) System.out.println(number + " is prime");
		else 		 System.out.println(number + " is not prime");
	}
	
	public boolean checkPrime3(int num) {
		if (num < 2) return false;
		if(num == 2) return true;
		if (num % 2 == 0) return false;
		int count = 0;
		for (int divisor = 3 ;divisor <= num/2 ; divisor+=2) {
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
