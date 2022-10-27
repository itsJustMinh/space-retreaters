import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerProjectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerProjectile extends Projectile
{
    /**
     * Act - do whatever the PlayerProjectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GifImage spriteImage;
    public PlayerProjectile(){spriteImage = new GifImage("player-blast.gif");}
    public void act() 
    {
        setImage(spriteImage.getCurrentImage());
        setLocation(getX(),getY()+3);
        //killEnemy();
    } 
    /*
    public void killEnemy()
    {
        if(isTouching(TumorEnemy.class))
        {
            getWorld().getObjects(TumorEnemy.class).get(0)
            .setLives(getWorld().getObjects
            (TumorEnemy.class).get(0).getLives()-1);
        }
        else if(getY() >= getWorld().getHeight() - 6)
            getWorld().removeObject(this);
    }
    */
}
