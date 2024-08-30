package Task7;

import java.util.Scanner;

public class Q1DivisionException {

	public static void main(String[] args) {
		//division 
		try {
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter the Number 1:");
			
			int num1 = sc.nextInt();
			
			System.out.println("Enter the Number 2:");
			
			int num2 = sc.nextInt();
			
			int res= num2/num1;
			System.out.println(res);
			
		}catch(Exception e) {
			System.out.println("Error");
		}
		
	}

}
	
