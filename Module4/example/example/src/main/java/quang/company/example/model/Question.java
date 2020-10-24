package quang.company.example.model;

import javax.persistence.*;

@Entity
@Table
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    @NotEmpty
//    @Size(min=5 ,max =100)
    private String title;
//    @NotEmpty
//    @Size(min=10 ,max =500)
    private String questionAsk;
//    @NotEmpty
    private String answer;
//    @NotEmpty
    private String dateCreate;

    @ManyToOne()
    @JoinColumn(name = "idUser")
    User user;

    private String userFeedback;

    private String status;
    @ManyToOne()
    @JoinColumn(name = "idQuestionType")
    QuestionType questionType;

    public String getUserFeedback() {
        return userFeedback;
    }

    public void setUserFeedback(String userFeedback) {
        this.userFeedback = userFeedback;
    }

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return questionAsk;
    }

    public void setQuestion(String question) {
        this.questionAsk = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }
}
