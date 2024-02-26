package Day12_Exercise;

public class Shape {

    private String color;
    private boolean filled;

    public Shape() {
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String isFilled = isFilled() ? "filled" : "Not filled";
        return "A Shape with color of "+ color + " and " + isFilled;
    }
}
