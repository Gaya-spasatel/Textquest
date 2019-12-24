package com.company;

public class Game implements Games{
    public String gametype = "just Game";
    private int countrightline=0;
    private int lifes;
    private Question[] voprosy;
    private int countquestions=0;

    public Game(){
        System.out.print("AHAHA! Hello my dear player. Your life is at stake today. Let`s start your last text quest!");
        this.lifes = (int)(Math.random()*10)%5+1;


    }

    public boolean is_alive(){
        return this.lifes>0;
    }

    @Override
    public void staring() {
        System.out.print("Why are you staring???Stop it");
        this.lifes+=((int)(Math.random()*10)%3);
    }

    @Override
    public void life_so_empty() {
        System.out.println("Life is so empty. Minus lifes for you");
        this.lifes-=((int)(Math.random()*10)%3);
        end_game();
    }

    public void tralala(){
        System.out.println("Tralala green tomatoes");
        this.lifes+=1;
    }

    public void trololo(){
        System.out.println("Trololo first grapes");
        this.lifes-=1;
        end_game();
    }
    private void die(){
        System.out.println("Death is beautiful...");
        this.lifes-=1;
        end_game();
    }

    private void end_game() {
        if (this.lifes<=0){
            System.out.println("No more lifes. You dead...");
        }
    }
}
