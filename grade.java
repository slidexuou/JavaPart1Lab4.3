package switchCase;

public class grade {
	public static void main(String[] args) {
		int score = 77;
		switch (score) {
		case 80:
			System.out.println("Grade A");
			break;
		case 70:
			System.out.println("Grade B");
			break;
		case 60:
			System.out.println("Grade C");
			break;
		case 50:
			System.out.println("Grade D");
			break;
		case 40:
			System.out.println("Grade F");
			break;
		default:
			System.out.println("Grade E");
		}
		System.out.println("You score's " + score);
	}
}
