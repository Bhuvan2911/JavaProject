package Handling;

public class Arithmatic {
	public static void main(String[] args) {
		try {
			int a =10;
			int b=0;
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Invalid");
		}
	}

}
