package Handling;

public class CheckRetirement {
public static void main(String[] args) throws  CheckAgeException, Exception {
	int age = 68;
	try {
		if(age>60) {
			throw new CheckAgeException("Retirement Age");
		}
		else {
			System.out.println("Not Retirement Age");
		}
	}
	catch(Exception s) {
		s.printStackTrace();
	}
	finally {
		System.out.println("Invalid");
	}





  }
}





