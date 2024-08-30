package Task7;

import java.util.ArrayList;

public class Q5ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> stringlist = new ArrayList<>();
		
		//Adding elements to arraylist
		stringlist.add("car");
		stringlist.add("Bike");
		stringlist.add("Truck");
		stringlist.add("Bus");
		stringlist.add("Jeep");
		
		// display elements
		System.out.println("ArrayList Before Removing Elements:"+ stringlist);
	
		//Removing elements
		stringlist.clear();
		System.out.println("ArrayList After Removing Elements:"+ stringlist);
	}

}
