import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double dy = 0;
    private final double gravity = 1.3;
    private final int boost = 4;
    private final GreenfootImage[] images = {
        new GreenfootImage("flappybird1.png"),
        new GreenfootImage("flappybird2.png"),
        new GreenfootImage("flappybird3.png")
    }; 
    private int imageNumber = 1;
    public void act() 
    {
       if(getOneIntersectingObject(TopPipe.class)!=null ||
       getOneIntersectingObject(BottomPipe.class)!=null){
        World world = getWorld();
        world.addObject(new GameOver(), world.getWidth()/2,world.getHeight()/2);
        //Greenfoot.playSound("game.wav");
        Greenfoot.stop();
        }
       setLocation(getX(),(int)(getY()+dy));
      dy += gravity;
       if(Greenfoot.isKeyDown("space")){
           dy -= boost;
        }
        setImage(images[imageNumber]);
        imageNumber=(imageNumber+1)%3;

        if(getY()> getWorld().getHeight()||getY()<0){
        World world=getWorld();
        world.addObject(new GameOver(), world.getWidth()/2,world.getHeight()/2);
        //Greenfoot.playSound("game.wav");
        Greenfoot.stop();
        }

        if(dy<-10){
        setRotation(-30);
        }
        else{
            if(dy>10) {setRotation(30);}
            else{setRotation((int)(dy*3));}

        }
        shoot();
    }
    public int getLeftX(){
        int x = getX() - getImage().getWidth() / 2;
        return x;
    }
    int fireRate =16;
    void shoot(){
        
        if(Greenfoot.isKeyDown("z")){
            fireRate--;
            if(fireRate==0){
                Laser laser = new Laser();
                World world = getWorld();
                world.addObject(laser, getX(), getY());
                fireRate=16;
            }
        }
    }
}
