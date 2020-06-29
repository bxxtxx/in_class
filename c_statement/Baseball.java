package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

		/*
		 * 135
		 * 
		 * baseball game ~
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		int b1 = 0, b2 = 0, b3 = 0;  //입력값
		int x = 0, y = 0, z = 0;     //랜덤수
		
		int scr = 0;                 //시도 회수
		
		boolean run = true;          //while문 제어
		
		
		
		x = (int)(Math.random()*8) + 1 ;
		
		while(true){
			
			y =	(int)(Math.random()*8) + 1 ;
			z = (int)(Math.random()*8) + 1 ;
			
			if(x != y && x != z && y != z) break;
			
		}
		
		System.out.println("############# BASEBALL GAME #############");
		System.out.println("정답:"+ x + ""+ y +""+ z+"" + "\n");
		
		while(run){
			
			int cnt_s = 0, cnt_b =0, cnt_o = 3;
			
			scr ++;
			
			System.out.print("첫번째 숫자를 입력하세요 :");
			b1 = Integer.parseInt(scan.nextLine());
			
			System.out.print("두번째 숫자를 입력하세요 :");
			b2 = Integer.parseInt(scan.nextLine());
			
			System.out.print("세번째 숫자를 입력하세요 :");
			b3 = Integer.parseInt(scan.nextLine());
			
			
			
			if(b1 == x) cnt_s ++;
			
			if(b2 == y) cnt_s ++;
			
			if(b3 == z) cnt_s ++;
			

			
			
			if(b1 == y || b1 == z) cnt_b ++;
			
			if(b2 == x || b2 == z) cnt_b ++;
			
			if(b3 == x || b3 == y) cnt_b ++;
			
			
			
			
			System.out.println(b1 + "" + b2+ ""+b3 + " :     " + cnt_s +"S " + cnt_b + "B " + (cnt_o-(cnt_s+cnt_b))+"O\n");
			
			if(cnt_s == 3){
				System.out.println("축하합니다! 정답입니다!!!         총 시도 회수: " + scr );
				run = false;
			}
			
			
		}
		
		
	}

}
