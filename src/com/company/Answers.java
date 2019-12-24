package com.company;

public class Answers {
    public Answer_variant[] answers;
    public int right_answer;

    public Answers(Answer_variant[] a){
        this.answers = a;
        this.right_answer = ((int)(Math.random()*10))%4;
    }
    public boolean check(Answer_variant trying){
        return trying.equal(this.answers[right_answer]);
    }
    public static class Answer_variant {
        public String text;
        public Answer_variant(String t){
            this.text = t;
        }

        public boolean equal(Answer_variant answer_variant) {
            return this.text == answer_variant.text;
        }
    }
}
