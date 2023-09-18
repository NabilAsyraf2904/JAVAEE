package Day2;

public class Integer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte counter = 0;
		for (int i = 0; i < 130; i++)
		{
			counter++;
			System.out.println(counter);
		}
		
		byte centuries = 20;
		short years = 2000;
		int days = 730484;
		long hours = 17531616;
		
		System.out.printf("%d centuries = %d years = %d days = %d hours.", centuries, years, days, hours);
		
		int hexa = 0xFFFFFFFF;
		long number = 1L;
		
		System.out.println(hexa);
		System.out.println(number);

	}


}
