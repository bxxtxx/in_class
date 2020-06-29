package c_statement;

import java.util.Scanner;

public class RepetiiveStatement {

	public static void main(String[] args) {


		/*
		 * 반복문
		 * 
		 * -for문
		 * -while문
		 * -do while문
		 * 
		 * 
		 * for문
		 * -for(초기화; 조건식; 증감식){}
		 * -포함하고 있는 문장들을 정해진 횟수만큼 반복하게 해주는 문장
		 */
		
		
		for(int i =1 ; i<=10; i++ ){
			
			//초기화 : 조건식과 증감식에 사용할 변수 초기화
			//조건식 : 연산결과가 true이면 블럭안의 내용을 수행한다.
			//증감식 : 변수를 증가/감소시켜 반복물을 제어한다.
//			System.out.println(i + "번째 반복");
			//초기화한 변수를 블럭 안에서 사용할 수 있다.
			
		}
		
		//규칙이 있는 문장들을 효율적으로 작성하기 위해 반복물을 사용한다.
		
		
		int sum = 0;
		for(int i= 1; i<= 10; i++ ){
			
			sum += i;
			
		}
//		System.out.println(sum);
	
		
		sum = 0;
		
		
		for(int i = 100; i>= 0; i--){
			
			sum += i;
			
		}
		
//		System.out.println(sum);
		
		
		
		
		
		
		
		//1부터 100까지 홀수의 합
		
		sum = 0;
		
		for(int i = 1; i<= 100; i++){
			
			if(i%2 != 0) {sum += i;}
		}
		
//		System.out.println(sum);
		

		
		sum = 0;
		
		for(int i = 1; i<= 100; i+=2){
			
			sum += i;
		}
		
//		System.out.println(sum);
		
		
		
		
		
		
/*		for(int i = 1 ; i < 10; i++){
			
			System.out.println(2 + " * " + i +" = " + 2*i);
			
		}
		
*/		
		
		
		
		
		
		
		/*
		for(int i = 2; i < 10 ; i++){
			
			System.out.println("######### " + i + "단 #########");
			for(int j = 1 ; j < 10; j++){
				
				System.out.println(i + " * " + j +" = " + i*j);
				
			}
			System.out.println("\n");
		}
		
		*/
		
		
		
/*
		for(int i = 1; i < 10; i++){
		
			for(int j = 2; j < 10; j++){
				
				System.out.print(j + " * " + i + " = " + j * i + "\t");
				
			}
			System.out.print("\n");
			
		}
		
*/		

		
		/*
		 * While문
		 * -while(조건식){}
		 * -퐘하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
		 * -반복횟수가 정확하지 않은 경우에 주로 사용한다.
		 */
		
		int a = 1;
		int count = 0;
		//a에 2씩 몇번을 곱해야 1000이상이 되는지 알아보기
		
/*		while(a < 1000){
			
			a *= 2;
			count++;
			System.out.println(count + ":" + a);
			
		}
		
		*/
		/*
		 * do while문
		 * - do{}while(조건식);
		 * - 최소한 한번의 수행을 보장한다.
		 */
		
		
		//숫자 맞추기 게임
/*		
		Scanner scan = new Scanner(System.in);
		
		int ans = (int)(Math.random()*100) + 1; //1~100 랜덤수
		int input = 0;
		
		System.out.println(ans);
		
		do{
			System.out.println("1~100사이의 수를 입력해주세요:");
			input = Integer.parseInt(scan.nextLine());
			
			if(input > ans){
				System.out.println("더 작은 수 입니다.");
			}else if(input < ans){
				System.out.println("더 큰 수 입니다.");
			}
			else{
				System.out.println("정답입니다.");
			}
		}while(input != ans);
		
	*/
	/*	
		//이름붙은 반복문 --반복문을 진행/제어하기위해 :: 사실 이름붙이기는 잘 안쓰이지만, break와 continue를 잘 알아두자
		
		outer : for(int i = 2; i<= 9; i++){
			for(int j = 1; j <=9; j++){
				
				if(j == 5){
					break; //가장 가까운 반복문 하나를 빠져나간다.
//					break outer; // outer라는 반복물을 빠져나간다.
//					continue;    //가장 가까운 반복문의 현재 반복회차를 빠져나간다.
//					continue outer; // outer라는 이름의 현재 반복회차를 빠져나간다.
				}
				System.out.println(i + " * " + j + " = " + j * i);
			}
			System.out.println();
		}
		
	*/
		
		
		
		
	
		
		
		//별 출력
		
		/*
		for(int i  = 0; i < 5; i ++){
			for(int j = 0; j<=i; j++){
				
				System.out.print("*");
			
			}
			System.out.println();
		}
		
		
		for(int i = 0; i< 5; i++){
			for(int j = 0 ; j < 5; j++){
				System.out.print("*");
				if(j>= i){
					break;
				}
			}
			System.out.println();
		}
		
		*/
		
		
		for(int i = 5; i > 0; i-- ){
			
			for(int j = 0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("원하시는 반지름을 입력하세요: ");
		
		
		int r = Integer.parseInt(sc.nextLine());
		double center = r/ 2.0;
		
		for(int i = 0; i<r; i++){
			
			for(int j = 0; j<r ; j++){
				
				if((Math.sqrt((i-center)*(i-center) + (j-center)*(j-center)) < center) && 
				   (Math.sqrt((i-center)*(i-center) + (j-center)*(j-center)) > center/2)){
					
					System.out.print("*");
					
				}
				else{System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
		*//*
		
		for(int i = 0; i < 5; i++ ){
			
			for(int k = 4; k > i; k--){
				System.out.print(" ");
			}
			
			for(int j = 0; j<=i; j++){
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		int length = 15;
		
		for(int i = 1 ; i <= length; i ++){
			
			for(int j = 1; j < length*2; j++){
				
				
				if(j <= i || j>= (length * 2)-i){
					System.out.print("*");
				}
				else{
					
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	
		System.out.println();
		
		for(int i = 1; i<= length; i++){
			
			for(int j = 1; j<length * 2; j++){
				
				if(j <= length - i || j >= length + i){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		double center = length / 2.0;
		
		for(int i = 0; i<length; i++){
			
			for(int j = 0; j < length; j ++){
				
				if((Math.sqrt((i-center)*(i-center) + (j-center)*(j-center)) < center)){
					
					System.out.print("*");
					
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
