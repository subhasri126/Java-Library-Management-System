abstract class LibraryItem {

    protected int bookId;
    protected String bookName;
    protected String author;

    LibraryItem(int bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    abstract void displayDetails();

    void showMessage() {
        System.out.println("Library Book Information");
    }
}