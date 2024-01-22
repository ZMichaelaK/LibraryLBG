package libraryLBG;

public class Newspaper extends Item implements Downloadable {
	public Newspaper() {
		super();
	}

	public Newspaper(boolean hasInterview) {
		super();
		this.hasInterview = hasInterview;
	}

	private boolean hasInterview;

	public Newspaper(String name, int year, String author, boolean isAvailable, boolean hasInterview) {
		super(name, year, author, isAvailable);
		this.hasInterview = hasInterview;
	}

	public String type() {
		return "fully paper";
	}

	public boolean hasInterview() {
		return hasInterview;
	}

	public void sethasInterview(boolean hasInterview) {
		this.hasInterview = hasInterview;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Newspaper other = (Newspaper) obj;

		if (!super.equals(obj)) {
			return false;
		}

		return this.hasInterview == other.hasInterview();
	}

	@Override
	public String toString() {
		return "Newspaper [hasInterview=" + hasInterview + ", type()=" + type() + "]";
	}

	@Override
	public void download() {
		System.out.println("download not available on the free plan");
	}

	public void setHasInterview(boolean hasInterview) {
		this.hasInterview = hasInterview;
	}
}