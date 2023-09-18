package Day3;

import java.util.Scanner;

public class AreaofFigure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*String figure = sc.nextLine();
		//double area = 0;
		
		if (figure.equals("Square")) {
			System.out.println("Enter widht");
			int widht = Integer.parseInt(sc.nextLine());
			double area = Math.pow(2, widht) ;
			System.out.printf("Area is :%.2f", area);
		} else if (figure.equals("Rectangle"))
		{
			System.out.println("Enter widht and height");
			int widht = Integer.parseInt(sc.nextLine());
			int height = Integer.parseInt(sc.nextLine());
			double area = widht * height;
			System.out.printf("Area is :%.2f", area);
		} else if (figure.equals("Circle"))
		{
			System.out.println("Enter radius");
			int radius = Integer.parseInt(sc.nextLine());
			double area = 3.142 * Math.pow(2, radius);
			System.out.printf("Area is : %.2f", area);
		} else
		{
			System.out.println("undefine shape!");
		}*/
		for (int i = 0; i<10 ; i++) {
			
		}
		
		//String order = sc.nextLine();
		//String extra = sc.nextLine();
		double price = 0;
		for ( ; ; ) {
			String order = sc.nextLine();
			String extra = sc.nextLine();
			if (order == "done")
				break;
			if (order.equals("coffee")) 
			{
				price = price + 1.00;
			}
			else if (order.equals("tea")) {
				price = price + 0.60;
			} 
			if (extra.equals("sugar"))
			{
				price = price + 0.40;
			}System.out.printf("Final price: $%.2f", price);
		
		}
			
		
	}
	

}
