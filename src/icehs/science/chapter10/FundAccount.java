package icehs.science.chapter10;

public class FundAccount extends Account {
	private double earningRate;
	private int calculateRate;
	public FundAccount(String name , String number, int balance, double earningRate) {
		super(number, name, balance);
		this.earningRate = earningRate;
	}

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	
	@Override
	public void openAccount() {
		System.out.println("계좌를 개설합니다.");
		System.out.println("펀드계좌번호 : "+getNumber());
		System.out.println("예금주 : "+this.getName());
		System.out.println("잔액 : "+this.getBalance());
	}
	
	public void earnMoney() {
		System.out.println("수익율 : "+ this.earningRate + "%");
		System.out.println("수익이 발생했습니다.");
	}
	public void calculateRate() {
		
	}
}
