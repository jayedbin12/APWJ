package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import domain.calculator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.write("<h1>Hello Java<h1>");
    }

    @RequestMapping("/greet")
    public String greet() {
        return "home";
    }

    @RequestMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("name", "Jayed");
        return "welcome";
    }

    @RequestMapping("/register-form")
    public String registrationForm() {
        return "registration";
    }

    @RequestMapping("/register")
    public String register(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Registration Page: " + request.getParameter("username"));
        return "registration";
    }
    @RequestMapping("/register/v2")
    public String registerTwo(@ModelAttribute("firstname") String firstname, @ModelAttribute("lastname") String lastname, @ModelAttribute("email") String email, @ModelAttribute("password") String password, Model model) {
        model.addAttribute("firstname", firstname);
        model.addAttribute("lastname", lastname);
        model.addAttribute("email", email);
        model.addAttribute("password", password);
        return "welcome";
    }
    @RequestMapping("/tax-calculate")
    public String taxCalculate(Model model) {
        model.addAttribute("calculator", new calculator());
        return "taxcalculate";
    }
    @RequestMapping("/tax-calculate/v2")
    public String TaxCalculateTwo(@ModelAttribute("salary") String salary, @ModelAttribute calculator calculator, BindingResult result, Model model){
        model.addAttribute("salary", salary);
        model.addAttribute("calculator", calculator);
        return "calculation";
    }
}
