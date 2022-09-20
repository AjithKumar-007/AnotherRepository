package day8Functions;

public class UseCar {
public static void main(String[]args) {
	Car car1=new Car();
	car1.brand="BMW";
	car1.price=7000000;
	car1.color="Red";
	
	Car car2=new Car();
	car2.brand="Benz";
	car2.price=6000000;
	car2.color="White";
	
	Car car3=new Car();
	car3.brand="Rolls Royce";
	car3.price=10000000;
	car3.color="Black";
	
	Car car4=new Car();
	car4.brand="Lamborghini";
	car4.price=8500000;
	car4.color="Yellow";
	//taking array as datatype
	Car[] cars= {car1,car2,car3,car4};
	/*car1.findNetPrice(cars,1200000);
	
	
	System.out.println(" ");
	
	//taking object as datatype
	car1.findNetPrice(car1,800000);
	car1.findNetPrice(car2,700000);
	car1.findNetPrice(car3, 90000);
	car2.findNetPrice(car4, 600000);*/
	
	//return with parameter
	System.out.println(car1.findMax(cars));
	System.out.println(car1.findMin(cars));
			
}
}
