package day8Functions;

public class OddEven {
	//return without parameter
public String findEven() {
	int num=5;
	if(num%2==0) {
		return "It is even number";
	}
	else {
		return "It is odd number";
	}
}
//return with parameter
public String findOdd(int num) {
	if(num%2!=0) {
		return "It is odd number";
		
	}
	else {
		return "It is even number";
	}
}

}
