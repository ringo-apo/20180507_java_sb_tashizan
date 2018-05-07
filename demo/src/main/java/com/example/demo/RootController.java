package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class RootController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("kekka")
    public String kekka(@RequestParam("textBox1") String textBox1, @RequestParam("textBox2") String textBox2, Model model) {
        int t1=Integer.parseInt(textBox1.toString());
        int t2=Integer.parseInt(textBox2.toString());
        int c = t1+t2;
        String cs = String.valueOf(c);
        model.addAttribute("total", cs);
        return "kekka";
    }




}
