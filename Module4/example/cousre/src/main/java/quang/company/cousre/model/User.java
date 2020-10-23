package quang.company.example.model;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;
    private String username;

    public User(String username, Collection<Question> questions) {
        this.username = username;
        this.questions = questions;
    }

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    Collection<Question> questions;

    public Collection<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Collection<Question> questions) {
        this.questions = questions;
    }

    public User() {
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
