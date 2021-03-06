package com.sys.selectcource.Mapper;

import com.sys.selectcource.Dao.QuestionDao;
import com.sys.selectcource.enities.Question;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface QuestionMapper extends QuestionDao {


    @Override
    @Insert("insert into question(bookid,title) values(#{bookid},#{title})")
    boolean insertQuestion(Question question);

    @Override
    @Select("select * from question")
    List<Question> selectAll();

    @Override
    @Delete("delete from question where bookid=#{bookid}")
    boolean deleteByID(@Param(value = "id") Integer id);

    @Override
    @Update("update question set title=#{question.title} where bookid=#{bookid}")
    boolean updateByID(@Param(value = "id") Integer id,Question question);

    @Override
    @Select("select * from question where bookid=#{bookid}")
    Optional<Question> selectByID(@Param(value = "id") Integer id);
}
