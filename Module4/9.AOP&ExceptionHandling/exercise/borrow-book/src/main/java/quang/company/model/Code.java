package quang.company.model;

import javax.persistence.*;

@Entity
@Table
public class Code {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idCode;
    int codeBook;

    @ManyToOne()
    @JoinColumn(name = "idBook")
    Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Code() {
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public int getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(int codeBook) {
        this.codeBook = codeBook;
    }
}
