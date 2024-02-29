package Day15_Exercise;

public class Car implements Vehicle{

    private String model;
    private int days;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return 50 * days;
    }

    @Override
    public void displayDetails() {
        System.out.printf("""
                \nRental Details:
                Car Model: %s
                Daily Rental Rate: $50
                Rental Cost: $%.2f%n""", model, calculateRentalCost());
    }
}
