package day8Functions;

public class Palindrome {
//void without parameter
	public void palindrome(){
		String word="Madam";
		String temp="";
		for(int i=word.length()-1;i>=0;i--) {
			temp=temp+word.charAt(i);
		}
		if(temp.equalsIgnoreCase(word)) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
		
	}
	
	//void with parameter
	public void findPalindrome(String word) {
		String temp="";
		for(int i=word.length()-1;i>=0;i--) {
			temp=temp+word.charAt(i);
		}
		if(temp.equalsIgnoreCase(word)) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
	}
} 
 