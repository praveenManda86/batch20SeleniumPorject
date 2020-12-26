package JavaPrograms;

public class staticExample {

	static int X = 20;
	static int Y = 30;

	public static void add() {
		int A = 10;
		int B = 30;
		System.out.println(A+B);
	}

	public static void main(String[] args) {

		System.out.println(staticExample.X);
		System.out.println(staticExample.Y);
		staticExample.add();

	}

}
