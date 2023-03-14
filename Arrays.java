import java.util.Scanner;
import java.util.Arrays;

public class StringExample{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int[] array = new int[5];
	array[2] = 49;
	array[3] = 56;
	array[4] =9;
	array[0] = 89;
	array[1] = 49;
	System.out.println(array);


	//inputting of array values using for loop
	//for (int i =0;i <array.length; i++){
	//	array[i]= in.nextInt();
	
//	}
	//printting the array values
//	for (int i=0 ;i<array.length; i++){
//		System.out.println(Arrays.toString(array));
	
//	}	
	
	//array to objects (Strings)
	String[] str = new String[7];
	
	for (int i =0; i<str.length; i++){
		str[i] = in.next();
	}
		System.out.println(Arrays.toString(str));
	}
		}

