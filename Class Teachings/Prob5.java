/*
=====================================================
          Java: Library Management System
=====================================================

In this problem, we need to create a program that simulates a library management system.
The library should have the following features:

1. Add Book: Users should be able to add books to the library. Each book has a title,
   author, and availability (in stock or out of stock).
2. Borrow Book: Users should be able to borrow books from the library. If the book is
   not available, the user should not be able to borrow it.
3. Return Book: Users should be able to return books to the library.
4. View Library Inventory: Users should be able to view the current inventory of the
   library, including the available and borrowed books.

The program should implement custom exceptions to handle the following scenarios:
- Borrowing an Out-of-Stock Book: If the user tries to borrow a book that is out of
  stock, a custom exception (OutOfStockException) should be thrown.
- Exceeding the Maximum Borrowed Books: The library should have a maximum limit on
  the number of books a user can borrow at a time (e.g., 3 books). If the user tries
  to borrow a book and they have already reached the maximum, a custom exception
  (MaxBorrowedBooksException) should be thrown.
- The custom exceptions should provide meaningful error messages to the user.

Class Description:

1. Book (Class):
   - title: The title of the book.
   - author: The author of the book.
   - available: A boolean indicating whether the book is available or not.
   - getBookDetails(): Returns a string with the book's title, author, and availability status.
     Format: "<title> by <author> (Available: <available>)"

2. LibraryManagement (Interface):
   - void addBook(Book book)
   - String borrowBook(String user, Book book) throws OutOfStockException, MaxBorrowedBooksException
   - List<Book> getBooks()
   - String viewLibraryInventory()

3. LibraryManagementSystem (Class) implements LibraryManagement:
   - books: A list of Book objects in the library.
   - maxBorrowedBooks: The maximum number of books a user can borrow at a time.
   - borrowedBooks: A map of users and the books they have borrowed.
   - addBook(Book book): Adds a book to the library.
   - borrowBook(String user, Book book): Allows a user to borrow a book. Throws custom
     exception if the book is out of stock or if the user has reached the maximum number
     of borrowed books.
     Returns "User {name} has borrowed the book {title}." or error messages.
   - List<Book> getBooks(): Returns the books in the library.
   - viewLibraryInventory(): Displays the current inventory of the library, including
     available and borrowed books.

4. OutOfStockException (Custom Exception):
   - Inherits from Exception.
   - Message: "Cannot borrow book '<title>' as it is out of stock."

5. MaxBorrowedBooksException (Custom Exception):
   - Inherits from Exception.
   - Message: "Cannot borrow book as you have reached the maximum of <maxBorrowedBooks> borrowed books."

Input Format for Custom Testing
Sample Case 0
Sample Input 0
3
3
Great,Scott,True
Bird,Harper,True
George,Orwell,False
2
borrowBook,Jane,1
viewLibrary

Sample Output 0
User 'Jane' has borrowed the book 'Great'.

Library Inventory:
- Great by Scott (Available: false)
- Bird by Harper (Available: true)
- George by Orwell (Available: false)
Borrowed Books:
User 'Jane' has borrowed:
- Great by Scott (Available: false)
=====================================================
*/
import java.util.*;

// --------- CUSTOM EXCEPTIONS ---------

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        // YOUR CODE GOES HERE
        super(message);
    }
}

class MaxBorrowedBooksException extends Exception {
    public MaxBorrowedBooksException(String message) {
        // YOUR CODE GOES HERE
        super(message);
    }
}

// --------- BOOK CLASS ---------

class Book {
    // Declare variables
	String title;
	String author;
	boolean availabe;
	
    

    public Book(String title, String author, boolean available) {
        // YOUR CODE GOES HERE
    	this.title = title;
    	this.author = author;
    	this.availabe = available;
    	
        
    }
    
    // Getters and Setters if needed
    public String getTitle() { return title; /* Placeholder */ }
    public boolean isAvailable() { return availabe; /* Placeholder */ }
    public void setAvailable(boolean available) { this.availabe = available;/* Placeholder */ }

    public String getBookDetails() {
        // YOUR CODE GOES HERE
        return title+" by "+author+" (Available: "+availabe+")";
    }
}

