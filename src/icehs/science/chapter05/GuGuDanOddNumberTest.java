package icehs.science.chapter05;

public class GuGuDanOddNumberTest {

	public static void main(String[] args) {
		int dan;
		int i;
		for(dan = 2 ; dan<=5 ; dan++)
		{
			for(i=1 ; i<=9 ;i++)
			{
				if((dan *i)%2 !=0)
				{
					System.out.println(dan + "*" + i + "=" + (dan *i));
					
				}
			}
		}
	}

}
