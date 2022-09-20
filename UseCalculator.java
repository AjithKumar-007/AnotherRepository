package day8Functions;

public class UseCalculator {
public static void main(String[]args) {
	Calculator calc=new Calculator();
	
	System.out.println(calc.add());
	System.out.println(calc.findDivide(100,20));
	System.out.println(calc.multiply(23, 30, 30));
	
	
	calc.multiply();
	calc.findAvg(356,764,264);
	
}
}
