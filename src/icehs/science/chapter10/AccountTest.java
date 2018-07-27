package icehs.science.chapter10;

public class AccountTest {

	public static void main(String[] args) {
		Account[] funAcc = {
				new Account("전우치","1213-445566",1000000),
				new Account("홍길동","111-222",5000000),
				new Account("홍길순","666-777",1000000)
		};
		
		for(int i=0 ; i < funAcc.length ; i++) {
			if(funAcc[i] instanceof FundAccount) {
				funAcc[i].openAccount();
				((FundAccount)funAcc[i]).earnMoney();
				System.out.println();
			}else {
				funAcc[i].openAccount();
			}
			System.out.println();
		}
		
		
	}

}
