package Handling;

public class CheckMailId {
	public static void main(String[] args) throws CheckMail, Exception {
		String mail = "Bhuvan1196@Gmail.com";
		try {
			if(mail.contains("@Gmail")) {
				throw new CheckMail("GmailAccount");
			}
			else {
				System.out.println("Not GmailAccount");
			}
		}
	catch (Exception a) {
		a.printStackTrace();
	}
		finally {
			System.out.println("No Found");
		}
	}
	

}
