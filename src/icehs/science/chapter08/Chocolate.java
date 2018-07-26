package icehs.science.chapter08;

public class Chocolate {
	private String name;
	private String type;
	private int price;
	
	public Chocolate(String name, String type, int price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}

	String getname()
	{
		return name;
	}
	
	int calculateTotalPrice(int count)
	{
		return count * price;
	}
	public int calculateTotalprice(int count, int discount)
	{
		return count * price * (100 - discount) / 100;
	}
	
	void changeChocolateInfo(String newName, int newPrice)
	{
		name = newName;
		price = newPrice;
		printChocolateInfo();
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}
	public void changeChocolateInfo(String newName, String newType, int newPrice)
	{
		name =newName;
		type = newType;
		price = newPrice;
		printChocolateInfo();
		
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void printChocolateInfo()	
	{
		System.out.println("�̸� : "+name+", ���� : "+type+",���� : "+price);
	}
	
	
}