package Week10;

public class Book {
    private String name;
    private String author;
    private int year;
    private int pages;
    private double price;

    public Book(String name, String author, int year, int pages, double price) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }
}
