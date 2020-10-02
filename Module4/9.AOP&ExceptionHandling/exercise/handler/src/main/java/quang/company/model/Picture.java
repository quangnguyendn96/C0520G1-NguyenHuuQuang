package quang.company.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Picture {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int rate;
    private String author;
    private String feedback;
    private long totalLike;

    public Picture() {
    }

    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTotalLike() {
        return totalLike;
    }

    public void setTotalLike(long totalLike) {
        this.totalLike = totalLike;
    }
}
