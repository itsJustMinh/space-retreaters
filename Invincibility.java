import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Invinicibility here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Invincibility extends Powerup
{
    /**
     * Act - do whatever the Invinicibility wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fall();
        checkIfDie();
    }    
    public void activiate(){Player.changeInvincibility();}
}
