package icehs.science.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account gilldong = new Account();
		gilldong.accName = "ȫ�浿";
		gilldong.accNo = "123-456789";
		gilldong.balance =10000;
		gilldong.printAccountInfo();
		
		System.out.println("20000���� �Ա��մϴ�.");
		gilldong.deposit(20000);
		
		System.out.println("�ܾ� : " + gilldong.balance + "��");
		
		System.out.println("-20000���� �Ա��մϴ�.");
		gilldong.deposit(-20000);
		System.out.println("�ܾ� : " + gilldong.balance + "��");
		
		System.out.println("45000���� ����մϴ�.");
		gilldong.withdraw(45000);
		System.out.println("�ܾ� : " + gilldong.balance + "��");
		
	}
	

}
