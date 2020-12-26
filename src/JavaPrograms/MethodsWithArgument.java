package JavaPrograms;

public class MethodsWithArgument {

	public static void add(int A, int B, int D) {
		
		System.out.println(A + B  + D);
	}

	public static void sub(int C, int D) {
		System.out.println(C - D);
	}

	public static void main(String[] args) {
	
		MethodsWithArgument.add(100, 200, 500);
		MethodsWithArgument.sub(100, 50);

	}

}
