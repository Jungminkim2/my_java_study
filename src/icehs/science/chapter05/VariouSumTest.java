package icehs.science.chapter05;

public class VariouSumTest {

	public static void main(String[] args) {
		int sum = 0; // ����
		int num = 0; //¦����
		int mum = 0; //Ȧ����
		int i;
		for(i=1;i<=1000;i++)
		{
			sum = sum + i;
			//System.out.println("1���� 1000������ �� :"+ sum);
			if(i%2==0)
			{
				num = num + i;
			}
			else if(i%2==1)
			{				
				mum = mum + i;
			}
		}
		System.out.println("1���� 1000������ �� :"+ sum);
		System.out.println("1���� 1000���� ¦������ �� : "+ num);
		System.out.println("1���� 1000���� Ȧ������ �� : "+ mum);
		
	}

}
