// Library.java
import java.util.ArrayList;
import java.util.List;

// Encapsulation
public class Library {
    private List<Book> books;  // Encapsulation
    private List<Member> members;  // Encapsulation
    private List<Staff> staffs;  // Encapsulation
    private List<Loan> loans;  // Encapsulation

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        staffs = new ArrayList<>();
        loans = new ArrayList<>();
    }

    // Methods to add and get books, members, staff, and loans
    public void addBook(Book book) {
        books.add(book);  // Encapsulation
    }

    public void addMember(Member member) {
        members.add(member);  // Encapsulation
    }

    public void addStaff(Staff staff) {
        staffs.add(staff);  // Encapsulation
    }

    public void addLoan(Loan loan) {
        loans.add(loan);  // Encapsulation
    }

    public List<Book> getBooks() {
        return books;  // Encapsulation
    }

    public List<Member> getMembers() {
        return members;  // Encapsulation
    }

    public List<Staff> getStaffs() {
        return staffs;  // Encapsulation
    }

    public List<Loan> getLoans() {
        return loans;  // Encapsulation
    }

    // Method to find book by ISBN
    public Book findBookByISBN(String ISBN) {
        for (Book book : books) {  // Encapsulation
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    // Method to find member by ID
    public Member findMemberById(String memberId) {
        for (Member member : members) {  // Encapsulation
            if (member.getId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }
}
