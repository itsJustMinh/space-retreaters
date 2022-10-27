import greenfoot.*;

public class Player extends Actor
{
    private GifImage defaultPlayerGif;
    private GifImage die;
    private static int timer;
    private static int lives;
    private static boolean isInvincible;
    private final int playerWidth = 30;
    private final int playerHeight = 21;
    public Player()
    {
        defaultPlayerGif = new GifImage("player.gif");
        die = new GifImage("boom.gif");
        lives = 10;
        timer = 10;
        isInvincible = false;
    }
    public void act() 
    {
        setImage(defaultPlayerGif.getCurrentImage());
        showLives();
        move();
        checkIfDie();
    }
    private void move()
    {
        if(getX() >= 15 && (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))) 
            setLocation(getX() - 2, getY());
        if(getX() <= getWorld().getWidth() - 15 && (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")))
            setLocation(getX() + 2, getY());
    }
    private void checkIfDie()
    {
        if(isTouching(Projectile.class))
        {
            removeTouching(Projectile.class);
            lives--;
        }
        else if(lives == 0)
        {
            for(int i = 0; i < 8; i++)
            {
                setImage(die.getCurrentImage());
                Greenfoot.delay(2);
            }
            Greenfoot.setWorld(new Menu());
            getWorld().removeObject(this);
        }
    }
    public static void setLives(int num){lives = num;}
    public static int  getLives(){return lives;}
    public void lifePlus(){if(lives < 10)lives++;}
    public void showLives(){getWorld().showText("Player Lives: " + lives, getWorld().getWidth()-85,15);}
    public int getHeight(){return playerHeight;}
    public static void changeInvincibility(){isInvincible = !isInvincible;}
}
