package JavaPrograms;

public class MethodsExample {

	public void add() {
		int A = 10;   //inside method 
		int B = 20;
		System.out.println(A + B);
	}

	public void multiply() {
		int C = 30;
		int D = 40;
		System.out.println(C * D);
	}

	public void sub() {
		int X = 5;
		int Y = 6;
		System.out.println(X - Y);
	}

	public static void main(String[] args) {

		MethodsExample  obj  = new MethodsExample();	
		
		obj.add();
		obj.multiply();
		obj.sub();
		
	}

}
