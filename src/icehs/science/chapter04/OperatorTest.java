package icehs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		int number = 64;
		
		boolean isOdd = number % 2 == 0;
		boolean isMultiof3 = number % 3 ==0;
		boolean isMultiof2and7 = (number % 2 == 0) && (number % 7 == 0);
		boolean isMultiof2or7 = (number % 2 == 0) || (number % 7 == 0);
		
		System.out.println("¦���Դϱ�? : "+ isOdd);
		System.out.println("3�� ����Դϱ�? : "+ isMultiof3);
		System.out.println("2�� ����̸鼭 7�� ����Դϱ�? : "+ isMultiof2and7);
		System.out.println("2�� ����̰ų� 7�� ����Դϱ�? : "+ isMultiof2or7);
	}

}
