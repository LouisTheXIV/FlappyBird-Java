import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

public class FlappyWorld extends World
{
    FlappyBird flappy;
    private final int pipeDistance = 100;
    private int pipeTime = 0;
    private ArrayList<BottomPipe> pipes;
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        setPaintOrder(BottomPipe.class, TopPipe.class, 
        FlappyBird.class, GameOver.class, Score.class);
        pipes = new ArrayList<BottomPipe>();
        flappy = new FlappyBird();
        addObject(flappy, 100, getHeight()/2);
        showPipes();
        addObject(new Score(), 50, 50);
        Score.resetScore();
    }
    
    public void act(){
        pipeTime ++;
        if(pipeTime == 100){
            pipeTime = 0;
            showPipes();
        }
        if(pipes.get(0).getRightX() < flappy.getLeftX()){
            Score.increaseScore();
            pipes.remove(0);
        }
    }
    
    public void showPipes(){
        BottomPipe pipe1 = new BottomPipe();
        pipes.add(pipe1);
        TopPipe pipe2 = new TopPipe();
        int y = getHeight() - pipe1.getImage().getHeight() - pipeDistance;
        addObject(pipe1, getWidth(), getHeight());
        addObject(pipe2, getWidth(), y);
    }
}
