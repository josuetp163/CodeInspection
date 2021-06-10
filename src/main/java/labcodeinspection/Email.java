package labcodeinspection;

import java.util.Locale;

public class Email {

	final transient private String myFirstName;
	final transient private String myLastName;
	transient private String password;
	transient private String department;
	final transient private int defpassLength = 8;
	transient private String email;
	/**
	 * Constructor Email
	 * @param firstName
	 * @param lastName
	 */
	public Email(final String firstName, final String lastName) {
		this.myFirstName = firstName;
		this.myLastName = lastName;
	}
	/**
	 * ShowInfo
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + myFirstName + "\nLAST NAME= " + myLastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	/**
	 * SetDeparment
	 * @param depChoice
	 */
	public void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			break;
		}
	}
	/**
	 * RandomPassword
	 * @param length
	 * @return
	 */
	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	/**
	 * generateEmail
	 */
	public void generateEmail() {
		this.password = this.randomPassword(this.defpassLength);
		this.email = this.myFirstName.toLowerCase(Locale.US) + this.myLastName.toLowerCase(Locale.US) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
