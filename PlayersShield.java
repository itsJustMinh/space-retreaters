import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerShield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayersShield extends Actor
{
    private int life;
    private int playerX;
    private int playerY;
    public static boolean alreadyExists;
    private  GreenfootImage shieldIcon = new GreenfootImage("player-shield.png");
    public PlayersShield()
    {
        life = 1;
        shieldIcon.scale(32,11);
        setImage(shieldIcon);
    }
    /**
     * Act - do whatever the PlayerShield wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        playerX = getWorld().getObjects(Player.class).get(0).getX();
        playerY = getWorld().getObjects(Player.class).get(0).getY();
        setLocation(playerX,playerY+21); 
        checkIfDie();
    }    
    public void checkIfDie()
    {
        if(isTouching(Projectile.class))
        {
            removeTouching(Projectile.class);
            life--;
        }
        if(life == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
