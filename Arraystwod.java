import java.util.Scanner;
public class Arraystwod{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int[][] arr2 ={
		{1,2,3,4,5},
		{4,5,5,6,6},
		{3,3,4,5,6}

	};
	
	//input
	int[][] arr = new int[3][3];
	for (int row = 0 ; row <arr.length; row++){
	 	for (int col = 0;col<arr[row].length; col++){
		arr[row][col] = in.nextInt();
		}

	}

	//output
	for(int row=0;row<arr.length; row++){
		for(int col= 0;col<arr[row][col];col++){
			System.out.print(arr[row][col] + " ");
		}
	}


	}


}

