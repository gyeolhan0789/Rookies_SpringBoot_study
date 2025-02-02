package org.example.study_01.mysite.sbb.question;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.study_01.mysite.sbb.answer.Answer;
import org.example.study_01.mysite.sbb.user.SiteUser;

import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;
    private LocalDateTime modifyDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

    @ManyToOne
    private SiteUser author;
}
