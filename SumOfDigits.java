package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int num = 123;
		int sum = 0;
		while (num>0) {
			int remainder = num%10;
			System.out.println("The remainder is "+ remainder);
			sum = sum+remainder;
			System.out.println("The Sum is " + sum);
			num = num/10;
			System.out.println("The Quotient is " + num);
			
		}
	 System.out.println("Answer is " + sum);

	}

}
