package Task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q4FileNotFoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = "demo.txt";
	try {
		File file = new File(filePath);
		
		//create a Scanner obj to read the file
		Scanner sc = new Scanner(file);
		
		//Read and display the file contents
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		//close the scanner
		sc.close();
	} catch (FileNotFoundException e) {
		// Handle the case where the file does not exist
		System.out.println("Error: The file"+ filePath + "was not found");
	}
		System.out.println("File reading process completed");
	}
	

}
