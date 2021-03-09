import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mario extends Actor
{
    /**
     * Act - do whatever the Mario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=5;
    public void act() 
    {
        move();
        shoot();
    }    
    void move(){
    setLocation(getX(), getY()-speed);
    if(getY()==40){
    setLocation(getX(),400);
    }
    }
    int fireRate=16;
    void shoot(){
            fireRate--;
            if(fireRate==0){
                Bullet laser = new Bullet();
                World world = getWorld();
                world.addObject(laser, getX(), getY());
                fireRate=16;
            }
    }
}
