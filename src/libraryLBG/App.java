package libraryLBG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	public static void main(String[] args) {

		Book HP1 = new Book("Harry Potter and the Philosophers stone", 1999, "JK Rowling", true, true);
		Book HP2 = new Book("Harry Potter and the Chamber of Secrets", 2000, "JK Rowling", true, true);
		Map HB = new Map("Lord of the Rings World", 1998, "JRR Tolkien", false, true);
		Newspaper taNea = new Newspaper("O Panathinaikos kerdizei", 1993, "Mpezos", false, true);

		Library myLibrary = new Library();
		myLibrary.addItem(HP1);
		myLibrary.addItem(HP2);
		myLibrary.addItem(HB);
		myLibrary.addItem(taNea);
		myLibrary.checkIn(HP1);
		myLibrary.checkIn(HP2);
		myLibrary.checkOut(HP1);
		myLibrary.checkOut(HP1);
		System.out.println(myLibrary);

		Person AC = new Person("Andrew", "Clark");
		Person CM = new Person("Craig", "Morris");
		Person PG = new Person("Paige", "Godwin");

		myLibrary.addPerson(AC);
		myLibrary.addPerson(CM);
		myLibrary.addPerson(PG);
		System.out.println(myLibrary);
		myLibrary.removePerson(AC);
		System.out.println(myLibrary);

		List<Item> items = List.of(new Book("winnie the pooh", 1899, "Untitled Author", true, false),
				new Map("oi mpintedes sto vuzantio", 2001, "konstantinos katakouzinos", true, true),
				new Newspaper("pasok news", 2001, "manthos foustanos", false, false));

		for (Item i : items) {
			System.out.println(i.type());
		}

		List<Map> maps = new ArrayList<>();

		Map map1 = new Map("Map of Greece", 2005, "Untitled Author", true, false);
		Map map2 = new Map("Map of Turkey", 2005, "Untitled Author", true, false);
		Map map3 = new Map("Map of England", 2005, "Untitled Author", true, false);
		Map map4 = new Map("Map of Spain", 2005, "Untitled Author", true, false);

		maps.add(map1);
		maps.add(map4);
		maps.add(map3);
		maps.add(map2);

		Collections.sort(maps);

		System.out.println("Sorted maps: " + maps);
	}
}