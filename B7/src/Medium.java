public class Medium {

	private String title;
	private String autor;
	private String publisher;
	private int year;
	private int isbn;
	private boolean reserved;
	private String catergory;
	private int id;

	public boolean isLeanable(Medium medium) {
		return medium.isReserved();
	}

	public Medium(String title, String autor, String publisher, int year, int isbn, boolean reserved, String catergory, int id) {
		this.title = title;
		this.autor = autor;
		this.publisher = publisher;
		this.year = year;
		this.isbn = isbn;
		this.reserved = reserved;
		this.catergory = catergory;
		this.id = id;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	public String getCatergory() {
		return catergory;
	}

	public void setCatergory(String catergory) {
		this.catergory = catergory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}