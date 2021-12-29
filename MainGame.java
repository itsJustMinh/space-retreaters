import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Main game world for Space Retreaters;
 * world where you actually play the game
 * 
 * @author Minh Nguyen, Henry Ballweg
 * @version v0.0.4
 */
public class MainGame extends World
{
    public static int count; //game time
    private boolean isPaused;
    private final GifImage background = new GifImage("bg.gif"); //background gif of image
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public MainGame()
    {    
        super(300, 400, 1);
        prepare();
    }
    public void act()
    {
        count++;
        setBackground(background.getCurrentImage()); //animates background gif
        //shows player score
        String str = "Score: " + count/2;
        showText(str , 60, 15);
        spawnPowerups();
        switchToStart();      
    }
    /**
     * Spawns either LifeUp powerup or Invincibility powerup
     */
    public void spawnPowerups()
    {
        int randomX = Greenfoot.getRandomNumber(getWidth() + 1);
        int choice = Greenfoot.getRandomNumber(2);
        if(count % 200 == 0)
        {
            if(choice == 0)
            {
                    addObject(new Shield(), randomX, 0);
            }
            if(choice == 1)
            {
                if(LifeUp.isOnScreen() == false)
                    addObject(new LifeUp(), randomX, 0);
            }
        }
    }
    /**
     * sets world to Menu()
     * 
     */
    public void switchToStart(){if(Greenfoot.isKeyDown("u"))Greenfoot.setWorld(new Menu());}
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        count = 0;
        isPaused = false;
        setBackground(background.getCurrentImage());
        addObject(new Player(), getWidth()/2, getHeight()/2);
        addObject(new TumorEnemy(), getWidth()/3, 3 * (getHeight()/4));
    }
}
