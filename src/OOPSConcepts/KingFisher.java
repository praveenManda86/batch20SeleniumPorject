package OOPSConcepts;

public class KingFisher extends Plane {

	public void takeOff() {
		System.out.println("This is take off method from kingfisher class");
	}

	public void landing() {
		System.out.println("I am landing method from Kingfisher Class");
	}

	public static void main(String[] args) {

		Plane obj2 = new Plane();

		KingFisher obj = new KingFisher();

		obj.takeOff();
		obj2.takeOff();
	}

}
