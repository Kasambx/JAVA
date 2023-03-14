import java.util.Scanner;

public class Functions{
	public static void main(String[] args){
	//takeinput of two no and print sum

		sum();	 
	}


	// method syntax
	//access modifier return type name(){}
	static void sum(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number 1:");
		int num1 = in.nextInt();
		System.out.println("Enter the number 2:");
		int num2 = in.nextInt();
		int sum = num1 + num2;
		System.out.println("The sum = " + sum);
	
	
	
	}


}
