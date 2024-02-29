package Day15_Exercise;

public class Truck implements Vehicle{

    private String type;
    private int week;

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return 500 * week;
    }

    @Override
    public void displayDetails() {
        System.out.printf("""
                \nRental Details:
                Truck type: %s
                Weekly Rental Rate: $500
                Rental Cost: $%.2f%n""", type, calculateRentalCost());
    }
}
