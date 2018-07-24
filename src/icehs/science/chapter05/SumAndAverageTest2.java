package icehs.science.chapter05;

public class SumAndAverageTest2 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		double avg = 0;
		for(i=1 ; i<= 500 ; i++)
		{
			sum += i;
		}
		avg = (double)sum / 500;
		System.out.println("ÇÕ°è : "+ sum);
		System.out.println("Æò±Õ : "+ avg);

	}

}
