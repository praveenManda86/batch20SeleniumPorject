package JavaPrograms;

public class MethodEx2 {

	public void hello1() { // Non Static method without any arguments

	System.out.println("hi i am NSMWAA");
	}

	public void hello2(int a, int B) { // Non static method with arguments
        
		System.out.println("hi i am NSMWA");
	}

	public static void hello3() { // Static method without arguments

		System.out.println("hi i am SMWAA");
	}

	public static void hello4(int X, int F) { // Static method with arguments

		System.out.println("hi i am SMWA");
	}

	public static void main(String[] args) {
		
		MethodEx2  obj = new MethodEx2();
		
		obj.hello1();
		obj.hello2(10,20);
		MethodEx2.hello3();
		MethodEx2.hello4(200, 300);

	}

}
