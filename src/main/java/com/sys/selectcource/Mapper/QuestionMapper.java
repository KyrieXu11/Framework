package com.sys.selectcource.Mapper;

import com.sys.selectcource.Dao.QuestionDao;
import com.sys.selectcource.enities.Question;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface QuestionMapper extends QuestionDao {


    @Override
    @Insert("insert into question(id,title) values(#{id},#{title})")
    boolean insertQuestion(Question question);

    @Override
    @Select("select * from question")
    List<Question> selectAll();

    @Override
    @Delete("delete from question where id=#{id}")
    boolean deleteByID(@Param(value = "id") Integer id);

    @Override
    @Update("update question set title=#{question.title} where id=#{id}")
    boolean updateByID(@Param(value = "id") Integer id,Question question);

    @Override
    @Select("select * from question where id=#{id}")
    Optional<Question> selectByID(@Param(value = "id") Integer id);
}
