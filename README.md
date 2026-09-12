# Library Management System

## Project Description

The Library Management System is a Java-based application developed as the Week 6 Final Project of the Java Development Internship.

The application is designed to manage library book records through a simple menu-driven interface. It allows users to add, view, search, update, delete, issue, and return books.

The project applies the Java concepts learned throughout the internship, including Object-Oriented Programming, Collections, Exception Handling, File Handling, Interfaces, Abstract Classes, and Multithreading.

## Features

- Add new book records
- View all book records
- Search for a book using Book ID
- Update book details
- Delete book records
- Issue a book
- Return a book
- Check book availability
- Store book records in a text file
- Load previously saved book records when the application starts
- Handle invalid user inputs and runtime errors
- Prevent duplicate Book IDs
- Validate Book ID input
- Background task using multithreading
- Menu-driven interface

## Technologies Used

- Java
- Java Collections Framework
- File Handling
- Exception Handling
- Multithreading
- Git
- GitHub

## Java Concepts Used

- Classes and Objects
- Constructors
- `this` keyword
- `static` keyword
- Inheritance
- Polymorphism
- Method Overriding
- Encapsulation
- Abstraction
- Abstract Classes
- Interfaces
- ArrayList
- HashMap
- HashSet
- Exception Handling
- FileWriter
- FileReader
- BufferedReader
- Multithreading
- `Thread`
- `start()`
- `run()`
- `Thread.sleep()`

## Project Structure

```text
Library_Management_System
│
├── LibraryItem.java
├── Book.java
├── LibraryOperations.java
├── LibraryManagementSystem.java
├── FileManager.java
├── LibraryThread.java
├── books.txt
└── README.md
```


## How to Run the Project

### Step 1: Open the Project Folder

Open Command Prompt or PowerShell and navigate to the project folder.

    D:\Internova\Week_6\Library_Management_System

### Step 2: Compile the Java Files

Run the following command:

    javac *.java

### Step 3: Run the Application

Run the following command:

    java LibraryManagementSystem

### Step 4: Use the Menu

After running the application, the Library Management System menu will be displayed.

Enter the number corresponding to the required operation.

## Menu Options

    ======================================
           LIBRARY MANAGEMENT SYSTEM
    ======================================
    1. Add Book
    2. View All Books
    3. Search Book
    4. Update Book
    5. Delete Book
    6. Issue Book
    7. Return Book
    8. Exit
    --------------------------------------
    Enter your choice :

## Sample Output

### Background Task

    Library System: Background task completed.

### Add Book

    Enter your choice : 1
    Enter Book ID   : 101
    Enter Book Name : Java Programming
    Enter Author    : James Gosling
    Book added successfully.

### View All Books

    ======================================
               ALL BOOKS
    ======================================
    Book ID    : 101
    Book Name  : Java Programming
    Author     : James Gosling
    Available  : Yes
    Status     : Not Issued
    --------------------------------------

### Search Book

    Enter your choice : 3
    Enter Book ID to search : 101

    Book Found
    ----------
    Book ID    : 101
    Book Name  : Java Programming
    Author     : James Gosling
    Available  : Yes
    Status     : Not Issued

### Update Book

    Enter your choice : 4
    Enter Book ID to update : 101
    Enter New Book Name : Core Java
    Enter New Author    : James Gosling
    Book updated successfully.

### Delete Book

    Enter your choice : 5
    Enter Book ID to delete : 101
    Book deleted successfully.

### Issue Book

    Enter your choice : 6
    Enter Book ID to issue : 101
    Book issued successfully.

### Return Book

    Enter your choice : 7
    Enter Book ID to return : 101
    Book returned successfully.

### Invalid Book ID

    Enter your choice : 1
    Enter Book ID   : -101
    Book ID must be a positive number.

### Duplicate Book ID

    Enter your choice : 1
    Enter Book ID   : 101
    Book ID already exists.

## File Handling

The application uses file handling to store and retrieve library book records.

A text file named `books.txt` is used to store the following information:

- Book ID
- Book Name
- Author
- Availability
- Issue/Return Status

Book records are saved to the file whenever a record is:

- Added
- Updated
- Deleted
- Issued
- Returned

The saved records are loaded automatically when the application starts.

This allows the application to maintain book records even after the program is closed.

## Exception Handling

Exception handling is implemented to handle invalid inputs and runtime errors.

The application handles situations such as:

- Invalid numeric input
- Invalid Book ID
- Negative or zero Book ID
- Invalid menu choice
- Duplicate Book ID
- File-related errors
- Searching for a non-existing book
- Updating a non-existing book
- Deleting a non-existing book

The `try-catch` block is used to prevent the application from terminating unexpectedly due to invalid input or file-related errors.

## Collections Used

The project uses the Java Collections Framework to manage book records efficiently.

### ArrayList

`ArrayList` is used to store and manage the collection of `Book` objects.

### HashMap

`HashMap` is used to store books using Book ID as the key. It helps in quickly searching and accessing a particular book.

### HashSet

`HashSet` is used to maintain a collection of unique authors.

## Object-Oriented Programming Concepts

The project demonstrates important Object-Oriented Programming principles.

### Classes and Objects

Classes are used to represent library items and the library management system. Objects are created from these classes to manage book information.

### Constructors

Constructors are used to initialize book details such as Book ID, Book Name, and Author.

### `this` Keyword

The `this` keyword is used to refer to the current object's variables and initialize object data.

### `static` Keyword

The `static` keyword is used for common data such as the collections and Scanner used by the library management system.

### Abstraction

The `LibraryItem` class is an abstract class that provides a common structure for library items.

### Inheritance

The `Book` class extends the `LibraryItem` class and inherits its properties and methods.

### Encapsulation

Book details such as availability and status are maintained using private variables with getter and setter methods.

### Polymorphism

The `displayDetails()` method is overridden in the `Book` class to provide the book-specific implementation.

### Interface

The `LibraryOperations` interface defines the operations required for managing books.

The `LibraryManagementSystem` class implements the `LibraryOperations` interface.

## Multithreading

The project uses a separate thread through the `LibraryThread` class.

The thread performs a background task when the application starts and displays:

    Library System: Background task completed.

The project demonstrates the use of:

- `Thread`
- `run()`
- `start()`
- `Thread.sleep()`
- `join()`

The `join()` method is used to allow the background thread to complete before the main library menu is displayed.

## Git and GitHub

Git is used for version control and GitHub is used to manage and submit the project repository.

The repository contains:

- Java source files
- Text/data file
- `README.md`
- Project documentation
- Screenshots

Git helps to track project changes and GitHub provides a platform to store and share the project.

## Future Improvements

- Add library member management
- Add student/member registration
- Add book borrowing history
- Add due dates for issued books
- Add fine calculation
- Add login and authentication
- Add graphical user interface
- Use a database instead of a text file
- Add advanced book search and filtering
- Add book category management

## Conclusion

The Library Management System demonstrates the practical application of Java programming concepts learned during the six-week Java Development Internship.

The project provides a simple and functional way to manage library books through a menu-driven application. It combines Object-Oriented Programming, Collections, Exception Handling, File Handling, Interfaces, Abstract Classes, and Multithreading to create a complete Java application.

This project helped in developing practical programming, problem-solving, file management, and application development skills using Java.