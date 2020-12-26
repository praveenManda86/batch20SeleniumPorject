package JavaPrograms;

public class ArrayEx {

	public static void main(String[] args) {

		int A[] = { 10, 20, 30, 40, 50 };

		int max = A[0];

		for (int i = 1; i < A.length; i++) {
			if (A[i] > max)
				max = A[i];
		}
		
		System.out.println(max);
	}

}
