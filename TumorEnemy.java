import greenfoot.*;

public class TumorEnemy extends Actor
{
    private GifImage tumorGif;
    private final int spriteWidth  = 48;
    private final int spriteHeight = 21;
    private boolean left;
    private boolean right;
    public TumorEnemy()
    {
        tumorGif = new GifImage("enemy-tumor.gif");
        left  = true;
        right = true;
    }
    public void act() 
    {
        setImage(tumorGif.getCurrentImage());
        if(MainGame.count % 20 == 0)    
            moveChoice();
        move();
        shoot();
    }    
    private void moveChoice() 
    {
        int choice = Greenfoot.getRandomNumber(2);
        if(choice == 1)
        {
            left  = true;
            right = false;
        }
        else
        {
            left  = false;
            right = true;
        }
    }
    private void move()
    {
        if(left && getX() > spriteWidth)
            setLocation(getX() - 3, getY());
        else if(right && getX() < getWorld().getWidth()- spriteWidth)
            setLocation(getX() + 3, getY());
    }
    private void shoot()
    {
        if(Greenfoot.getRandomNumber(100) == 1)
            getWorld().addObject(new Projectile(), this.getX(), getY() - spriteHeight/2);
    }
}
