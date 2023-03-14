import java.util.*;

public class Arraylist{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<>(7);
	
//:	list.add(36);
//	list.add(47);
//	list.add(97);
//	list.add(78);
//	list.add(100);	

	//inoutting values 
	for (int i= 0 ; i<5; i++){
		list.add(in.nextInt());
	}

	//output
	for (int i= 0; i<5; i++){
		System.out.println(list.get(i));
	}

//	System.out.println(list);
	}

	}

