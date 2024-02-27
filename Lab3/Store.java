package Lab3;

import java.util.ArrayList;
import java.util.List;

class Store {
    private List<User> users;
    private List<Media> medias;

    public Store() {
        this.users = new ArrayList<>();
        this.medias = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayUsers() {
        System.out.println("Users:");
        for (User user : users) {
            System.out.println(user.getUsername() + " - " + user.getEmail());
        }
    }

    public void addMedia(Media media) {
        medias.add(media);
    }

    public void displayMedia() {
        System.out.println("\nMedia:");
        for (Media media : medias) {
            System.out.println(media);
        }
    }

    public Book searchBook(String title) {
        for (Media media : medias) {
            if (media instanceof Book && media.getTitle().equals(title)) {
                return (Book) media;
            }
        }
        return null;
    }
}
