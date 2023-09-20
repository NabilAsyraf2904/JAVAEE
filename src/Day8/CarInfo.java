package Day8;

import java.util.Scanner;

public class CarInfo {
	
	private String brand;
	private String model;
	private int horsePower;
	
	public CarInfo(String brand, String model) {
		this.brand = brand;
		this.model = model;
		horsePower = -1;
	}
	
	public CarInfo(String brand, String model, int horsePower) {
		this.brand = brand;
		this.model = model;
		this.horsePower = horsePower;
	}

	public String getBrand()
	{
		return this.brand;
	}

	public void setBrand(String brand) 
	{
		this.brand = brand;
	}
	
	//@Override
	public String toString()
	{
		if (this.horsePower == -1) {
			return String.format("%s:%s", this.brand, this.model);
		}else
			return String.format("%s:%s:%d", this.brand, this.model, this.horsePower);
		
	}

	public String getModel() 
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public int getHorsePower()
	{
		return horsePower;
	}

	public void setHorsePower(int horsePower) 
	{
		this.horsePower = horsePower;
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String brand = scanner.nextLine();
		String model = scanner.nextLine();
		String horsePower = scanner.nextLine();
//		CarInfo car = new CarInfo(brand, model, horsePower);
//		
//		System.out.println(car);
//		//System.out.println(car.horsePower);
//		
//
//		horsePower = Integer.parseInt(scanner.nextLine());
//		car.setHorsePower(horsePower);
//		System.out.println(car);
//		//System.out.println(car.getHorsePower());
//		
		if (horsePower.equals(""))
		{
			CarInfo car = new CarInfo(brand, model);
			System.out.println(car);
		} else
		{
			int hp = Integer.parseInt(horsePower);
			CarInfo car = new CarInfo(brand, model, hp);
			System.out.println(car);
		}
	}
	

}
