public class practice12_10 {
	/**  Main method */
	public static void main(String[] args) {
		// Create an array that exceeds heap space
		int length = 1200000000;
		try {
			byte[] array = new byte[length];
		}
		catch (OutOfMemoryError ex) { // Handle OutOfMemoryError
			System.out.println(ex.getMessage());
		}
		// Continue program
		System.out.println("Error handled program continues... ");
	}
}
