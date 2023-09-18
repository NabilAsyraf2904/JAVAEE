package Day6;

public class TernaryOper {

	public static void main(String[] args) {
		// Ternary Operation----------------------------------------------------
		int a = 20, b = 30;
		int total = a > 10 && b < 10 ? 65 : 75;
		
		// if statement---------------------------------------------------------
		if (a > 10 && b < 10) {
			total = 65;
		}else {
			total = 75;
		}
		System.out.println(total);
		
	}

}
