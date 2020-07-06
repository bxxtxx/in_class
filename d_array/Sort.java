package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sort_test sort = new Sort_test();
		/*
		 * 정렬 - 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식 - 
		 * 선택 정렬 : 가장 작은 숫자를 찾아서 앞으로보내는 방식 - 
		 * 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 바익 - 
		 * 삽입방식 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		 * 
		 */
		
		
		int[] arr = new int[10];

		sort.rand(arr);

		System.out.println(Arrays.toString(arr));
		
		sort.insertSort(arr);
		
//		sort.bubbleSort(arr);
		sort.selectSort(arr);
//		sort.printBank(arr);
		
	}

}

class Sort_test {

	Sort_test() {

	}

	
	void quickSort(int[] arr, int head, int tail){
		
		int i, j, key;
		if(head < tail){
			
			i = head;
			j = tail+1;
			key = arr[head];
			
			do{
				do{
					i++;
					
				}while(arr[i] < key);
				
				do{
					j--;
					
				}while(arr[j] > key);
				
				if(i < j){
					swap(arr, i, j);
				}
			
			}while(i<j);
			
			swap(arr, head, j );
			
			quickSort(arr, head, j-1);
			quickSort(arr, j+1, tail);
			
			
		}
			
		
	}
	
	
	void insertSort(int[] arr){
		
		
		int key= 0;
		int key_index = 0;
		
		for(int i = 1; i< arr.length ; i++){
			
			key = arr[i];
			key_index = i;
			
			for(int j = i - 1; j >= 0; j--){
				
				if(arr[j] > key){
					
					arr[key_index] = arr[j];
					arr[j] = key;
					key_index = j;
					
				}
				
			}
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	
	void bubbleSort(int[] arr) {
//		int repeat = 0;
		
		for(int i = 0; i< arr.length; i++){
			int cnt = 0;
//			repeat ++;
			for(int j = 1; j< arr.length-i; j++){
				
				if(arr[j-1] > arr[j]){
					
					swap(arr,j,j-1);
					cnt ++;
					
				}
				
			}
			
			if(cnt == 0) break;
		}
//		System.out.println(repeat);
		System.out.println(Arrays.toString(arr));
	}

	
	
	// 선택 정렬
	static void selectSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			int min = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[min]) {

					min = j;
				}

			}// 최소값 구함, 자리수도 구함 (cnt)

			swap(arr, i, min);
		}
		System.out.println(Arrays.toString(arr));
	}

	// 석차구하기
	void printBank(int[] arr) {


		int[] score = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			score[i] = 1;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] > arr[j])
					score[j]++;

			}
		}

		System.out.println(Arrays.toString(score));

	}

	
	static void swap(int[] arr, int x, int y) {

		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;

	}

	void rand(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * arr.length);

		}
	}

}
