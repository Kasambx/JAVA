import java.util.Scanner;

public class Greatno{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	
	int Greatest = a  ;
	if ( b > Greatest){
		 Greatest = b ;
	}
	if  (c > Greatest){
		Greatest = c ;
	} 

	System.out.println("The greatest no is ;" + Greatest);

	}



}


