import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Invinicibility here.
 * 
 * @author Minh Ngyuyen, Henry Ballweg 
 * @version v.0.1.0
 */
public class Shield extends Powerup
{
    private static boolean hasCollided;
    private final GreenfootImage invincibilityIcon = new GreenfootImage("shield.png");
    public Shield(){hasCollided = false; setImage(invincibilityIcon);}
    /**
     * Act - do whatever the Invinicibility wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fall();
        checkIfDie();
    }    
    public void activate(){
         getWorld().addObject(new PlayersShield(),
                                  getWorld().getObjects(Player.class).get(0).getX(),
                                  getWorld().getObjects(Player.class).get(0).getY());
    }
    public static boolean collided(){return hasCollided;}
}
