import java.util.Arrays;


public class Hello{
	
	public static void main(String[] args){
		
		
		System.out.println("hello");
			
		
		int[] arr = {1,6,2,8,4,0,15,63,44,3,7};
		
	
		Sort_repeat.quickSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	/*	Sort_repeat.selectSort(arr);
		Sort_repeat.bubbleSort(arr);
		Sort_repeat.insertSort(arr);
	*/
	}
	
}



