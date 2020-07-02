package d_array;

<<<<<<< HEAD


=======
>>>>>>> e94235ebd38755e218f3ad752df7c94d684527c8
import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		
		
		/*
		 * 
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는것이다.
		 * - 참조형 타입이다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경할 수 없다.
		 * 
		 */
		
		
<<<<<<< HEAD
=======
		
>>>>>>> e94235ebd38755e218f3ad752df7c94d684527c8
	/*	
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		
		array = new int[5];  //배열이 생성되고 그 주소가 저장된다. new가 주소를 보내준다고 보면됨
		//배열 초기화시 기본값이 저장된다.
		
		
		array = new int[]{5,4,3,2,1};
		
//		array = {7,4,5,3,9};
		//선언과 초기화를 동시에 해야한다
		
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		array[1] = 73;

		
		int[] array3 = new int[10];
		
		
		int sum2 = 0;
		double avg;
		
		
		for(int i = 0 ; i< array3.length; i++){
			
			array3[i] = (int)(Math.random()*100 + 1);
			sum2 += array3[i];
		}
		
		System.out.println(Arrays.toString(array3)); //굳
		
		avg = (double)sum2 / array3.length;
		
		System.out.println("합계: " + sum2 + " 평균: " + avg);
		
		
		
		
		
		//배열에 저장된 값들 ㅜㅇ 쵯값과 최대값을 출력해주세요.
		
		int max = array3[0] , min = array3[0];
		
		for(int i = 0; i< array3.length ; i++){
			
			if(max < array3[i]) max = array3[i];
			if(min > array3[i]) min = array3[i];
		}
		
		
		System.out.println("최대값: " + max + " 최소값: " + min);
		
		
		Test test = new Test();
		
		int temp = 0;
		for (int i = 0; i < array3.length; i++) {

			for (int j = i + 1; j < array3.length; j++) {

				if (array3[i] > array3[j]) {

					test.swap(array3, i,j);
				}
			}
		}

		System.out.println(Arrays.toString(array3));
		
		
		int[] shuffle = new int[10];
		
		for(int i  = 0; i< shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		
		//배열의 값을 섞어주세요.
		for(int i = 0; i< shuffle.length; i++){
			
			int rd = (int)(Math.random()*shuffle.length);
			
			temp = shuffle[rd];
			shuffle[rd] = shuffle[i];
			shuffle[i] = temp;
			
		}
		
		System.out.println(Arrays.toString(shuffle));
		
		
		
		
		
		
		
		//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
		int[] count = new int[10];
		
		
		for(int i = 0; i< 500; i++){
			
			int r = (int)(Math.random()*10)+ 1;
			count[r-1] ++;
			
		}*/
		
	/*	for(int i = 0; i < count.length; i++){
			
			System.out.println(i+1 + ":\t" + count[i] + "번");
			
		}
		*/
		
		
		
		
		
		
		
<<<<<<< HEAD
=======
		
>>>>>>> e94235ebd38755e218f3ad752df7c94d684527c8
		Scanner scan = new Scanner(System.in);
		
		System.out.print("최소값 : ");
		int min = Integer.parseInt(scan.nextLine());
		
		System.out.print("최대값 : ");
		int max = Integer.parseInt(scan.nextLine());
		
		
		System.out.print("반복횟수 : ");
		int repeat = Integer.parseInt(scan.nextLine());
		
		int[] count = new int[max - min + 1];
		
		
		for (int i = 1; i <= repeat; i++) {

			int rand = (int) (Math.random() * (max - min + 1)) + min;
			count[rand - min]++;

		}

		for (int i = 0; i < count.length; i++) {

			System.out.println(min + i + ":\t" + count[i] + "번");

		}
<<<<<<< HEAD
		
		
		System.out.println(Arrays.toString(count));
		
		Sort_test.selectSort(count);
=======
>>>>>>> e94235ebd38755e218f3ad752df7c94d684527c8

	}
	
}

class Test{
	
	
	static void swap(int[] array, int x, int y) {

		int temp = array[y];
		array[y] = array[x];
		array[x] = temp;

	}
	
}




