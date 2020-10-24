package quang.company.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idBook;

    String nameBook;
    String author;
    double price;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    Collection<Code> codes;

    public Collection<Code> getCodes() {
        return codes;
    }

    public void setCodes(Collection<Code> codes) {
        this.codes = codes;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    int amount;

    public Book() {
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
