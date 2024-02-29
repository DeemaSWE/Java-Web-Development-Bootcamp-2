package Day15_Exercise;

public class Bike implements Vehicle{

    private String brand;
    private int hour;

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return 10 * hour;
    }

    @Override
    public void displayDetails() {
        System.out.printf("""
                \nRental Details:
                Bike Brand: %s
                Hourly Rental Rate: $10
                Rental Cost: $%.2f%n""", brand, calculateRentalCost());
    }
}
