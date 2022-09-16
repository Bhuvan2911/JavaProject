package Handling;

public class NumberFormat {
	public static void main(String[] args) {
		String name = "Bhuvan";
		try {
			int a = Integer.parseInt(name);
			System.out.println(name);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Invalid");
		}
	}

}
