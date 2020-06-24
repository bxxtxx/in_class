import java.util.Scanner;

public class Gugudan {
	
	int first_num;
	int last_num;
	private static Scanner scan;
	
	
	public Gugudan(){}
	
	public void setFirst(int x){this.first_num = x;}
	public void setLast(int x){	this.last_num = x;}

	public static void main(String[] args){
		
		Gugudan g = new Gugudan();
		
		scan = new Scanner(System.in);
		
		System.out.println("첫 단을 입력하세요:");
		g.setFirst(scan.nextInt());

		
		System.out.println("끝 단을 입력하세요:");
		g.setLast(scan.nextInt());
		
		
		for(int i = g.first_num; i<= g.last_num ; i++){
			
			System.out.println("####"+i+"단####");
			
			for(int j =1 ; j <= 9 ; j++){
				
				System.out.println( i +"*" + j +"="+ i*j);
			}
			
		}
	}
}
