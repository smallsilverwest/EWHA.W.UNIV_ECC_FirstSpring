package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {

    @GetMapping("random-quote")
    public String randomQuote(Model model){
        String[] quotes = {
                "Maturity is only a short break in adolescence." +
                        "-Jules Feiffer-",
                "To love someone is to identify with them." +
                        "-Aristotle-",
                "Only I can change my life. " +
                        "No one can do it for me. -베토벤-",
                "Failure is not the only punishment for laziness; " +
                        "there is also the success of others. -Jules Renard-",
                "Someone's sitting in the shade today because someone planted a tree a long time ago. " +
                        "-Warren Buffett-"
        };
        int randInt = (int) (Math.random() * quotes.length);
        model.addAttribute("randomQuote", quotes[randInt]);
        return "quote";
    }
}
