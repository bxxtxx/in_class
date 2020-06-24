package a_variable;

import java.util.Scanner;


public class Variable {

	public static void main(String[] args) {

		/*		
		클래스에 대해 배우기 전까지 모든 코드는 이곳에 작성된다.

		주석: 프로그램 코드로 인식하지 않는 문장 (주로 코드를 설명하는데 사용한다.)
		한줄 주석 단축키 : Ctrl + shift + c 

		범위 주석 : Ctrl + shift + /(해제 : \) 
		
		*/
		
		
		/*	
		 * 데이터의 종류
		 * - 정수 : 10, -5
		 * - 실수 : 3.14, -1.5
		 * - 문자 : 'a', '3'
		 * - 논리 : true, false
		 *
		 * 
		 * 프로그래밍 언어의 기준으로 데이터의 종류를 나눠 놓은 것 : 자료형 (data type)
		 * 기본형 타입
		 * - 정수 : byte(1), short(2), int(4), long(8)
		 * - 실수 : float(4), double(8)
		 * - 문자 : char(2)
		 * - 논리 : boolean(1)
		 * 
		 *변수를 만들때 타입을 사용한다.
		 *데이터를 다룰때 일반적으로 변수라는 그릇에 담아서 사용한다.
		 * 
		*/
		
		
		int name; //변수 선언 : 변수를 만드는 것
		double name2;
		
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
		name = 10; //초기화: 변수에 처음으로 값을 저장하는 것
		name2 = 3.0; //변수 타입에 맞는 값을 저장해야함
		
		
		int abc = 30; //보통 선언과 초기화를 동시해 진행한다.
		long l = 40L; //접미사 L을 붙여야 long타입이 된다.
		float f = 5.5f; //접미사 f를 붙여야 float타입이 된다.
		char c = '한'; //따옴표안에 한글자만 넣어야 한다.
		boolean b = false; //true, false
		
		
		//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 ㅊ기화 해주세요.
		
		
		byte num_byte = 1;
		short num_short = 2;
		int num_int = 4;
		long num_long = 8L;
		
		float num_flout = 0.5f;
		double num_double= 5.0;
		
		char character = '?';
		
		boolean bool = true;
		
		

		name = 100;
		
		
		
		num_byte = 2;
		num_short = 4;
		num_int = 8;
		num_long = 16L;
		
		num_flout = 3.5f;
		num_double= 5.3;
		
		character = '!';
		
		bool = false;
		
		
		/*
		System.out.println(num_byte);
		System.out.println(num_short);
		System.out.println(num_int);
		System.out.println(num_long);
		
		System.out.println(num_flout);
		System.out.println(num_double);
		
		System.out.println(character);
		
		System.out.println(bool);
		*/
		
		
		/*
		 * 타입의 선택 기준
		 * 
		 * 정수
		 * - byte, short :메모리를 절약해야 할때
		 * - int : 기본
		 * - long : int의 범위를 벗어날 떄
		 
		 *
		 * 실수
		 * - float : 메모리를 절약해야 할 떄
		 * - double : 기본
		 */
		
		
		
		/*int r = 50;
		double center = r/ 2.0;
		
		for(int i = 0; i<r; i++){
			
			for(int j = 0; j<r ; j++){
				
				if((Math.sqrt((i-center)*(i-center) + (j-center)*(j-center)) < center) && 
				   (Math.sqrt((i-center)*(i-center) + (j-center)*(j-center)) > center/2)){
					
					System.out.print("■");
					
				}
				else{System.out.print("□");
				}
			}
			System.out.print("\n");
		}*/
		
		
		//문자열 
//		String str = "문자 여러개~!~!~!";
//		System.out.println(str);
		
		//형변환
		//다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해주어야 하는데, 이를 형변환(type casting)이라 한다.
		
		int small = 10;
		long big = 10L;
		
		small = (int)big;
		big = small; //표현범위가 작은쪽에서 큰쪽으로 형변환은 생략이 가능하다. 참고: float 이 long보다 더 크다.
		
		
		/*
		 * 명명 규칙
		 * - 영문자 대소문자, 한글, 숫자, 특수문자를 사용할 수 있다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다.
		 * - [낙타식 표기법을 사용한다. (mySampleVariable)]
		 * - [클래스명의 첫글자는 대문자로 한다. (MySampleVariable)]
		 * 
		 */
		
		
		/*
		 * 상수
		 * - 처음 담긴 값을 변경할 수 없는 그릇
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 * 
		 */
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100; //컴파일 에러 발생

		//출력
		/*System.out.print("줄바꿈을 하지 않는다.\n");
		System.out.printf("문자열 : %s,  숫자: %d\n", "hello", 4 ); //출력 포멧을 지정한다

		System.out.println();
*/
		
		Scanner scan = new Scanner(System.in); //입력받기 위한 클래스
		//import -> 단축키 : Ctrl + shift + o
		
		//System.out.println("아무거나 입력해 주세요:");
		
		
		//System.out.println(str2);
		
		//nextInt, nextDouble은 버그가 있어 잘 사용하지않음
		
		
		//int temp = Integer.parseInt(str2);
		
		//System.out.println(temp);
		
		
		
		
		String myName; //이름
		int myAge;	   //나이
		
		
		System.out.println("이름을 입력하세요:");
		myName = scan.nextLine();

		System.out.println("나이를 입력하세요:");
		myAge = Integer.parseInt(scan.nextLine());
		
		System.out.printf("이름: %s  나이: %d\n", myName, myAge);
		
		
	}

}
