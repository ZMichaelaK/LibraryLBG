package libraryLBG;

public class Person {

	private static int count = 1;
	private int personId;

	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		setPersonId(++count);
		setFirstName(firstName);
		setLastName(lastName);
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", First Name=" + firstName + ", Last Name=" + lastName + "]";
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
