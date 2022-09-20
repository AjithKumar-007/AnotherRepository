package day8Functions;

public class Calculator {
	//return without parameter
	public String add() {
		String a="Hi";
		String b="Hello";
		return (a+b);
	//return with parameter	
	}
	public int findDivide(int num1,int num2) {
		return num1/num2;
		
	}
	public String multiply(int num1,int num2,int num3) {
		return "Multiply="+(num1*num2*num3);
	}
	//void without parameter
	public void multiply(){
		System.out.println(10*15);
		
	}
	//void with parameter
	public void findAvg(int tamil,int eng, int maths){
		System.out.println((tamil+eng+maths)/2);
		
	}
}
