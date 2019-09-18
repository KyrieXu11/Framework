package com.sys.selectcource.Controller;

import com.sys.selectcource.Service.QuestionService;
import com.sys.selectcource.Service.RealQuestionService;
import com.sys.selectcource.enities.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class QuestionController {

    private final RealQuestionService realQuestionService;

    @Autowired
    public QuestionController(RealQuestionService realQuestionService) {
        this.realQuestionService = realQuestionService;
    }

    @PostMapping
    public void addQuestion(@Valid @NonNull @RequestBody Question question){
        realQuestionService.addQuestion(question);
    }

    @GetMapping
    public List<Question> getAllQuestion(){
        return realQuestionService.getAllQuestion();
    }

    @GetMapping("{id}")
    public Optional<Question> getQuestionByID(@PathVariable(value = "id") Integer id){
        return realQuestionService.getQuestionByID(id);
    }

    @DeleteMapping(path = "{id}")
    public boolean deleteByQuestionID(@PathVariable("id") Integer id){
        return realQuestionService.deleteByQuestionID(id);
    }

    @PutMapping(path = "{id}")
    public boolean updateQuestionByID(@PathVariable("id") Integer id,@Valid @NonNull @RequestBody Question question){
        return realQuestionService.updateQuestionByID(id);
    }

}
