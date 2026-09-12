import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LibraryManagementSystem implements LibraryOperations {

    static ArrayList<Book> books = new ArrayList<>();
    static HashMap<Integer, Book> bookMap = new HashMap<>();
    static HashSet<String> authors = new HashSet<>();

    static Scanner sc = new Scanner(System.in);

    public void addBook() {

        try {
            System.out.print("Enter Book ID   : ");
            int id = sc.nextInt();
            sc.nextLine();

            if (id <= 0) {
                System.out.println("Book ID must be a positive number.");
                return;
            }

            if (bookMap.containsKey(id)) {
                System.out.println("Book ID already exists.");
                return;
            }

            if (bookMap.containsKey(id)) {
                System.out.println("Book ID already exists.");
                return;
            }

            System.out.print("Enter Book Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Author    : ");
            String author = sc.nextLine();

            Book book = new Book(id, name, author);

            books.add(book);
            bookMap.put(id, book);
            authors.add(author);

            FileManager.saveBooks();

            System.out.println("Book added successfully.");

        } catch (Exception e) {
            System.out.println("Invalid input.");
            sc.nextLine();
        }
    }

    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n======================================");
        System.out.println("           ALL BOOKS");
        System.out.println("======================================");

        for (Book book : books) {
            book.displayDetails();
            System.out.println("--------------------------------------");
        }
    }

    public void searchBook() {

        try {
            System.out.print("Enter Book ID to search : ");
            int id = sc.nextInt();

            if (bookMap.containsKey(id)) {
                System.out.println("\nBook Found");
                System.out.println("----------");
                bookMap.get(id).displayDetails();
            } else {
                System.out.println("Book not found.");
            }

        } catch (Exception e) {
            System.out.println("Invalid Book ID.");
            sc.nextLine();
        }
    }

    public void updateBook() {

        try {
            System.out.print("Enter Book ID to update : ");
            int id = sc.nextInt();
            sc.nextLine();

            if (bookMap.containsKey(id)) {

                Book book = bookMap.get(id);

                System.out.print("Enter New Book Name : ");
                String name = sc.nextLine();

                System.out.print("Enter New Author    : ");
                String author = sc.nextLine();

                book.setBookName(name);
                book.setAuthor(author);

                authors.add(author);

                FileManager.saveBooks();

                System.out.println("Book updated successfully.");

            } else {
                System.out.println("Book not found.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input.");
            sc.nextLine();
        }
    }

    public void deleteBook() {

        try {
            System.out.print("Enter Book ID to delete : ");
            int id = sc.nextInt();

            if (bookMap.containsKey(id)) {

                Book book = bookMap.get(id);

                books.remove(book);
                bookMap.remove(id);

                FileManager.saveBooks();

                System.out.println("Book deleted successfully.");

            } else {
                System.out.println("Book not found.");
            }

        } catch (Exception e) {
            System.out.println("Invalid Book ID.");
            sc.nextLine();
        }
    }

    public void issueBook() {

        try {
            System.out.print("Enter Book ID to issue : ");
            int id = sc.nextInt();

            if (bookMap.containsKey(id)) {
                bookMap.get(id).issueBook();
                FileManager.saveBooks();
            } else {
                System.out.println("Book not found.");
            }

        } catch (Exception e) {
            System.out.println("Invalid Book ID.");
            sc.nextLine();
        }
    }

    public void returnBook() {

        try {
            System.out.print("Enter Book ID to return : ");
            int id = sc.nextInt();

            if (bookMap.containsKey(id)) {
                bookMap.get(id).returnBook();
                FileManager.saveBooks();
            } else {
                System.out.println("Book not found.");
            }

        } catch (Exception e) {
            System.out.println("Invalid Book ID.");
            sc.nextLine();
        }
    }

    public static void main(String[] args) {

        LibraryManagementSystem library = new LibraryManagementSystem();
        FileManager.loadBooks();

        LibraryThread thread = new LibraryThread();
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
    }

            int choice = 0;

        do {

            System.out.println("\n======================================");
            System.out.println("       LIBRARY MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.println("--------------------------------------");

            try {

                System.out.print("Enter your choice : ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        library.addBook();
                        break;

                    case 2:
                        library.viewBooks();
                        break;

                    case 3:
                        library.searchBook();
                        break;

                    case 4:
                        library.updateBook();
                        break;

                    case 5:
                        library.deleteBook();
                        break;

                    case 6:
                        library.issueBook();
                        break;

                    case 7:
                        library.returnBook();
                        break;

                    case 8:
                        System.out.println(
                            "Thank you for using Library Management System."
                        );
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (Exception e) {

                System.out.println("Please enter a valid number.");
                sc.nextLine();
            }

        } while (choice != 8);

        sc.close();
    }
}