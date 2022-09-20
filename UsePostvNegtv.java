package day8Functions;

public class UsePostvNegtv {
public static void main(String[]args) {
	PostvNegtv pn=new PostvNegtv();
	int[] nums= {-1,-2,-3,1,2,3,4};
	int[] values= {-87,-63,88,21,3,-87,-99};
//return with parameter	
	System.out.println(pn.findPostv(nums));
	System.out.println(pn.findPostv(values));
	
//void with parameter
	pn.findNegtv(nums);
	pn.findNegtv(values);
	
}
}
