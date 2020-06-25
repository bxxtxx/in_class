import java.util.Random;
import java.util.Scanner;


public class Hi {

	public static void main(String[] args){
		
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		System.out.println("선택하세요.  도넛: 1, 빗줄: 2, 사각형: 3");
		
		int num = Integer.parseInt(scan.nextLine());
		
		if(num == 1){
			System.out.println("원하시는 반지름을 입력하세요: ");
			
			
			int r = Integer.parseInt(scan.nextLine());
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
			}
			
		}
		else if(num == 2){
			
			System.out.println("원하시는 크기를 입력하세요: ");
			
			int r = Integer.parseInt(scan.nextLine());
			
			int position = rand.nextInt(r);
		
			
			String dir;
			if(rand.nextInt(r) %2 == 0){
				dir = "left";
			}
			else{
				dir = "right";
			}
			
			for(int i = 0; i<r; i++){
				
				for(int j = 0; j<r ; j++){
					
					if(j == position){
						System.out.print("■");
					}
					else{
						System.out.print("□");
					}
					
					
				}
				if(dir == "left"){
					position -= 1;
					
					if(position <=0){
						dir = "right";
					}
				}
				else if(dir == "right"){
					position += 1;
					if(position >= r){
						dir = "left";
					}
				}
				System.out.print("\n");
			}
			
			
		}
		
		else if(num == 3){
			
			System.out.println("원하시는 크기를 입력하세요: ");
			
			int r = Integer.parseInt(scan.nextLine());
			
			int position_left = rand.nextInt(r);
			int position_right = position_left;
			
			int dist = 0;
			
			
			int dir_left = 1;
			int dir_right = 1;
			for(int i = 0; i<r; i++){
				
				for(int j = 0; j<r ; j++){
					
					if((j >= position_left && j<= position_left + dist/3 ) || (j <= position_right && j >= position_right- dist/3)){
						System.out.print("■");
					}
					else{
						System.out.print("□");
					}
				}
				
				position_left -= dir_left;
				position_right += dir_right;
				
				if(position_left == 0){
					dir_left = -1;
				}
				if(position_right == r){
					dir_right = -1;
				}
				dist = position_right - position_left;
				System.out.print("\n");
			}
			
			
		}
		else{
			
			System.out.println("잘못입력하셨습니다.");
			
		}
		
	}
	
}
