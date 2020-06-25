package b_operater;

public class ArithmeticOperator {

	public static void main(String[] args) {

		/*
		 * 산술 연산자
		 * 
		 *  -사칙연산   : +, -, *,/, %(나머지)
		 *  -복합연산자 : += , -=, *=, /=, %=
		 *  -증감연산자 : ++,--
		 */ 
		
		
		int result = 10 + 20 - 30 * 40 / 50 % 60;
		//곱하기와 나누기가 더하기 빼기보다 우선순위가 높다.
		//나머지 연산
		
		result = 10%4;
		//System.out.println(result);
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행후 추력해주세요.
		
		
		
		System.out.println(33 + 15);
		System.out.println(33 - 15);
		System.out.println(33 * 15);
		System.out.println(33 / 15);
		System.out.println(33 % 15); //변수는 특별한게 아니라면 계속 새로운걸 만드는것보다 기존에 있던걸 활용하는게 메모리절약 및 속도에 효율이 좋다
		
		
		//복합연산자
		//변수에 저장되어 있는 값에 연산을 수행할 때 수행할 연산자와 대입연산자를 결합해 사용할 수 있다.
		
		result = result + 3;
		System.out.println(result);
		result += 3;
		System.out.println(result);
		result -= 5;
		System.out.println(result);
		result *= 2;
		System.out.println(result);
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어 주세요.
		//result = result + 10;
		result += 10;
		
		//result = result - 2 * 3;
		result -= 2*3;
	
		//result = result %5;
		result %= 5;
	
	
		
		
		//증감연산자
		//증가연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을 1 감소시킨다.
		
		int i = 0;
		
		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가된다.
		--i;
		i--;
		
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println("i = " + i);
		
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double; //표현범위가 더 큰 타입으로 형변환된다.
		
		System.out.println(result2);
		
		
		byte _byte = 5;
		short _short = 10;
		int result3 = _byte + _short; //int보다 작은 타입은 int로 형변환된다.
		System.out.println(result3);
		
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 떄 발생하는 현상
		
		byte b = 127;
		b++;
		System.out.println(b); //오버플로우
		b--;
		System.out.println(b); //언더플로우
		
		//타입을 선택할때 연산의 범위를 고려해야한다.
		
		//다음을 한줄씩 계산하여 최종 결과값을 출력해주세요.
		
		long _result = 123456 + 654321;
		_result *= 123456;
		_result /= 123456;
		_result -= 654321;
		_result %= 123456;
		System.out.println(_result);
		
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구하시오.
		
		int one = 95;
		int two = 78;
		int thr = 84;
		
		int sum = one + two + thr;
		double avg = sum/3.0;
		
		System.out.printf("총합: %d  평균: %.2f\n", sum, avg);
		
		//반올림
		/*avg = Math.round(avg);
		System.out.println(avg);
		*/
		avg = Math.round(avg * 100);
		avg /= 100;
		System.out.println(avg);
		
		
		//랜덤
		
		System.out.println((int)(Math.random()*51) );
		
		
		
		
		
	}

}
