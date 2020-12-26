package JavaPrograms;

public class Varibales {

	int X = 20; // INSTANCE

	static int Y = 30; // STATIC

	public static void main(String[] args) {

		Varibales s = new Varibales();

		int A = 10; // LOCAL

		System.out.println(A);
		System.out.println(s.X);
		System.out.println(Varibales.Y);

	}

}
