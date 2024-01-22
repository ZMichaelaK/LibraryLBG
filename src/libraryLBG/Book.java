package libraryLBG;

public class Book extends Item implements Downloadable {
	public Book() {
		super();
	}

	public Book(boolean bestSeller) {
		super();
		this.bestSeller = bestSeller;
	}

	private boolean bestSeller;

	public Book(String name, int year, String author, boolean isAvailable, boolean bestSeller) {
		super(name, year, author, isAvailable);
		this.bestSeller = bestSeller;
	}

	public String type() {
		return "hardback";
	}

	public boolean bestSeller() {
		return bestSeller;
	}

	public void setBestSeller(boolean bestSeller) {
		this.bestSeller = bestSeller;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Book other = (Book) obj;

		if (!super.equals(obj)) {
			return false;
		}

		return this.bestSeller == other.bestSeller();
	}

	@Override
	public String toString() {
		return "Book [bestSeller=" + bestSeller + ", type()=" + type() + "]";
	}

	@Override
	public void download() {
		System.out.println("download available");
	}

	public boolean isBestSeller() {
		return bestSeller;
	}
}
