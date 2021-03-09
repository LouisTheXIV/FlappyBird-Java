import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndLevel extends World
{
    FlappyBird flappy;
    Mario boss;
    public EndLevel()
    {    
        super(600, 400, 1); 
        flappy = new FlappyBird();
        addObject(flappy, 100, getHeight()/2);
        addObject(new Viata(),50,20);
        addObject(new Viata(),80,20);
        addObject(new Viata(),110,20);
        boss=new Mario();
        addObject(boss, getWidth()*3/4, getHeight()/2);
    }
    public void lose(){
    int viata = Viata.getInima();
    if(viata==2) removeObjects(getObjectsAt(110,20,Viata.class));
    if(viata==1) removeObjects(getObjectsAt(80,20,Viata.class));
    if(viata==0){ removeObjects(getObjectsAt(50,20,Viata.class));
    addObject(new GameOver(),getWidth()/2,getHeight()/2);
    Greenfoot.stop();
}
    }
    public void act(){
    lose();
    }
}
