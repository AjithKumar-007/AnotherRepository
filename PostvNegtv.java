package day8Functions;

public class PostvNegtv {
//return with parameter	
	public String findPostv(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				System.out.println(a[i]);
			}
		}
		return "";
	}
	//void with parameter
	public void findNegtv(int[] b) {
		for(int i=0;i<b.length;i++) {
			if(b[i]<0) {
				System.out.println(b[i]);
			}
		}
	}

}
