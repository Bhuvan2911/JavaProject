package Handling;

public class CheckBrand {
	public static void main(String[] args) throws Brand,Exception {
		String[] brands = {"Otto","AllanSolly","LP","Denim","Fadad"};
		try {
			for(int i=0; i<brands.length;i++) {
			if(brands[i].equals("Otto")) {
				throw new Brand ("It is Otto");
			}
			else {
				System.out.println("Different Brand");
			}
			}
		}
	catch (Exception s) {
		s.printStackTrace();
	}
	finally {
		System.out.println("Invalid");
	}
	}

}
