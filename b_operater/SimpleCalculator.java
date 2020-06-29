package b_operater;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		int num1, num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("######### SIMPLE CALCULATOR #########\n\n제공되는 연산 : +  -  *  /  %\n");
		
		System.out.print("첫번째 숫자: ");
		num1 = Integer.parseInt(scan.nextLine());
		
		System.out.print("원하시는 연산 기호를 입력하세요: ");
		String str = scan.nextLine();
		
		System.out.print("두번째 숫자: ");
		num2 = Integer.parseInt(scan.nextLine());
		
		System.out.print("\n" +">> "+ num1 + str + num2 + "= ");
		System.out.println( str.equals("+") ? num1 + num2 
					     : (str.equals("-") ? num1 - num2 
					     : (str.equals("*") ? num1 * num2 
					     : (str.equals("/") ? Math.round(((double)num1 / num2)*1000)/1000.0 
					     : (str.equals("%") ? num1 % num2 : "기호 입력이 잘못되었습니다.")))));
		
		
	}

}
