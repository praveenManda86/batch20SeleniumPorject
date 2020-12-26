package JavaPrograms;

public class ForLoopEx {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {  // Main Loop Starts

			System.out.println("iam i " + i);    
			
			for (int j = 0; j < 10; j++) {  //Sub loop starts here
				System.out.println(i*j);
			}  //Sub loop ends Here

		}  // Main loop ends here

	}

}
