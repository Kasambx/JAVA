import java.util.Scanner;
import java.util.Arrays;


public class Swaptwo{
	public static void main(String[] args){
	int[] arr = {1,2,3,4,5};
	swap(arr, 0,  3);
	
	reverse(arr);
	System.out.println(Arrays.toString(arr));
	}

	//reversing thw array
	static void reverse(int[] arr){
		int start = 0;
		int end = arr.length-1;

		while(start< end){
		swap(arr,start,end);
		start++;
		end--;
		
		}

	}


	static void swap(int[] arr, int index1, int index2){
		int temp = arr[index1];
		arr[1] = arr[2];
		arr[2] = temp;

	}

}



