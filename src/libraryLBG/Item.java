package libraryLBG;

import java.util.Objects;

public abstract class Item implements Comparable<Item> {

	private static int count = 1;
	private int id;

	private String name;
	private int year;
	private String author;
	private boolean isAvailable = true;

	public Item() {
		super();
		this.id = count++;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", year=" + year + ", author=" + author + ", isAvailable="
				+ isAvailable + "]";
	}

	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return id - o.id;
	}

	public Item(String name, int year, String author, boolean isAvailable) {
		super();
		this.id = count++;
		this.name = name;
		this.year = year;
		this.author = author;
		this.isAvailable = true;
	}

	public abstract String type();

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public void list() {
		System.out.println("Item name: " + this.name);
		System.out.println("Year: " + this.year);
		System.out.println("Author: " + this.author);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name)
				&& year == other.year;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Item.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
