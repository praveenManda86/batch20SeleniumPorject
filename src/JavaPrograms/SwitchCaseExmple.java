package JavaPrograms;

public class SwitchCaseExmple {

	public static void main(String[] args) {

		int age = 600;

		switch (age) {

		case 10:
			System.out.println("he is child");
			break;
		case 25:
			System.out.println("he is adult");
			break;
		case 60:
			System.out.println("He is senior");
			break;
		case 75:
			System.out.println("he is old");
			break;
		default:
			System.out.println("age is invalid");
		}

	}

}
