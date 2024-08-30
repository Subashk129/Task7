package Task7;

public class Q2ArrayInduxOutOfbound {

	public static void main(String[] args) {
		
		//StringIndexOutOfBoundsException
		try {
			String str = "Subash";
			System.out.println(str.charAt(15));
		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("You are trying to access StringIndexOutOfBoundsException...");
		}
		//ArrayIndexOutOfBoundsException
		try {
			int[] arr = new int[6];
			arr[8]= 45;
			System.out.println(arr[8]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException...");

		}

	}

}
