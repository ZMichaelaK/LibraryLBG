package libraryLBG;

import java.util.ArrayList;

public class Library {
	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Person> persons = new ArrayList<>();

	public boolean checkOut(Item item) {
		return this.items.add(item);
	}

	public boolean checkIn(Item item) {
		return this.items.remove(item);
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void addPerson(Person person) {
		persons.add(person);
	}

	public void removePerson(Person person) {
		persons.remove(person);
	}

	public boolean checkOut(int id) {
		for (Item item : this.items) {
			if (id == item.getId()) {
				this.items.remove(item);
			}
		}
		return false;
	}

	public boolean deletePerson(Person person) {
		return this.persons.remove(person);
	}

	public void updatePerson(int id, String firstName) {
		for (Person person : this.persons) {
			if (id == person.getPersonId()) {
				person.setFirstName(firstName);
				return;
			}
		}
		System.out.println("Unable to find person");
	}

	public void printItem() {
		for (Item item : items)
			item.list();
	}

	@Override
	public String toString() {
		return "Library [items=" + items + ", persons=" + persons + "]";
	}

}
