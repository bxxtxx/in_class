package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {

		/*
		 * 조건문
		 * -if문
		 * -switch문
		 * 
		 * if문
		 * - if(조건식){}    :조건식의 결과가 true이면 블럭안의 문장을 수행한다.
		 * - else if{}     :다수의 조건이 필요할 떄 if 뒤에 추가한다.
		 * - else{}        :결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 *  
		 */
		
		
		int a = 1;
		
		if(a == 1){
//			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if(a == 0){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		
		
		if(a == 1){
//			System.out.println("a가 1인 경우에 하고싶은것");
		}
		else if(a == 2){
			System.out.println("a가 2인 경우에 하고싶은것");
		}
		else if(a == 3){
			System.out.println("a가 3인 경우에 하고싶은것");
		}
		else{
			System.out.println("이외의 경우가 하고싶은것");
		}
		
		//조건을 한 묶음으로 사용하기 위해서는 반드시 else if를 사용해야한다.
		if(a<10){
			
//			System.out.println("a가 10보다 작다");
		}
		if(a<20){
			
//			System.out.println("a가 20보다 작다");
		}
		
		
		
		
		
		
		//시험점수가 60점 이ㅏㅇ이면 합격, 그렇지않으면 불합격
		
		int score = 70;
		
	/*	if(score >= 60){
			System.out.println("합격");
		}
		else{ 
			System.out.println("불합격");
		}
		*/
		
		
		
		
		
		//성적에 등급을 부여하는 프로그램을 작성해주세요.
		
		score = 80;
		String grade = null;
		
		if(score <= 100 && score >=90){
			grade = "A";
		}
		else if(score >=80){
			grade = "B";
		}
		else if(score >=70){
			grade = "C";
		}
		else if(score >=60){
			grade = "D";
		}
		else if(score >=50){
			grade = "E";
		}
		else if(score >=0){
			grade = "F";
		}
		else{
			
			System.out.println("점수의 입력이 잘못되었습니다.");
		}
		
//		System.out.println("\n\n등급: " + grade);
		
		
		
		
		
		score = (int)(Math.random()*100);
		grade = null;
		
		if(90 <= score){
			grade = "A";
			
			if(97 <= score){
				grade += "+";
			}
			else if( score <=93){
				grade += "-";
			}
			
		}
		else if(80 <= score){
			grade = "B";
			
			if(87 <= score){
				grade += "+";
			}
			else if( score <=83){
				grade += "-";
			}
			
		}
		else if(70 <= score){
			grade = "C";
			
			if(77 <= score){
				grade += "+";
			}
			else if( score <=73){
				grade += "-";
			}
			
		}
		else if(60 <= score){
			grade = "D";
			
			if(67 <= score){
				grade += "+";
			}
			else if( score <=63){
				grade += "-";
			}
			
		}
		else{
			
			grade = "F";
		}
		
		
//		System.out.println(score +"점의 등급: " + grade);
		
		//ctrl + shift + f : 정렬
		
		
		/*
		 * switch문
		 *  - switch(int/String){case: break;}
		 *  - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		 *  - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */
		
		
		a = 1;
		switch (a) {

		case 1:
//			System.out.println("a = 1");
			break;
		case 2:
			System.out.println("a = 2");
			break;
		case 3:
			System.out.println("a = 3");
			break;

		default:
			System.out.println("a != 1~3");
			
		}		
		
		
		String b = "a";

		switch (b) {

		case "a":
//			System.out.println("b = a");
			break;
		case "b":
			System.out.println("b = b");
			break;
		case "c":
			System.out.println("b = c");
			break;
		default:
			System.out.println("X");

		}
		
		
		
		
		//주어진 월에 해당하는 계절을 출력하세요
		
		int month = (int)(Math.random()*12)+ 1;
		String season = null;
		
		
		switch(month){
		
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		
		case 6: case 7: case 8:
			season = "여름";
			break;
		
		case 9: case 10: case 11:
			season = "여름";
			break;
		
		default:
			season = "겨울";
		}

//		System.out.println(month+"월에 해당하는 계절은 " + season + "입니다.");
		//ctrl + space : 자동완성  - 활용하면 굉장히좋음
		
		
		
		grade = null;
		
		
		switch(score/10){
		
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		
		}
		
//		System.out.println(score + "점에 해당하는 등급: " + grade);
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 점수를 입력하세요:");
		int x = Integer.parseInt(scan.nextLine());

		System.out.println("두번째 점수를 입력하세요:");
		int y = Integer.parseInt(scan.nextLine());
		
		System.out.println("세번째 점수를 입력하세요:");
		int z = Integer.parseInt(scan.nextLine());
		
	/*	
		int sum = x + y + z;
		double avg = sum / 3.0;
		
		String grade_avg = null;
		
		if( 90 <= avg && avg <=100 ){
			grade_avg = "A";
			if(97 <= avg){
				grade_avg += "+";
			}
			else if( avg <= 93){
				grade_avg += "-";
			}
		}
		else if( 80 <= avg){
			grade_avg = "B";
			if(87 <= avg){
				grade_avg += "+";
			}
			else if( avg <= 83){
				grade_avg += "-";
			}
		}
		else if( 70 <= avg){
			grade_avg = "C";
			if(77 <= avg){
				grade_avg += "+";
			}
			else if( avg <= 73){
				grade_avg += "-";
			}
		}
		else if( 60 <= avg){
			grade_avg = "D";
			if(67 <= avg){
				grade_avg += "+";
			}
			else if( avg <= 63){
				grade_avg += "-";
			}
		}
		else{
			grade_avg = "F";
		}
		
		System.out.printf("총점: %d   평균: %.2f   등급: %s", sum, avg, grade_avg);*/
		
		int temp = 0;
		
		if(x > y){
			temp = x;
			x = y;
			y = temp;
		}
		if(x > z){
			temp = x;
			x = z;
			z = temp;
		}
		if(y> z){
			temp = y;
			y = z;
			z = temp;
		}
		
		System.out.println(x +" "+y +" "+z+" ");
		
	}

}
