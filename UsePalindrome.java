package day8Functions;

public class UsePalindrome {
public static void main(String[]args) {
	Palindrome pl=new Palindrome();
	//void without parameter
	pl.palindrome();
	//void with parameter
	pl.findPalindrome("Malayalam");
	pl.findPalindrome("Hello");
	
	
}
}
