import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BottomPipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BottomPipe extends Actor
{
    /**
     * Act - do whatever the BottomPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() - 4, getY());
        
        if(getX() < 0 - getImage().getWidth()){
             World world = getWorld();
             world.removeObject(this);
        }
    }  
    
     public int getRightX(){
        int x = getX() + getImage().getWidth() / 2;
        return x;
    }
}
