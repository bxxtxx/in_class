package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {

		QuizBox q = new QuizBox();

		// q.quiz1(); // 거스름돈 동전 갯수
		// q.quiz2(); // 그래프 그리기
		 q.quiz3_test(); // 같은 숫자는 싫어
		//q.quiz4(); //나누어 떨어지는 숫자 배열
	}

}

class QuizBox {

	void quiz1() {
		// 거스름돈의 동전이 몇개인지 구하는 프로그램

		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력
		 */

		int money = (int) (Math.random() * 500) * 10;

		int[] coin = { 500, 100, 50, 10 };

		System.out.println("거스름돈 : " + money);

		int num = 0;

		do {

			System.out.println(coin[num] + "원 :\t" + money / coin[num] + "개");

			money %= coin[num];

			num++;

		} while (num != coin.length);

	}

	void quiz2() {

		int rand = 8;

		int[] arr = new int[60];
		int[] temp = new int[rand];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * rand) + 1;
		}

		for (int i = 0; i < temp.length; i++) {
			temp[i] = 0;

			for (int j = 0; j < arr.length; j++) {

				if (arr[j] == i + 1)
					temp[i]++;

			}
		}

		/*
		 * for(int i = 0; i< temp.length; i++){ temp[arr[i] - 1]++; }
		 */
		for (int i = 0; i < temp.length; i++) {
			System.out.print(" " + (i + 1) + " :\t");

			for (int j = 0; j < temp[i]; j++) {

				System.out.print("*");
			}
			System.out.println(" " + temp[i]);
		}

	}

	void quiz3() {

		

		int[] arr = new int[10];
		int rand = 5;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * rand) + 1;
		}

		System.out.println(Arrays.toString(arr));

		int[] temp = new int[10];

	
		
		for (int i = 0; i < arr.length; i++) {

			boolean run = false;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					run = true;
				}

			}
			if (run == false) {
				temp[cnt++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(temp));

	}

	
void quiz3_test() {

		

		int[] arr = new int[10];
		int rand = 5;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * rand) + 1;
		}

		System.out.println(Arrays.toString(arr));

		int[] temp = new int[10];

	
		for(int i = 0; i< arr.length; i++){
			
			boolean run = false;
			for(int j = i; j >=0 ; j--){
				
				if(arr[i] == temp[j]){
					
					run = true;
					
				}
				
			}
			if(run == false){
				
				temp[cnt++] = arr[i];
				
			}
		}
		System.out.println(Arrays.toString(temp));

	}
	
	
	void quiz4(){
		
		
		int[] arr = new int[100];
		
		int rand = 100;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * rand) + 1;
		}
		
		
		int check = (int)(Math.random() * 4) +2 ;
		
		/*
		 * 
		 * 2~5 사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요
		 * 5
		 * [5,10,15,20.25...]
		 * 
		 * 
		 */
		
		int[] temp = new int[100];
		int cnt = 0;
		
		for(int i = 0; i< arr.length; i++){
			
			
			if(arr[i] % check ==0){
				
				temp[cnt++] = arr[i];
				
			}
			
		}
		
	
		
		int[] result = new int[cnt];
		
		for(int i = 0; i< cnt; i++){
			
			result[i] = temp[i];
		}
		
		System.out.println(check);
		System.out.println(Arrays.toString(result));
		
		
		

		
	}
	
	
}
