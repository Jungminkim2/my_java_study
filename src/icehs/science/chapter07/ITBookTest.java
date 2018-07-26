package icehs.science.chapter07;

public class ITBookTest {

	public static void main(String[] args) {
		ITBook sql = new ITBook("SQL Plus",50000,5.5);
		ITBook java = new ITBook("Java 2.0",28000,2.3);
		ITBook jsp =new ITBook("JSP servlet",37000,6.9);
		sql.printITBookInfo();
		java.printITBookInfo();
		jsp.printITBookInfo();
		
		System.out.println();
		System.out.println(java.getTitle()+"정가와 한일율을 변경합니다.");
		sql.setPrice(55000);
		System.out.println(9.5);
		sql.printITBookInfo();
		
		System.out.println();
		System.out.println(java.getTitle()+"정가를 변형합니다.");
		java.setPrice(33000);
		java.setDiscountRate(3.2);
		java.printITBookInfo();
		
		System.out.println();
		System.out.println(jsp.getTitle()+"제목과 할인율을 변형합니다.");
		jsp.setTitle("setvlet & JSP");
		jsp.setDiscountRate(12.6);
		jsp.printITBookInfo();
	}

}
