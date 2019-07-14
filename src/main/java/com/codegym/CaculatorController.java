package com.codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaculatorController {

    @GetMapping
    public ModelAndView index(){
       ModelAndView modelAndView =new ModelAndView("index");
       return modelAndView;
    }

    @PostMapping("result")
    public String result(@RequestParam double firstNumber, double secondNumber,
                         String caculator , Model model){
        if (caculator.equals("Addition(+)")){
            model.addAttribute("result",firstNumber+secondNumber);
        }else if (caculator.equals("Subtraction(-)")){
            model.addAttribute("result",firstNumber-secondNumber);
        }else if (caculator.equals("Multiplication(x)")){
            model.addAttribute("result",firstNumber*secondNumber);
        }else {
            model.addAttribute("result",firstNumber/secondNumber);
        }
        return "index";
    }

}
