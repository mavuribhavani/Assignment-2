class Item {
    String title;
    String author;
    int publicationYear;

    public Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Book extends Item {
    String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

class Magazine extends Item {
    int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter and the Sorcerers Stone", "J.K. Rowling", 1997, "Fantasy");

        Magazine magazine = new Magazine("National Geographic", "Editorial Team", 2024, 10);


        System.out.println("Book Details:");
        book.displayDetails();

        System.out.println("\nMagazine Details:");
        magazine.displayDetails();
    }
}




