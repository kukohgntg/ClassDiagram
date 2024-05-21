// LibrarySystem.java
import java.time.LocalDate;
import java.util.Scanner;

public class LibrarySystem {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Sample data
        initializeSampleData();

        // Main menu
        while (true) {
            System.out.println("\nLibrary System Menu");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Add Staff");
            System.out.println("4. Loan Book");
            System.out.println("5. Return Book");
            System.out.println("6. View All Books");
            System.out.println("7. View All Members");
            System.out.println("8. View All Staff");
            System.out.println("9. View All Loans");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addMember();
                    break;
                case 3:
                    addStaff();
                    break;
                case 4:
                    loanBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    viewAllBooks();
                    break;
                case 7:
                    viewAllMembers();
                    break;
                case 8:
                    viewAllStaff();
                    break;
                case 9:
                    viewAllLoans();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void initializeSampleData() {
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));  // Abstraction
        library.addBook(new Book("1984", "George Orwell", "9780451524935"));  // Abstraction
        library.addMember(new Member("John Doe", "M001"));  // Abstraction
        library.addMember(new Member("Jane Smith", "M002"));  // Abstraction
        library.addStaff(new Staff("Alice Brown", "S001", "Librarian"));  // Abstraction
        library.addStaff(new Staff("Bob White", "S002", "Assistant Librarian"));  // Abstraction
    }

    private static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book ISBN: ");
        String ISBN = scanner.nextLine();
        library.addBook(new Book(title, author, ISBN));  // Abstraction
        System.out.println("Book added successfully.");
    }

    private static void addMember() {
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();
        System.out.print("Enter member ID: ");
        String memberId = scanner.nextLine();
        library.addMember(new Member(name, memberId));  // Abstraction
        System.out.println("Member added successfully.");
    }

    private static void addStaff() {
        System.out.print("Enter staff name: ");
        String name = scanner.nextLine();
        System.out.print("Enter staff ID: ");
        String staffId = scanner.nextLine();
        System.out.print("Enter staff position: ");
        String position = scanner.nextLine();
        library.addStaff(new Staff(name, staffId, position));  // Abstraction
        System.out.println("Staff added successfully.");
    }

    private static void loanBook() {
        System.out.print("Enter member ID: ");
        String memberId = scanner.nextLine();
        Member member = library.findMemberById(memberId);  // Abstraction
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        System.out.print("Enter book ISBN: ");
        String ISBN = scanner.nextLine();
        Book book = library.findBookByISBN(ISBN);  // Abstraction
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book is already loaned out.");
            return;
        }

        Loan loan = new Loan(member, book, LocalDate.now(), null);  // Abstraction
        library.addLoan(loan);  // Abstraction
        book.setAvailable(false);  // Encapsulation
        System.out.println("Book loaned successfully.");
    }

    private static void returnBook() {
        System.out.print("Enter book ISBN: ");
        String ISBN = scanner.nextLine();
        Book book = library.findBookByISBN(ISBN);  // Abstraction
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.isAvailable()) {
            System.out.println("Book is not currently loaned out.");
            return;
        }

        for (Loan loan : library.getLoans()) {  // Encapsulation
            if (loan.getBook().getISBN().equals(ISBN) && loan.getReturnDate() == null) {
                loan.returnBook();  // Encapsulation
                System.out.println("Book returned successfully.");
                return;
            }
        }

        System.out.println("Loan record not found.");
    }

    private static void viewAllBooks() {
        System.out.println("\nAll Books:");
        for (Book book : library.getBooks()) {  // Encapsulation
            System.out.println(book);
        }
    }

    private static void viewAllMembers() {
        System.out.println("\nAll Members:");
        for (Member member : library.getMembers()) {  // Encapsulation
            System.out.println(member);
        }
    }

    private static void viewAllStaff() {
        System.out.println("\nAll Staff:");
        for (Staff staff : library.getStaffs()) {  // Encapsulation
            System.out.println(staff);
        }
    }

    private static void viewAllLoans() {
        System.out.println("\nAll Loans:");
        for (Loan loan : library.getLoans()) {  // Encapsulation
            System.out.println(loan);
        }
    }
}
