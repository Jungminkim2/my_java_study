package icehs.science.chapter05;

public class VariouSumTest {

	public static void main(String[] args) {
		int sum = 0; // 총합
		int num = 0; //짝수합
		int mum = 0; //홀수합
		int i;
		for(i=1;i<=1000;i++)
		{
			sum = sum + i;
			//System.out.println("1부터 1000까지의 합 :"+ sum);
			if(i%2==0)
			{
				num = num + i;
			}
			else if(i%2==1)
			{				
				mum = mum + i;
			}
		}
		System.out.println("1부터 1000까지의 합 :"+ sum);
		System.out.println("1부터 1000까지 짝수들의 합 : "+ num);
		System.out.println("1부터 1000까지 홀수들의 합 : "+ mum);
		
	}

}
