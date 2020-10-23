package quang.company.example.model;

import javax.persistence.*;

@Entity
@Table
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO);
    Long id;
    
}
