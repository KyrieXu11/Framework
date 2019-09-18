package com.sys.selectcource.Dao.impl;

import com.sys.selectcource.Dao.QuestionDao;
import com.sys.selectcource.enities.Question;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("fakeDao")
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
    public boolean deleteByID(Integer id) {
        Optional<Question> question = selectByID(id);
        if(question.isEmpty()){
            return false;
        }else {
            DB.remove(question.get());
            return true;
        }
    }

    @Override
    public boolean updateByID(Integer id,Question update) {
        return selectByID(id).map(q->{
            int indexOfQuestionToUpdate=DB.indexOf(q);
            if(indexOfQuestionToUpdate>=0){
                DB.set(indexOfQuestionToUpdate,new Question(id,update.getTitle()));
                return true;
            }
            return false;
        }).orElse(false);
    }

    @Override
    public Optional<Question> selectByID(Integer id) {
        return DB.stream().filter(question ->
            question.getId().equals(id)).findFirst();
    }
}
