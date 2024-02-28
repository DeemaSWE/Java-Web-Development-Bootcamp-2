package Day14_Exercise;

public class Main {

    public static void main(String[] args) {

        Book b = new Book("Book 1", 150, "author 1");
        System.out.println(b);
        System.out.println("Price after discount: " + b.getDiscount());

        Movie m = new Movie("Movie 1", 50, "Director 1");
        System.out.println(m);
        System.out.println("Price after discount: " + m.getDiscount());

        MovablePoint mp = new MovablePoint(50,20, 10, 5);

        mp.moveUp();
        mp.moveRight();

        System.out.println(mp);

    }
}


