import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=10;
    public void act() 
    {
        move(-speed);
        if(isTouching(FlappyBird.class)){
            Viata.pierdeViata();
            getWorld().removeObjects(getWorld().getObjects(Bullet.class));
        }
    }    
}
