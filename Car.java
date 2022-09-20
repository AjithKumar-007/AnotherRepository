package day8Functions;

public class Car {
	String brand;
	int price;
	String color;
//for array	
public void findNetPrice(Car[] a,int taxAmount) {
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i].price+taxAmount); 
		
	}
	
}
//for individual object
public void findNetPrice(Car a,int taxAmount) {
	System.out.println(a.price+taxAmount);
}
public String findMax(Car[] a) {
	int max=0;
	for(Car x: a) {
		if(x.price>max) {
			max=x.price;
		}
		
	}
	return "Maximum Amount is "+max;
}
public String findMin(Car[] b) {
	int min=b[0].price;
	for(Car x: b) {
		if(x.price<min) {
			min=x.price;
		}
	}
	return "Minimum number is "+min;
	
	
	
	
	
	
	
	
}
}

