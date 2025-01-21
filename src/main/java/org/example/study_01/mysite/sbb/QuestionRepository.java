package org.example.study_01.mysite.sbb;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject); // 4.findBySubject 메서드
    Question findBySubjectAndContent(String subject, String content); // 5.findBySubjectAndContent 메서드
    List<Question> findBySubjectLike(String subject); // 6.findBySubjectLike 메서드
}