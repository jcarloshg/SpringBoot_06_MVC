package com.jcarloshg.mvc.DemoController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("helloWorldForm")
    public String helloWorldForm() {
        return "HelloWorldForm";
    }

    /**
     * only support get request
     *
     */
    @GetMapping("getHelloWorldForm")
    public String getHelloWorldForm() {
        return "HelloWorldForm";
    }

    @RequestMapping("getProcessForm")
    public String getProcessForm() {
        return "ProcessForm";
    }

    @RequestMapping("getProcessFormTwo")
    public String getProcessFormTwo(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        String message = "Yeah! " + name;
        model.addAttribute("message", message);
        return "ProcessForm";
    }

    @PostMapping("getProcessFormThree")
    public String getProcessFormThree(@RequestParam("studentName") String studentName, Model model) {
        studentName = studentName.toUpperCase();
        String message = "Yeah! " + studentName;
        model.addAttribute("message", message);
        return "ProcessForm";
    }

}
