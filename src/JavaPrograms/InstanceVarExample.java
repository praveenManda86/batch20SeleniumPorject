package JavaPrograms;

public class InstanceVarExample {
	
	
	int X =10;
	int Y = 20;
	
	public void add() {
		int M =20;
		int N =20;
		System.out.println(M + N);
	}

	public static void main(String[] args) {
	
		InstanceVarExample  obj  = new InstanceVarExample();
		
		System.out.println(obj.X);
		System.out.println(obj.Y);
		obj.add();

	}

}
