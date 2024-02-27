package Lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Book extends Media {
    private int stock;
    private List<Review> reviews;

    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public double getAverageRating() {
        double sum = 0.0;
        for (Review review : reviews) {
            sum += Integer.parseInt(review.getRating());
        }
        return sum / reviews.size();
    }

    public void purchase(User user) {
        user.getPurchasedMediaList().add(this);
        stock--;
    }

    public boolean isBestseller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity) {
        stock += quantity;
        System.out.println(getTitle() + " book is restocked with " + quantity + " copies");
    }

    @Override
    public String getMediaType() {
        if (isBestseller()) {
            return "Bestselling Book";
        } else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Stock: " + stock + ", Reviews: " + reviews.size() + ", Average Rating: "
                + getAverageRating();
    }
}

