package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int num = 456;
		int hundNumber = num / 100;
		int tenNumber = num % 100 / 10 ;
		int oneNumber = num % 100 % 10 % 10;
		
		System.out.println("���� : "+ num);
		System.out.println("���� �ڸ� �� : "+ hundNumber);
		System.out.println("���� �ڸ� �� : "+ tenNumber);
		System.out.println("���� �ڸ� �� : "+ oneNumber);

	}

}
