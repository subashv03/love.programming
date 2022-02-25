package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		int addition = Calculator.add(10, 20, 30);
		System.out.println(addition);
        int subtraction = Calculator.sub(20, 10);
        System.out.println(subtraction);
        double multiplication = Calculator.mul(10, 20);
        System.out.println(multiplication);
        float division = Calculator.divide(20.4f, 10.4f);
        System.out.println(division);		
	}

}
