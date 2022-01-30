package ru.corruptzero.clicker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.corruptzero.clicker.services.ClickerService;

@RestController
public class ClickerController {
    @Autowired
    private ClickerService clickerService;

    @GetMapping
    int getScore(){
        return clickerService.getScore();
    }

    @PostMapping("/click")
    void clickerModel(@RequestBody int clickAmount) {
        clickerService.click(clickAmount);
    }

}
