
public class Score_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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
		float[] avg = new float[name.length];
		
		int[] rank = new int[name.length];
		
		int[] sum2 = new int[subject.length];
		float[] avg2 = new float[subject.length];
		
		
		
		for(int i = 0; i< name.length ; i++){
			for(int j = 0; j< subject.length ; i++){
				
				score[i][j] = (int)(Math.random() * 101);
				sum[i] += score[i][j];
			}
			avg[i] = (float)sum[i] / name.length;
		}
		
		
		for(int i = 0; i< name.length; i++){
			rank[i] = 1;
			
			for(int j = 0 ; j< name.length; j++){
				
				if(avg[i] < avg[j]){
					rank[i] ++;
				}
			}
		}
		
		for(int i = 0; i< subject.length; i++){
			
			for(int j = 0; j< name.length; j++){
				
				sum2[i] += score[j][i]; 
			}
			avg2[i] = (float)sum2[i] / name.length; 
			
		}
		
		
		for(int i = 0; i< name.length - 1; i++){
			
			int min = i;
			
			for(int j = i+1 ; j< name.length; j++){
				
				if(rank[j] > rank[min]){
					min = j;
				}
			}
			
			int temp[] = score[i];
			score[i] = score[min];
			score[min] = temp;
			
		
			int temp2 = sum[i];
			sum[i] = sum[min];
			sum[min] = temp2;
			
			
			float temp3 = avg[i];
			avg[i] = avg[min];
			avg[min] = temp3;
			
			
			int temp4 = rank[i];
			rank[i] = rank[min];
			rank[min] = temp4;
			
			String temp5 = name[i];
			name[i] = name[min];
			name[min] = temp5;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
