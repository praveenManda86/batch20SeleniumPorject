package JavaPrograms;

public class MethodsExample2 {
	
	int X = 10;  //INSTANCE
	int Y = 20;  //INSTANCE
	
    static int  M = 10;  // STATIC
    static int N = 30; // STATIC
    
	public void add() {
		int S = 20;  //LOCAL
		int P = 30;  // LOCAL
		System.out.println(S+P);
	}
	

	public static void main(String[] args) {
	
	int A = 10;  // LOCAL
	int B = 20;  // LOCAL
	
	MethodsExample2  obj  = new MethodsExample2();
	
	System.out.println(obj.X);
	System.out.println(obj.Y);
	obj.add();

	}

}
