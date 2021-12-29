import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//temp image for projectile
public class Projectile extends Actor
{
    private GifImage spriteImage;
    public Projectile(){spriteImage = new GifImage("blast.gif");}
    public void act() 
    {
        setImage(spriteImage.getCurrentImage());
        setLocation(getX(), getY() - 3);
        checkIfDie();
    }
    //method could call death animation instead of outright deleting player sprite
    public void checkIfDie()
    {
        if(getY() <= 6)
            getWorld().removeObject(this);
    }
}
