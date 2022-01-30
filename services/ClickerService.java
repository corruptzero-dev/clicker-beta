package ru.corruptzero.clicker.services;


import org.springframework.stereotype.Service;

@Service
public class ClickerService {
    private int score = 0;

    public ClickerService() {
    }

    public void click(int pts){
        if(pts>0 && pts<5){
            score+=pts;
        }
    }
    public int getScore() {
        return score;
    }
}
