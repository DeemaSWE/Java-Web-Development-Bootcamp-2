package Lab3;


public class Main {

    public static void main(String[] args) {
        Store store = new Store();

        Book book = new Book("Book", "Author 1", "ISBN1", 10.99, 5);
        Movie movie = new Movie("Movie", "Director 1", "ISBN3", 9.99, 120);
        Music music = new Music("Music", "Artist 1", "ISBN5", 5.99, "Artist 1");
        Novel novel = new Novel("Novel", "Author 4", "ISBN8", 9.99, 4, "Mystery");
        AcademicBook academicBook = new AcademicBook("Academic Book", "Author 5", "ISBN9", 19.99, 1, "Computer Science");

        store.addMedia(book);
        store.addMedia(movie);
        store.addMedia(music);
        store.addMedia(novel);
        store.addMedia(academicBook);

        store.displayMedia();


        User user = new User("Deema", "deema@example.com");

        user.addToCart(book);
        user.addToCart(movie);
        user.addToCart(music);

        System.out.println("\nShopping Cart:");
        for (Media media : user.getShoppingCart()) {
            System.out.println(media);
        }

        user.checkout();

        System.out.println("\nPurchased Media:");
        for (Media media : user.getPurchasedMediaList()) {
            System.out.println(media);
        }

    }
}
