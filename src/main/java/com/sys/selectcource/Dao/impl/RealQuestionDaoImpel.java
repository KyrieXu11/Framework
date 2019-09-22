package com.sys.selectcource.Dao.impl;

import com.sys.selectcource.Dao.QuestionDao;
import com.sys.selectcource.Mapper.QuestionMapper;
import com.sys.selectcource.enities.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("mysql")
public class RealQuestionDaoImpel implements QuestionDao {

    private final QuestionMapper questionMapper;

    @Autowired
    public RealQuestionDaoImpel(QuestionMapper questionMapper) {
        this.questionMapper = questionMapper;
    }

    @Override
    public boolean insertQuestion(Question question) {
        return questionMapper.insertQuestion(question);
    }

    @Override
    public List<Question> selectAll() {
        return questionMapper.selectAll();
    }

    @Override
    public boolean deleteByID(Integer id) {
        return questionMapper.deleteByID(id);
    }

    @Override
    public boolean updateByID(Integer id,Question question) {
        return questionMapper.updateByID(id,question);
    }

    @Override
    public Optional<Question> selectByID(Integer id) {
        return questionMapper.selectByID(id);
    }
}
