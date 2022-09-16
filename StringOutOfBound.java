package Handling;

public class StringOutOfBound {
	public static void main(String[] args) {
		String a = "Bhuvan";
		try { 
			int b = a.charAt(8);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("No found");
		}
	}

}
