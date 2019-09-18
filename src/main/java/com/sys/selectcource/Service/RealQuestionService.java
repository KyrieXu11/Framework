package com.sys.selectcource.Service;

import com.sys.selectcource.Dao.QuestionDao;
import com.sys.selectcource.enities.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RealQuestionService {
    private final QuestionDao questionDao;

    @Autowired
    public RealQuestionService(@Qualifier("mysql") QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public boolean addQuestion(Question question){
        return questionDao.insertQuestion(question);
    }

    public List<Question> getAllQuestion(){
        return questionDao.selectAll();
    }

    public Optional<Question> getQuestionByID(Integer id){
        return questionDao.selectByID(id);
    }

    public boolean deleteByQuestionID(Integer id){
        return questionDao.deleteByID(id);
    }

    public boolean updateQuestionByID(Integer id,Question question){
        return questionDao.updateByID(id,question);
    }
}
