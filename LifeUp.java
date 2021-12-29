import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeUp here.
 * 
 * @author Henry Ballsack
 * @version v0.0.8
 */
public class LifeUp extends Powerup
{
    private final GreenfootImage lifeupIcon = new GreenfootImage("life-up.png");
    public LifeUp(){setImage(lifeupIcon);}
    /**
     * Act - do whatever the LifeUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fall();
        checkIfDie();
    }
    public void activate(){getWorld().getObjects(Player.class).get(0).lifePlus();}
}
