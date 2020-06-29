package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		String ans = null;
		int count = 0;
		
		System.out.println("############ 탄수화물 중독 테스트 ###########");
		System.out.println("해당되는 질문에 (Y/N) 둘중 하나의 답을 적어주세요.\n\n");

		System.out.println("1. 아침에 배불리 먹어도 점심시간이 되기 전에 밥, 빵이 땡긴다: (Y/N)");
		ans = scan.nextLine();
		
		switch(ans){
		case "Y": case "y": count ++; break;
		}
		
		System.out.println("2. 빵이나 면, 떡을 먹게 되면 양을 조절하지 못하고 끝까지 먹는다: (Y/N)");
		ans = scan.nextLine();
		
		switch(ans){
		case "Y": case "y": count ++; break;
		}
		
		
		System.out.println("3. 피자, 햄버거 등 패스트푸드, 인스턴트 식품을 자주 먹는다.: (Y/N)");
		ans = scan.nextLine();
		
		switch(ans){
		case "Y": case "y": count ++; break;
		}
		
		System.out.println("4. 식사를 하고 나면 졸리고 나른한 적이 많다.: (Y/N)");
		ans = scan.nextLine();
		
		switch(ans){
		case "Y": case "y": count ++; break;
		}
		
		System.out.println("5. 신맛이 나는 과일보다 단맛이 나는 과일을 좋아한다:. (Y/N)");
		ans = scan.nextLine();
		
		switch(ans){
		case "Y": case "y": count ++; break;
		}
		
		System.out.println("6. 스트레스를 받으면 초콜릿 같은 단 음식을 먹어야 해소가 된다.: (Y/N)");
		ans = scan.nextLine();
		
		switch(ans){
		case "Y": case "y": count ++; break;
		}
		
		System.out.println("7. 원두커피보다는 설탕이 들어간 커피믹스를 좋아한다.: (Y/N)");
		ans = scan.nextLine();
		
		switch(ans){
		case "Y": case "y": count ++; break;
		}
		
		System.out.println("8. 정말 배고프지 않은데도 먹을 떄가 자주 있다.: (Y/N)");
		ans = scan.nextLine();
		
		switch(ans){
		case "Y": case "y": count ++; break;
		}
		
		System.out.println("9. 계속 다이어트를 하는데도 그때 뿐이고 곧 다시 살이 찐다.: (Y/N)");
		ans = scan.nextLine();
		
		switch(ans){
		case "Y": case "y": count ++; break;
		}
		
		
		System.out.println("\n\n");
		
		switch(count){
		case 0: case 1: case 2: System.out.println(">> 오우 탄수화물 조절하는 센스가 느껴져요!"); break;
		case 3: case 4: case 5: System.out.println(">> 조굼먼... 조금만 더 조절해주세요."); break;
		default: System.out.println(">> 탄수화물 중독 위험!");
		}
		
		
	}

}
