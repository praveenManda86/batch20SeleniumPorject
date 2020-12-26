package OOPSConcepts;

public class Test extends Hello {

	public void sub() {
	System.out.println("Subraction");
		
	}
	public void mul() {
	System.out.println("multiplication");	
		
	}

	public static void main(String[] args) {
		Test  obj = new Test();
		
		obj.add();
		obj.sub();
		obj.mul();
	
	}

	

}
