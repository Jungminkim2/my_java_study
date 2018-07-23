package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String name = "세종대왕";
		String money = "10000";
		int intMoney = Integer.parseInt(money);
		
		int year = 2017;
		
		System.out.println(name + ":" + money);
		System.out.println(year + "년");
		
		System.out.println(money + year);
		 
		
		System.out.println(intMoney + year);
		

	}

}
