package com.company;

public class Question {
    public String TextQuestroin;
    public Answers variants;

    public Question(Answers ans, String text){
        this.TextQuestroin = text;
        this.variants = ans;
    }

}
