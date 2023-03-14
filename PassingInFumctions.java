import java.util.Arrays;

public class PasingInFunctions{
	public static void main(String[] args){
	int [] nums = {3,4,5,6,12};
	change(nums);
	System.out.println(Arrays.toString(nums));
	
	}
	static void change(int[] arr){
		arr[0] =99;
	}

}

