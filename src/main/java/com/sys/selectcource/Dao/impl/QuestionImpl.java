package com.sys.selectcource.Dao.impl;

import com.sys.selectcource.Dao.QuestionDao;
import com.sys.selectcource.enities.Question;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("mysql1")
public class QuestionImpl implements QuestionDao {

    private List<Question> DB =new ArrayList<>();

    @Override
    public boolean insertQuestion(Question question) {
        DB.add(new Question(question.getId(),question.getTitle()));
        return true;
    }

    @Override
    public List<Question> selectAll() {
        return DB;
    }

    @Override
    public boolean deleteByID(Integer bookid) {
        Optional<Question> question = selectByID(bookid);
        if(question.isEmpty()){
            return false;
        }else {
            DB.remove(question.get());
            return true;
        }
    }

    @Override
    public boolean updateByID(Integer id, Question question) {
        return false;
    }

    @Override
    public Optional<Question> selectByID(Integer bookid) {
        return DB.stream().filter(question ->
            question.getId().equals(bookid)).findFirst();
    }
}
