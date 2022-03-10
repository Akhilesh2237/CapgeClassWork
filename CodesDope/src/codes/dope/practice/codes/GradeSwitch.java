package codes.dope.practice.codes;

public class GradeSwitch {
public static void main(String[] args) {
	char grade='A';
	switch (grade) {
	case 'A':
		System.out.println("Excellent");
		break;
	case 'B':
		System.out.println("very good");
		break;
	case 'C':
		System.out.println("good");
		break;
	case 'D':
		System.out.println("bad");
		break;
	case 'E':
//		System.out.println("very bad");
		break;

	default:
		break;
	}
}
}
