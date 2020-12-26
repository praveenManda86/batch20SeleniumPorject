package OOPSConcepts;

public class MethodExamples {

	public MethodExamples() {
		int A = 10;
		int B = 20;
	}

	public static void add() { // Static method Without Return type (Class)
		int A = 10;
		int B = 20;
		System.out.println(A + B);
	}

	public static int sub() { // Static method with Return type (Class)
		int C = 10;
		int D = 20;
		int X = C + D;  //30 -int
		return X; // 30 C,D,X = Local Variables
	}

	public void mul() { // NON_ Static method without Return Type (Object)
		int A = 10;
		int B = 20;
		System.out.println(A + B);
	}

	public int div() { // NON_ Static method with Return Type (Object)
		int C = 10;
		int D = 20;
		System.out.println(C + D);
		return C + D;
	}

	public static void main(String[] args) {

		MethodExamples obj = new MethodExamples();

		obj.div();
		obj.mul();

		MethodExamples.add();
		MethodExamples.sub();

	}

}
