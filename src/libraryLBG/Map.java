package libraryLBG;

public class Map extends Item {
	public Map() {
		super();
	}

	public Map(boolean hasColour) {
		super();
		this.hasColour = hasColour;
	}

	private boolean hasColour;

	public Map(String name, int year, String author, boolean hasColour, boolean isAvailable) {
		super(name, year, author, isAvailable);
		this.hasColour = hasColour;
	}

	public boolean hasColour() {
		return hasColour;
	}

	public void sethasColour(boolean hasColour) {
		this.hasColour = hasColour;
	}

	@Override
	public String type() {
		return "recyclable";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Map other = (Map) obj;

		if (!super.equals(obj)) {
			return false;
		}

		return this.hasColour == other.hasColour();
	}

	@Override
	public String toString() {
		return "Map [hasColour=" + hasColour + ", hasColour()=" + hasColour() + ", type()=" + type()
				+ ", isAvailable()=" + isAvailable() + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getYear()=" + getYear() + ", getAuthor()=" + getAuthor() + "]";
	}

	public boolean isHasColour() {
		return hasColour;
	}

	public void setHasColour(boolean hasColour) {
		this.hasColour = hasColour;
	}
}
