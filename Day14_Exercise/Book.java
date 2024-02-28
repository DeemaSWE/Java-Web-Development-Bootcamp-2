package Day14_Exercise;

public class Book extends Product{

    private String author;

    public Book() {
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        double price = super.getPrice();
        price -= price * 0.20;
        return price;
    }

    @Override
    public String toString() {
        return "\nBook" +
                "\nName: " + super.getName() +
                "\nPrice: " + super.getPrice() +
                "\nAuthor: " + author;
    }
}
