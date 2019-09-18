package com.sys.selectcource.Controller;

import com.sys.selectcource.Service.QuestionService;
import com.sys.selectcource.enities.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class QuestionController {

    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public void addQuestion(@Valid @NonNull @RequestBody Question question){
        questionService.addQuestion(question);
    }

    @GetMapping
    public List<Question> getAllQuestion(){
        return questionService.getAllQuestion();
    }

    @GetMapping("{id}")
    public Optional<Question> getQuestionByID(@PathVariable(value = "id") Integer id){
        return questionService.getQuestionByID(id);
    }

    @DeleteMapping(path = "{id}")
    public boolean deleteByQuestionID(@PathVariable("id") Integer id){
        return questionService.deleteByQuestionID(id);
    }

    @PutMapping(path = "{id}")
    public boolean updateQuestionByID(@PathVariable("id") Integer id,@Valid @NonNull @RequestBody Question question){
        return questionService.updateQuestionByID(id,question);
    }

}
