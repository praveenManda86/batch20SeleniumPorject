package OOPSConcepts;

public class ExceptionHan {

	public static void add() {
		int X = 10;
		int Y = 20;
		int Z = X+Y;
		System.out.println(Z);
	}
	
	public static void sub() {
		int M = 10;
		int N = 30;
		int Q = M-N;
		System.out.println(Q);
		
	}
	
	public static void main(String[] args) {

		int A = 10;
		int B = 20;
		int C = A + B;
		System.out.println(C);
		
		ExceptionHan.add();
		ExceptionHan.sub();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

}