// --------- LOCKED / GIVEN INTERFACE ---------

interface LibraryManagement {
    void addBook(Book book);
    String borrowBook(String user, Book book) throws OutOfStockException, MaxBorrowedBooksException;
    List<Book> getBooks();
    String viewLibraryInventory();
}

// --------- YOUR TASK STARTS HERE ---------

class LibraryManagementSystem implements LibraryManagement {
    
    // Declare variables (books list, map for borrowed books, max limit, etc.)
    List<Book> books ;
    Map<Book,String> borrowedBooks;
    int maxBorrowedBooks;
    int borrowed;

    public LibraryManagementSystem(int maxBorrowedBooks) {
        // YOUR CODE GOES HERE
    	books = new ArrayList<>();
    	borrowedBooks = new HashMap<>();
    	this.maxBorrowedBooks = maxBorrowedBooks;
    	borrowed = 0;
    }

    @Override
    public void addBook(Book book) {
        // YOUR CODE GOES HERE
        books.add(book);
    }

    @Override
    public String borrowBook(String user, Book book) throws OutOfStockException, MaxBorrowedBooksException {
        // YOUR CODE GOES HERE
        // 1. Check if book is available. If not, throw OutOfStockException.
        // 2. Check if user has reached max limit. If yes, throw MaxBorrowedBooksException.
        // 3. If valid, update book availability and add to user's borrowed list.
        // 4. Return success message.
    	if((!books.contains(book)) || (!book.availabe)) throw 
    		new OutOfStockException("Cannot borrow book "+book.title+" as it is out of stock.");
    	else if(borrowed == maxBorrowedBooks) {
    		throw new MaxBorrowedBooksException(
    				"Cannot borrow book as you have reached the maximum of "+maxBorrowedBooks+" borrowed books.");
    	}else {
    		for(Book b : books) {
    			if (b == book) b.setAvailable(false);
    		}
    		borrowed ++;
    		borrowedBooks.put(book, user);
    	}
        return "User "+user+" has borrowed the book "+book.title+".";
    }

    @Override
    public List<Book> getBooks() {
        // YOUR CODE GOES HERE
        return books; 
    }

    @Override
    public String viewLibraryInventory() {
        // YOUR CODE GOES HERE
        // Format:
        // "Library Inventory:\n"
        // "- <Book Details>\n" ...
        // "Borrowed Books:\n"
        // "User '<name>' has borrowed:\n"
        // "- <Book Details>\n" ...
    	String details = "";
    	String details2 = "";
    	for(Book b : books) {
    		details += b.getBookDetails()+"\n";
    	}
    	for(Book b : borrowedBooks.keySet()) {
    		details2 += "User "+borrowedBooks.get(b)+" has borrowed:\n"+b.getBookDetails()+"\n";
    	}
        return "Library Inventory:\n"
        		+details
        		+"Borrowed Books:\n"
        		+details2;
    }
}

// --------- MAIN CLASS (HANDLES INPUT PARSING) ---------

public class Prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read Max Limit
        int maxLimit = Integer.parseInt(sc.nextLine());

        // Initialize System
        LibraryManagementSystem library = new LibraryManagementSystem(maxLimit);

        // 2. Read number of books to add
        int numBooks = Integer.parseInt(sc.nextLine());

        // 3. Add Books
        for (int i = 0; i < numBooks; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            String title = parts[0];
            String author = parts[1];
            boolean available = Boolean.parseBoolean(parts[2]);
            
            library.addBook(new Book(title, author, available));
        }

        // 4. Read number of operations
        int numOps = Integer.parseInt(sc.nextLine());

        // 5. Process Operations
        for (int i = 0; i < numOps; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            String type = parts[0];

            try {
                if (type.equals("borrowBook")) {
                    String user = parts[1];
                    // Input uses 1-based indexing for books (e.g., 1 = first book)
                    int bookIndex = Integer.parseInt(parts[2]) - 1;
                    
                    Book bookToBorrow = library.getBooks().get(bookIndex);
                    System.out.println(library.borrowBook(user, bookToBorrow));
                    
                } else if (type.equals("viewLibrary")) {
                    System.out.println(library.viewLibraryInventory());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}