
import java.util.Scanner;

public class MN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Sample books
        library.addBook(new Book(1, "Java Basics", "James"));
        library.addBook(new Book(2, "Data Structures", "Mark"));
        library.addBook(new Book(3, "Operating Systems", "William"));

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    library.showBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    id = sc.nextInt();
                    library.searchBook(id);
                    break;

                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    id = sc.nextInt();
                    library.issueBook(id);
                    break;

                case 5:
                    System.out.print("Enter Book ID to return: ");
                    id = sc.nextInt();
                    library.returnBook(id);
                    break;

                case 6:
                    System.out.println("Thank you for using the library!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
