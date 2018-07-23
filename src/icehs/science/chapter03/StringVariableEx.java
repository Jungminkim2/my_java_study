package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		String name = "홍길동";
		String MathScore = "96";
		int englishScore = 82;
		int intMathScore = Integer.parseInt(MathScore);
		
		System.out.println(name + MathScore + englishScore);
		System.out.println(name + (englishScore + MathScore) );
		System.out.println(intMathScore + englishScore);
		System.out.println("----------------------------");
		System.out.println(MathScore + englishScore);
		System.out.println(intMathScore + englishScore);
		
	}

}
