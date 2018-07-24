package icehs.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		int num4 = 5;
		int num5 = 23;
		int num6 = 96;
		int num7 = 4;
		int num8 = -3;
		
		int result = num1 * num2;
		
		if(result >= 100)
		{
			System.out.println(num1 +"*"+ num2 +": 세자리수 이상입니다.");
		}
		else if(result >= 10)
		{
			System.out.println(num1 +"*"+ num2 +": 두자리수 이상입니다.");
		}
		else if(result > 0)
		{
			System.out.println(num1 +"*"+ num2 +": 한자리수 이상입니다.");
		}
		else
		{
			System.out.println(num1 +"*"+ num2 +": 음수는 확인하지 않습니다");
		}
		
		num1 = num3;
		num2 = num4;
		result = num1 * num2;
		
		if(result >= 100)
		{
			System.out.println(num1 +"*"+ num2 +": 세자리수 이상입니다.");
		}
		else if(result >= 10)
		{
			System.out.println(num1 +"*"+ num2 +": 두자리수 이상입니다.");
		}
		else if(result > 0)
		{
			System.out.println(num1 +"*"+ num2 +": 한자리수 이상입니다.");
		}
		else
		{
			System.out.println(num1 +"*"+ num2 +": 음수는 확인하지 않습니다");
		}
		
		num1 = num5;
		num2 = num6;
		result = num1 * num2;
		
		if(result >= 100)
		{
			System.out.println(num1 +"*"+ num2 +": 세자리수 이상입니다.");
		}
		else if(result >= 10)
		{
			System.out.println(num1 +"*"+ num2 +": 두자리수 이상입니다.");
		}
		else if(result > 0)
		{
			System.out.println(num1 +"*"+ num2 +": 한자리수 이상입니다.");
		}
		else
		{
			System.out.println(num1 +"*"+ num2 +": 음수는 확인하지 않습니다");
		}
		
		num1 = num7;
		num2 = num8;
		result = num1 * num2;
		
		if(result >= 100)
		{
			System.out.println(num1 +"*"+ num2 +": 세자리수 이상입니다.");
		}
		else if(result >= 10)
		{
			System.out.println(num1 +"*"+ num2 +": 두자리수 이상입니다.");
		}
		else if(result > 0)
		{
			System.out.println(num1 +"*"+ num2 +": 한자리수 이상입니다.");
		}
		else
		{
			System.out.println(num1 +"*"+ num2 +": 음수는 확인하지 않습니다");
		}

	}

}
