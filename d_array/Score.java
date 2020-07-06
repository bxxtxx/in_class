package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회,과학, oracle, java 점수를 
		 * 0~100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요
		 * 
		 * 
		 *            국어       영어      수학        사회        과학       oracle     java    합계    평균    석차
		 *   홍길돌
		 *   홍길돌
		 *  과목합계 
		 *  과목평균     
		 */
		
		String[] name = new String[] {"강지원","김동민","김동희","김민지","김용진",
				                      "김인혁","김진용","박범영","박병규","배현태",
				                      "심민규","여인욱","이나정","이승민","이영섭",
				                      "이윤혜","이지향","임정혁","임형묵","장성보",
				                      "정선영","정회립","차경석","최준영","허지영"};
		
		
		String[] subject = new String[] {"국어", "영어", "수학","사회","과학","Oracle","Java"};
		

		int[][] score = new int[name.length][subject.length];
		int[] sum = new int[name.length];
		double[] avg = new double[name.length];
		
		int rank[] = new int[name.length];
		
		int[] sum_sub = new int[subject.length]; 
		double[] sum_avg = new double[subject.length]; 
		
		
		for(int i = 0; i< score.length; i++){
			
			for(int j = 0; j<score[i].length; j++){
				
				score[i][j] = (int)(Math.random() * 101);
				sum[i] += score[i][j];
				
			}
			avg[i] =  (double)sum[i] / subject.length;
		} //합계 평균
		
		
		
		for(int i = 0; i < subject.length; i++){
			
			for(int j = 0; j < name.length; j++){
				sum_sub[i] += score[j][i];
			}
			sum_avg[i] = (double)sum_sub[i] / name.length;
			
		}//과목합평균
		
		
		for(int i = 0; i< avg.length; i++){
			rank[i] = 1;
		}
		for(int i = 0; i< avg.length; i++){
			for(int j = 0; j<avg.length; j++){
				if(avg[i] > avg[j]) rank[j]++;
			}
		} //석차구하기
		
		
		
		score = swapMultiArray(score, rank);
		name = swapStringArray(name, rank);
		
		
		bubbleSort(rank,true);
		bubbleSort(sum,false);
		bubbleSort(avg,false);
		
		
		
		////출력
		for(int i = 0; i< subject.length; i++){
			System.out.print('\t'+ subject[i]);
		}
		System.out.println("\t합계\t평균\t석차");
		
		
		for(int i = 0; i< score.length; i++){
			
			System.out.print(name[i]+ "\t");
			for(int j = 0; j<score[i].length; j++){
				
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(sum[i] + "\t");
			System.out.print(Math.round(avg[i] * 100)/100.0 + "\t");
			System.out.println(rank[i]);
		}
		
		
		
		System.out.print("과목합계\t");
		
			
		for(int i = 0; i< sum_sub.length; i++){
			System.out.print(sum_sub[i] + "\t");
		}
		System.out.println();
		System.out.print("과목평균\t");
		
		
		for(int i = 0; i< sum_sub.length; i++){
			System.out.print(Math.round(sum_avg[i] * 100) / 100.0 + "\t");
		}
		
	}
	
	
	
	static String[] swapStringArray(String[] arr, int[] rank){
		
		String[] temp = new String[arr.length];
		
		
		for(int i = 0; i< arr.length; i++){

			for(int j = 0; j< arr.length; j++){
				
				if(rank[j]-1 == i ){
					temp[i] = arr[j];
				}
				
			}
			
		}
		
		return temp;
	}
	
	static int[][] swapMultiArray(int[][] arr, int[] rank){
		
		int[][] temp = new int[arr.length][arr[0].length];
		
		
		for(int i = 0; i< arr.length; i++){
		
			for(int j = 0; j< arr.length; j++){
				
				if( i == rank[j] - 1){
					temp[i] = arr[j];
				}
				
			}
			
		}
		return temp;
	}
	
		
	static int[] bubbleSort(int[] arr, boolean up) {
		
		for(int i = 0; i< arr.length; i++){
			int cnt = 0;
			for(int j = 1; j< arr.length-i; j++){
				
				if(up){
					if(arr[j-1] > arr[j]){
						
						swap(arr,j,j-1);
						cnt ++;
						
					}
					
				}
				else{
					if(arr[j-1] < arr[j]){
						
						swap(arr,j,j-1);
						cnt ++;
						
					}
				}
				
			}
			
			if(cnt == 0) break;
		}
		
		return arr;
	}
	
	static double[] bubbleSort(double[] arr, boolean up) {
		
		for(int i = 0; i< arr.length; i++){
			int cnt = 0;
			for(int j = 1; j< arr.length-i; j++){
				
				if(up){
					if(arr[j-1] > arr[j]){
						
						swap(arr,j,j-1);
						cnt ++;
						
					}
					
				}
				else{
					if(arr[j-1] < arr[j]){
						
						swap(arr,j,j-1);
						cnt ++;
						
					}
				}
			}
			if(cnt == 0) break;
		}
		
		return arr;
	}
	
	static void swap(int[] arr, int x, int y) {

		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;

	}
	
	static void swap(double[] arr, int x, int y) {

		double temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;

	}

}
