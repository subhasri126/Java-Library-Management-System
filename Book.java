class Book extends LibraryItem {

    private boolean available;
    private String status;

    Book(int bookId, String bookName, String author) {
        super(bookId, bookName, author);
        this.available = true;
        this.status = "Not Issued";
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getStatus() {
        return status;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    void displayDetails() {
        System.out.println("Book ID    : " + bookId);
        System.out.println("Book Name  : " + bookName);
        System.out.println("Author     : " + author);
        System.out.println("Available  : " + (available ? "Yes" : "No"));
        System.out.println("Status     : " + status);
    }

    void issueBook() {
        if (available) {
            available = false;
            status = "Issued";
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (!available) {
            available = true;
            status = "Not Issued";
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }
}