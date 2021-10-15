package de.neuefische.devquiz.controller;

import de.neuefische.devquiz.model.Question;
import de.neuefische.devquiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DevQuizController {

    private final QuestionService questionService;

    @Autowired
    public DevQuizController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/api/question")
    public List<Question> listQuestion() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/api/question/{id}")
    public Question get(@PathVariable String id) {
        return questionService.get(id);
    }

    @PostMapping("/api/question")
    public Question addQuestion(@RequestBody Question newQuestion) {
        return questionService.addQuestion(newQuestion);
    }
}
