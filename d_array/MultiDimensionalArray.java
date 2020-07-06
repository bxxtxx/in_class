package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		
		/*
		 * 다차월 배열
		 * - 배열안에 배열이 저장되어 있는 형태이다.
		 */
		
		
		//2차원
/*		int[][] array2;
		
		//3차원
		int[][][] array3;
		
		
		int[][] arr= new int[2][3]; //2칸짜리 배열안에 각 칸마다 3칸짜리 배열이 생성된다.
		
		int[][] arr2 = new int[][] {{1,2,3}, {4,5,6}};	//값의 개수로 배열의 길이가 정해진다.	
		
		int[][] arr3 = { {1,2,3}
						,{3,5,6}
						,{7,8,9}}; //선언과 초기화를 도이에 해야한다
		

		int[][] arr4 = new int[3][]; //가변배열
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[10];
		
		
		
		//2차원 인덱스까지 접근하여 사용할 수 있다.
		
		System.out.println(arr[0][1]);
		
		arr[0][1] = 10; //1차원만으론 값을 저장할 수 없다.
		arr[0] = new int[5]; //1차원에는 배열이 들어가야한다
		arr[0][0] = 10; //2차원까지 가야 값을 입력할 수 있다.
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 100;
		arr[0][4] = 70;
		
		System.out.println(arr.length); // 1차원배열의 길이
		System.out.println(arr[0].length + arr[1].length); //2차원배열의 길이
		System.out.println(Arrays.toString(arr[0]));
		
		
		
		for(int i = 0; i< arr.length; i++){
			
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j]+ " ");
			}
			
		}
		
		
		
		
		
		*/
		
		
		
		int[][] scores = new int[3][5]; //학생수 과목수
		int[] sum = new int[scores.length];
		double[] avg = new double[scores.length]; //평균
		
		for(int i = 0; i< scores.length; i++){
			
			for(int j = 0; j< scores[i].length; j++){
				
				scores[i][j] = (int)(Math.random() * 101);
				sum[i] += scores[i][j];
				
			}
			avg[i] = (double)sum[i]/ scores[i].length;
			System.out.println(Arrays.toString(scores[i]));
		}
		
		
		System.out.println();
		
		System.out.println(Arrays.toString(sum));
		System.out.println(Arrays.toString(avg));
		
		
	}

}
