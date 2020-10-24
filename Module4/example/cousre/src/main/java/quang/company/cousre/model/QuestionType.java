package quang.company.cousre.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
public class QuestionType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idQuestionType;
    String nameQuestion;

    public Long getIdQuestionType() {
        return idQuestionType;
    }

    public void setIdQuestionType(Long idQuestionType) {
        this.idQuestionType = idQuestionType;
    }

    @OneToMany(mappedBy = "questionType", cascade = CascadeType.ALL)
    Collection<Question> questions;

    public QuestionType() {
    }

    public Collection<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Collection<Question> questions) {
        this.questions = questions;
    }


    public Long idQuestionType() {
        return idQuestionType;
    }

    public void idQuestionType(Long id) {
        this.idQuestionType = id;
    }

    public String getNameQuestion() {
        return nameQuestion;
    }

    public void setNameQuestion(String nameQuestion) {
        this.nameQuestion = nameQuestion;
    }
}
