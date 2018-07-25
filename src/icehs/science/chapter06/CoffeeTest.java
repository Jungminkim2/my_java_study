package icehs.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new Coffee();
		americano.name = "아메리카노";
		americano.price = 3500;
		americano.printCoffeInfo();
		
		Coffee latte = new Coffee();
		latte.name = "카페라떼";
		latte.price = 4000;
		latte.printCoffeInfo();
		
		Coffee makiyatto = new Coffee();
		makiyatto.name = "마끼야또";
		makiyatto.price = 4500;
		makiyatto.printCoffeInfo();
		
		int totalPrice = americano.getPrice() + latte.getPrice() + makiyatto.getPrice();
		
		System.out.println("총 금액 : "+ totalPrice +"원");
	}

}
