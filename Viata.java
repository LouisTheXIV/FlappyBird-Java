import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Viata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Viata extends Actor
{
    /**
     * Act - do whatever the Viata wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int viata=3;
    public Viata(){
    viata=3;
    }
    public void act() 
    {
        
    }    
    public static void pierdeViata(){
    viata--;
    }
    public static int getInima(){
    return viata;
    }
}
