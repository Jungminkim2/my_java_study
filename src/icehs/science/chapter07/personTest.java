package icehs.science.chapter07;

public class personTest {

	public static void main(String[] args) {
		person p1 = new person();
		p1.name = "홍길동";
		p1.NUMBER_OF_PERSONS++;
		System.out.println("사람수: "+ p1.NUMBER_OF_PERSONS);
		System.out.println("이름 : "+ p1.name);
		
		person p2 = new person();
		p2.name = "홍길순";
		System.out.println("사람수: "+ p2.NUMBER_OF_PERSONS);
		System.out.println("이름: "+ p2.name);
		
		person p3 = new person();
		p3.name = "홍길가";
		System.out.println("사람수: "+ p3.NUMBER_OF_PERSONS);
		System.out.println("이름: "+ p3.name);
		
		System.out.println(p1.NUMBER_OF_PERSONS);
		System.out.println(p2.NUMBER_OF_PERSONS);
		System.out.println(p3.NUMBER_OF_PERSONS);
		
		System.out.println(person.NUMBER_OF_PERSONS);
	}

}
