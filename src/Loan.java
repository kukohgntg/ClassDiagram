// Loan.java
import java.time.LocalDate;

// Encapsulation
public class Loan {
    private Member member;  // Encapsulation
    private Book book;  // Encapsulation
    private LocalDate loanDate;  // Encapsulation
    private LocalDate returnDate;  // Encapsulation

    public Loan(Member member, Book book, LocalDate loanDate, LocalDate returnDate) {
        this.member = member;
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    // Getter and Setter methods
    public Member getMember() {  // Encapsulation
        return member;
    }

    public void setMember(Member member) {  // Encapsulation
        this.member = member;
    }

    public Book getBook() {  // Encapsulation
        return book;
    }

    public void setBook(Book book) {  // Encapsulation
        this.book = book;
    }

    public LocalDate getLoanDate() {  // Encapsulation
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {  // Encapsulation
        this.loanDate = loanDate;
    }

    public LocalDate getReturnDate() {  // Encapsulation
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {  // Encapsulation
        this.returnDate = returnDate;
    }

    public void returnBook() {
        this.returnDate = LocalDate.now();
        this.book.setAvailable(true);  // Encapsulation
    }

    @Override
    public String toString() {  // Polymorphism (method overriding)
        return "Loan [Member=" + member.getName() + ", Book=" + book.getTitle() + ", LoanDate=" + loanDate + ", ReturnDate=" + returnDate + "]";
    }
}
