package JavaPrograms;

public class JavaExampleSkip {

	public static void main(String[] args) {

		int i;

		for (i = 1; i <= 10; i++) {

			if (i == 5  ||  i == 7) {
              continue;  // skip that current step and go to next line
			}
			
           System.out.println(i);
		}

	}

}
