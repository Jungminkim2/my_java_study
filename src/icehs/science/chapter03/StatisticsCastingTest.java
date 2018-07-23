package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		long billwealth = 7000000000L;
		System.out.println("Original Value");
		
		double doubleBillwealth = billwealth;
		System.out.println("doulbe형으로 변환 : " +doubleBillwealth);
		
		int intBillwealth = (int)billwealth;
		System.out.println("int형으로 강제 변환 : " +intBillwealth);
	}

}
