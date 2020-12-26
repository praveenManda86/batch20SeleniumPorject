package OOPSConcepts;

public class Child extends Parent {
	
	int CX =10;
	int CY = 20;
	

	public void Add() {
		System.out.println("hi i am add method from child class");
	}

	public void CSub() {
		System.out.println("hi i am sub method from child class");
	}
	

	public static void main(String[] args) {
		
	Child cObj = new Child();  //OverRide
	Parent Pobj  = new Parent(); // Normal
	Parent upObj = new Child(); //Upcast

	Pobj.Add();
	
	}

}
