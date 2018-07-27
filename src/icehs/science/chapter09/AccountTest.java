package icehs.science.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount[] funAcc = {
				new FundAccount("홍길동","111-222",5000000,4.7),
				new FundAccount("홍길순","666-777",1000000,2.9)
		};
		
		for(int i=0 ; i < funAcc.length ; i++) {
			funAcc[i].openAccount();
			funAcc[i].earnMoney();
			System.out.println();
		}
		
		//FundAccount fundAcc = new FundAccount("홍길동","111-222",5000000,4.7);
		/*fundAcc.setName("홍길동");
		fundAcc.setNumber("111-2222");
		fundAcc.setBalance(5000000);*/
		
		
		/*fundAcc.openAccount();
		//fundAcc.setEarningRate(4.7);
		fundAcc.earnMoney();*/
	}

}
