public class Demo {

    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook();
        LibraryBook book2 = new LibraryBook();

        System.out.println("Book 1 configure(3): "
                + book1.configure(3));
        System.out.println("Borrowed: "
                + book1.getBorrowed()
                + " / Available: "
                + book1.getAvailable());

        System.out.println("\nBook 1 borrow(2): "
                + book1.borrow(2));
        System.out.println("Borrowed: "
                + book1.getBorrowed()
                + " / Available: "
                + book1.getAvailable());

        System.out.println("\nBook 1 borrow(2): "
                + book1.borrow(2));
        System.out.println("Borrowed: "
                + book1.getBorrowed()
                + " / Available: "
                + book1.getAvailable());

        System.out.println("\nBook 1 returnCopies(1): "
                + book1.returnCopies(1));
        System.out.println("Borrowed: "
                + book1.getBorrowed()
                + " / Available: "
                + book1.getAvailable());

        System.out.println("\nBook 1 returnCopies(2): "
                + book1.returnCopies(2));
        System.out.println("Borrowed: "
                + book1.getBorrowed()
                + " / Available: "
                + book1.getAvailable());

        System.out.println("\nBook 1 borrow(): "
                + book1.borrow());
        System.out.println("Borrowed: "
                + book1.getBorrowed()
                + " / Available: "
                + book1.getAvailable());

        System.out.println("\nBook 1 configure(10): "
                + book1.configure(10));

        System.out.println("\nBook 2 configure(1): "
                + book2.configure(1));
        System.out.println("Book 2 Borrowed: "
                + book2.getBorrowed()
                + " / Available: "
                + book2.getAvailable());
    }
}