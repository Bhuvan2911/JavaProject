package Handling;

public class ArrayIndexOutOfBound {
	public static void main(String[] args) {
		int [] a = {10,15,20,25,30};
		try {
			int b=a[8];
			System.out.println(b);
		}
		catch (Exception s) {
			
			s.printStackTrace();
		}
		finally {
			System.out.println("Not Found");
		}
	}

}
