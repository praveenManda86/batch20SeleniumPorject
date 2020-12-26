package OOPSConcepts;

public class ClassA implements Sample {
	
	
	public void add() {
	
	System.out.println("Hi i am add method from interface");	
	}


	public void sub() {
		
		System.out.println("Hi i am sub method from interface");	
	}

	public void mul() {
		System.out.println("Hi i am mul method from interface");	
		
	}

	

	public static void main(String[] args) {
		ClassA obj =  new ClassA();
		
		obj.add();
		obj.sub();
		obj.mul();

	}

}
