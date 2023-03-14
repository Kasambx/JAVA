class Animal {}
public class Monkey extends Animal {
	public static void main(String args[]){
		Animal newa = new Monkey();
		boolean resultant = newa instanceof Monkey;
		System.out.println( resultant );
	}
}
