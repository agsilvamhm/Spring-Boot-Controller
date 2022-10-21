package com.codegate.Aula01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homeApp(Model model){
        model.addAttribute("mensagem","Esta é uma mensagem injetada através do modelo");
        return "index";
    }
}