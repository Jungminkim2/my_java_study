package icehs.science.chapter06;

public class StudentStudentTest {

	public static void main(String[] args) {
		Student hong = new Student();
		hong.Name = "홍길동";
		hong.stuID = "5001";
		hong.korean = 94;
		hong.english = 80;
		hong.math = 89;
		
		hong.pringtStudentinfo();
		hong.calculateAVG();
		
		
		System.out.println();
		System.out.println("학번을 변경합니다.");
		System.out.println();
		
		hong.changeStudentID("STU0001");
		hong.pringtStudentinfo();
	}
	

}
