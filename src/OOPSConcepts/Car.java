package OOPSConcepts;

public class Car extends Vehicle{
	
	int carwheels = 4;
	int carGears = 5;
	String carName = "Creata";
	
	public void autopark() {
		System.out.println("this is method of Car Class auto park");
	}
	
	public void reverse() {
		System.out.println("this is method of Car Class reverse");
	}

	public static void main(String[] args) {
     Car obj1 = new Car();


	}

}
