package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int gilfongScore = 92;
		
		if(gilfongScore >= 90 && gilfongScore <= 100)
		{
			System.out.println("A�����Դϴ�.");
		}
		else if(gilfongScore >= 80 && gilfongScore <= 90)
		{
			System.out.println("B�����Դϴ�.");
		}
		else if(gilfongScore >= 60 && gilfongScore <= 70)
		{
			System.out.println("C�����Դϴ�.");
		}
		else if(gilfongScore >= 60 && gilfongScore <= 70)
		{
			System.out.println("D�����Դϴ�.");
		}
		else if(gilfongScore < 60 && gilfongScore >= 0)
		{
			System.out.println("A�����Դϴ�.");
		}
		else
		{
			System.out.println("������ �� ���� �����ϴ�. ������ �߸��Է��ϼ̽��ϴ�");
		}

	}

}
