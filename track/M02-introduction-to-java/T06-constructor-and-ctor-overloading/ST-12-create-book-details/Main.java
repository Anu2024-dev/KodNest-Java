
import java.util.Scanner;

class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author:  " + author);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String author = sc.nextLine();
        Book b = new Book(name, author);
        b.display();
    }
}
