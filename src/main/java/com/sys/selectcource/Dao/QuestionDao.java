package com.sys.selectcource.Dao;

import com.sys.selectcource.enities.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionDao {
    boolean insertQuestion(Question question);
    List<Question> selectAll();
    boolean deleteByID(Integer id);
    boolean updateByID(Integer id);
    Optional<Question> selectByID(Integer id);
}
