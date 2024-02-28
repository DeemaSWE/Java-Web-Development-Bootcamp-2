package Day14_Exercise;

public class Movie extends Product{

    private String director;

    public Movie() {
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        double price = super.getPrice();
        price -= price * 0.3;
        return 30;
    }

    @Override
    public String toString() {
        return "\nMovie" +
                "\nName: " + super.getName() +
                "\nPrice: " + super.getPrice() +
                "\nDirector:" + director;
    }
}
