import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileManager {

    static String fileName = "books.txt";

    public static void saveBooks() {

        try {

            FileWriter writer = new FileWriter(fileName);

            for (Book book : LibraryManagementSystem.books) {

                writer.write(
                    book.getBookId() + "|" +
                    book.getBookName() + "|" +
                    book.getAuthor() + "|" +
                    book.isAvailable() + "|" +
                    book.getStatus() + "\n"
                );
            }

            writer.close();

        } catch (IOException e) {

            System.out.println("Error while saving books.");
        }
    }

    public static void loadBooks() {

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split("\\|");

                if (data.length == 5) {

                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    String author = data[2];

                    Book book = new Book(id, name, author);

                    if (data[3].equals("false")) {
                        book.setStatus("Issued");
                        book.setAvailable(false);
                    }

                    LibraryManagementSystem.books.add(book);
                    LibraryManagementSystem.bookMap.put(id, book);
                    LibraryManagementSystem.authors.add(author);
                }
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("No previous book records found.");
        }
    }
}