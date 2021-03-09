

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    static int score = 0;
    public Score(){
        setImage(new GreenfootImage("Score: 0", 15, Color.BLACK, null));
    }
    
    public static void increaseScore(){
        score ++;
    }
    
    public void act() 
    {
        setImage(new GreenfootImage("Scor: " + score, 15, Color.BLACK, null));
        if(score==10){
        Greenfoot.setWorld(new EndLevel());
        }
    }   
    
    public static void resetScore(){
        score = 0;
    }
}
