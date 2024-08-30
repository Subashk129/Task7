package Task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Q6TreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> employeeMap = new TreeMap<>();
		
		// Adding IDs and Names to the TreeMap
		employeeMap.put(101, "subash");
		employeeMap.put(102, "Balu");
		employeeMap.put(103, "Ramu");
		employeeMap.put(104, "john");
		employeeMap.put(105, "vijay");
		
		ArrayList<String> employeeNames = new ArrayList<>(employeeMap.values());
		Collections.sort(employeeNames);
		
		System.out.println("Emp names in alphabetical order:");
		for(String name : employeeNames) {
		System.out.println(name);
		}
	}
	}	
	
	


