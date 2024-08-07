package com.jcarloshg.mvc.DemoController;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jcarloshg.mvc.model.Student;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${favoriteSystem}")
    private List<String> favoriteSystem;

    @GetMapping("/form")
    public String getStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("countries", countries);
        model.addAttribute("languages", languages);
        model.addAttribute("favoriteSystem", favoriteSystem);
        return "StudentForm";
    }

    @PostMapping("/processStudent")
    public String postProcessStudent(@ModelAttribute("student") Student student) {
        System.out.println("The student is " + student.toString());
        return "ProcessStudent";
    }
}
