package icehs.science.chapter05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		int dan;
		int j;
		for(dan=2 ; dan <=9 ; dan++)
		{
			for(j=1 ; j<=9 ;j++)
			{
				if(j<9)
				{
					System.out.print(dan + "*" + j + "=" +(dan*j)+ ",\t");
				}
				else
				{
					System.out.print(dan + "*" + j + "=" + (dan * j));
				}
			}
			System.out.println();
		}

	}

}
