package Day8;

class Bike2 {

	int c = 3;
	Bike2() {
		int a = 3;
		int b = 5;
		System.out.println(a*b);
	}

}

public class ConstructorDefault {


	public static void main(String[] args) {
		Bike2 b=new Bike2();
		System.out.println(b.c);;
	}

}
