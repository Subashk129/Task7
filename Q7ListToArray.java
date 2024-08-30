package Task7;

import java.util.ArrayList;
import java.util.List;

public class Q7ListToArray {

	public static void main(String[] args) {
		
		        //Create a List of Strings
		        List<String> stringList = new ArrayList<>();
		        stringList.add("Apple");
		        stringList.add("Boll");
		        stringList.add("Cat");
		        stringList.add("Dog");
		        stringList.add("Elephant");

		        //Display the List
		        System.out.println("List: " + stringList);

		        //Convert the List to an Array using the toArray
		        String[] stringArray = stringList.toArray(new String[0]);

		        // Display the Array
		        System.out.println("Array: ");
		        for (String str : stringArray) {
		            System.out.println(str);
		        }
		        //Alternatively, using the no-argument toArray() method
		        Object[] objectArray = stringList.toArray();

		        //Display the Object array
		        System.out.println("Object Array: ");
		        for (Object obj : objectArray) {
		            System.out.println(obj);
		        }
		    }
		}




