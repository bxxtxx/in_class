package b_operater;

public class LogicalOperation {

	public static void main(String[] args) {

		/*
		 * 논리연산자
		 *  - &&(AND), ||(OR), !(NOT)
		 *  - 피연산자로 boolean 만 허용한다.
		 * 
		 */
		
		
		boolean b = 5< 10 && 15 % 2 == 0 || 9>=5;
		//||보다 &&의 우선순위가 더 높다.
		
		
		b = !(10 < 20); //조건식의 결과를 반대로 저장한다.
		
		//효율적 연산
		b = true && true ; // true
		b = true && false ; // false
		b = false && true ; //false
		b = false && false; //false

		b = true || true ; // true
		b = true || false ; // true
		b = false || true ; //true
		b = false || false; //false
		
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.

		
		int a = 10;
		b = a<5 && 0 < a++;
		System.out.println(a);
		
		
		
		
		//int 타입의 x와 y변수를 만들고, 다음의 문장들을 코드로 작성해주세요.
		
		int x = 6;
		int y = 3;
		
		b = x > y && x < 10;
		
		b = x % 2 == 0 && x % y == 0;
		
		b = x % 3 == 0 || x % 5 == 0;
		
		
		
	}

}
