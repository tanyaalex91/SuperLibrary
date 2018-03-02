package by.htp.lib.bean;

public class Book {
	
	private int id;
	private String title;
	private int year;
	private Author author;
	
	public Book () {
		super();
	}

	public Book (int id, String title, int year) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", year=" + year + ", author=" + author + "]";
	}

	public Book(int id, String title, int year, Author author)
{
		super();
		}
}
