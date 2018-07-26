package icehs.science.chapter09;

public class PersonTest {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		System.out.println("========Student=======");
		student.study();
		student.eat();
		System.out.println("========Teacher=======");
		teacher.teach();
		teacher.eat();
	}

}
