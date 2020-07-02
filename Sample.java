import java.util.Arrays;



class Enemy{
	
	String name;
	String type;
	int speed; //생성자 안에 적힌 변수들. 초기화
	
	int x = 5; //생성자와 함께 작성은 안되지만, 내포되어있는 인스턴스 변수
	
	
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

class Sort_repeat{
	
	
	
	
	static void quickSort(int[] arr, int left, int right){
		
		int i, j, key;
		
		
		if(left < right){
			
			i = left;
			j = right + 1;
			key = arr[i];
			
			do{
				
				do{
					i++;
				}while(arr[i] < key);
				do{
					j--;
				}while(arr[j] > key);
				
				if(i<j){
					
					swap(arr, i, j);
				}
				
			}while(i<j);
			
			swap(arr, left, j);
			
			quickSort(arr, left, j-1);
			quickSort(arr, j+1, right);
				
	
			
		}
		
	}
	
	
	
	
	
	static void selectSort(int[] arr){
		
		
		for(int i = 0; i< arr.length - 1 ; i ++){
			
			int min = i;
			
			for(int j = i; j<arr.length ; j++){
				
				if(arr[min] > arr[j] ){
					
					min = j;
					
				}
			}
			swap(arr,i,min);
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	static void bubbleSort(int[] arr){
		
		
		for(int i = 0; i< arr.length ; i++){
			
			boolean run = false;
			
			for(int j = 1; j< arr.length; j++){
				
				if(arr[j-1] > arr[j]){
					
					swap(arr,j-1,j);
					run = true;
				}
				
				
			}
			
			if(run = false){
				break;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	static void insertSort(int[] arr){
		
		
		
		for(int i = 1 ; i < arr.length; i++){
			
			int key = i;
			int key_value = arr[i];
			
			for(int j = i ; 0 <= j ; j--){
				
				if(arr[j] > key_value){
					
					arr[key] = arr[j];
					arr[j] = key_value;
					key = j;
				}
				else{
					break;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	static void swap(int[] arr, int x, int y){
		
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		
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
