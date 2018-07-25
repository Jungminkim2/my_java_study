package icehs.science.chapter06;

public class Student {
	String Name;
	String stuID;
	int korean;
	int english;
	int math;
	double average;
	
	void calculateAVG()
	{
		average =(double)(korean + english + math)/3;
		System.out.println("평균 : "+ average);
	}
	
	void pringtStudentinfo()
	{
		System.out.println("학생명 : "+ Name);
		System.out.println("학번 : "+ stuID);
		System.out.println("국어성적 : "+ korean);
		System.out.println("영어성적 : "+ english);
		System.out.println("수학성적 : "+ math);
	}
	
	void changeStudentID(String newStuID)
	
	{
		stuID = newStuID;
	}

}
