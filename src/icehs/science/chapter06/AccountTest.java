package icehs.science.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account gilldong = new Account();
		gilldong.accName = "홍길동";
		gilldong.accNo = "123-456789";
		gilldong.balance =10000;
		gilldong.printAccountInfo();
		
		System.out.println("20000원을 입금합니다.");
		gilldong.deposit(20000);
		
		System.out.println("잔액 : " + gilldong.balance + "원");
		
		System.out.println("-20000원을 입금합니다.");
		gilldong.deposit(-20000);
		System.out.println("잔액 : " + gilldong.balance + "원");
		
		System.out.println("45000원을 출금합니다.");
		gilldong.withdraw(45000);
		System.out.println("잔액 : " + gilldong.balance + "원");
		
	}
	

}
