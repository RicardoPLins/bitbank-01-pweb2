package br.edu.ifpb.pweb2.bitbank.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    
    @RequestMapping("/home")
    public String showHomepage(){
        return "index";
    }
}
