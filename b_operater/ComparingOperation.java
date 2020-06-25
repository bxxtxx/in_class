package b_operater;

public class ComparingOperation {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 *  - < , > , =< , => , == ,!=
		 *  - 문자열비교 : equals()
		 */
		
		boolean b = 10 < 20; //비교연산자의 연산결과는 boolean 이다.
		System.out.println(b);
		b = 10 <= 20 - 15; //산술연산 후 비교연산을 수행한다.
		System.out.println(b);
		
		String str1 = "abc";
		String str2 = "123";
		b = str1 == str2; //문자열의 내용이 아닌 주소를 비교한 것이다. 
		System.out.println(b);

		
		//String의 내용을 비교하기 위해서는 equals() 메소드를 사용한다.
		b = str1.equals(str2);
		System.out.println(b);
		b = !str1.equals(str2);
		System.out.println(b + "\n");
		
		
		
		
		//int타입의 x와 y 변수를 만들고, 다음의 문장들을 코드로 작성해주세요
		
		int x = 3; 
		int y = 5 + x;
		
		boolean b2;
		
		b2 =  x > y;
		System.out.println("1." + b2);
		
		b2 =  x <= y;
		System.out.println("2." + b2);
		
		b2 =  x + 5 == y;
		System.out.println("3." + b2);
		
		b2 =  x % 3 == 0;
		System.out.println("4." + b2);
		
		b2 =  y % 2 != 0;
		System.out.println("5." + b2);
		
		b2 =  x != 3*y;
		System.out.println("6." + b2);
		
		
		String str_1 = "변수";
		String str_2 = "기본형";
		String str_3 = "참조형";
		
		
		b2 = str_1.equals("데이터");
		System.out.println("7." + b2);
		
		b2 = !str_2.equals(str_3);
		System.out.println("8." + b2);
		
		
		
		
		
		
		
		
		
		
		
	}
}
