import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Basic Powerup Template Class
 * 
 * @author Minh & Henry Ballsack
 * @version v0.0.7
 */
public class Powerup extends Actor
{
    private static boolean isStillHere;
    private final GreenfootSound activate = new GreenfootSound("powah-uppu.mp3");
    public Powerup(){isStillHere = true;}
    public void act() 
    {
        fall();
        checkIfDie();
    }
    /**
     * Method makes powerup fall down the screen.
     */
    public void fall(){setLocation(getX(),getY()+3);}
    /**
     * Kills itself if it touches player or the bottom of screen.
     */
    public void checkIfDie()
    {
        if(isTouching(Player.class))
        {
            activate.play();
            activate();
            isStillHere = false;
            getWorld().removeObject(this);
        }
        else if(getY() >= getWorld().getHeight() - 6)
        {
            isStillHere = false;
            getWorld().removeObject(this);
        }
    }
    public static boolean isOnScreen(){return isStillHere;}
    /**
     * blank method because it will be implemented in the other powerups
     */
    public void activate(){}
}
