package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int gilfongScore = 92;
		
		if(gilfongScore >= 90 && gilfongScore <= 100)
		{
			System.out.println("A학점입니다.");
		}
		else if(gilfongScore >= 80 && gilfongScore <= 90)
		{
			System.out.println("B학점입니다.");
		}
		else if(gilfongScore >= 60 && gilfongScore <= 70)
		{
			System.out.println("C학점입니다.");
		}
		else if(gilfongScore >= 60 && gilfongScore <= 70)
		{
			System.out.println("D학점입니다.");
		}
		else if(gilfongScore < 60 && gilfongScore >= 0)
		{
			System.out.println("A학점입니다.");
		}
		else
		{
			System.out.println("학점을 알 수가 없습니다. 점수르 잘못입력하셨습니다");
		}

	}

}
