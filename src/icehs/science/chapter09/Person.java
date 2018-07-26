package icehs.science.chapter09;

public class Person {
	private String name;
	private String phoneNumber;
	
	public void eat() {
		System.out.println("밥을 먹어요");
	}
}

class student extends Person{
	private String deparment;
	public void study() {
		System.out.println("공부합니다.");
	}
}

class Teacher extends Person{
	private String subject;
	public void teach(){
		System.out.println("강의합니다.");
	}
	
}
