




class Enemy{
	
	String name;
	String type;
	int speed;
	
	
	Enemy(){
		
		this("엑스트라", "노멀" , 7);
		
		
	}
	Enemy(String name){
		this();
		this.name = name;
		
	}

	Enemy(String name, String type, int speed){
		
		this.name = name;
		this.type = type;
		this.speed = speed;
		
	}

	
}








public class Sample {

	public static void main(String[] args){
		
		
		
		
		
		Enemy enemy = new Enemy();
		Enemy enemy1 = new Enemy("돼지");
		Enemy enemy2 = new Enemy("당근","채소", 8);
		
		
		System.out.println(enemy.name + enemy.speed + enemy.type);
		System.out.println(enemy1.name + enemy1.speed + enemy1.type);
		System.out.println(enemy2.name + enemy2.speed + enemy2.type);
		
		
		
		
		
		
		
	}
}
