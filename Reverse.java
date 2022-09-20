package day8Functions;

public class Reverse {
public String findName(String name) {
	String temp="";
	for(int i=name.length()-1;i>=0;i--) {
		temp=temp+name.charAt(i);
	}
	return temp;
}
}
