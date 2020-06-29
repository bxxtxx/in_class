package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

		/*
		 * 135
		 * 
		 * 
		 * 
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int ball_1 = 0, ball_2 = 0, ball_3;
		
		int x = 0, y = 0, z = 0;
		
		
		boolean run = true;
		
		
		x = (int)(Math.random()*8) + 1 ;
		y =	(int)(Math.random()*8) + 1 ;
		z = (int)(Math.random()*8) + 1 ;
		
		while(true){
			x = (int)(Math.random()*8) + 1 ;
			y =	(int)(Math.random()*8) + 1 ;
			z = (int)(Math.random()*8) + 1 ;
			
			if(x != y && x != z && y != z){
				break;
			}
		}
		
		
		
		while(run){
			
			int count_s = 0, count_b =0, count_o = 3;
			
			System.out.print("첫번째 숫자를 입력하세요 :");
			ball_1 = Integer.parseInt(scan.nextLine());
			
			System.out.print("두번째 숫자를 입력하세요 :");
			ball_2 = Integer.parseInt(scan.nextLine());
			
			System.out.print("세번째 숫자를 입력하세요 :");
			ball_3 = Integer.parseInt(scan.nextLine());
			
			
			
			if(ball_1 == x){
				count_s ++;
			}
			if(ball_2 == y){
				count_s ++;
			}
			if(ball_3 == z){
				count_s ++;
			}

			
			
			if(ball_1 == y || ball_1 == z){
				count_b ++;
			}
			if(ball_2 == x || ball_2 == z){
				count_b ++;
			}
			if(ball_3 == x || ball_3 == y){
				count_b ++;
			}
			
			
			
			System.out.println(ball_1 + "" + ball_2+ ""+ball_3 + " : " + count_s +"S " + count_b + "B " + (count_o-(count_s+count_b))+"O\n");
			
			if(count_s == 3){
				count_b =0; 
				count_o =0;
				System.out.println("정답입니다!!!");
				run = false;
			}
			
			
		}
		
		
		
		
	}

}
