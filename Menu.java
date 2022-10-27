import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Menu of Space Retreaters
 * 
 * @author Minh Nguyen
 * @version v0.0.4
 */
public class Menu extends World
{
    private final Label logoGif = new Label("logo-big.gif"); ;
    private final Label startButton = new Label("start-up.png"); 
    private final Label aboutPageButton = new Label("about.png"); 
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {
        super(300, 400, 1);
        prepare();
    }
    public void act()
    {
        if(startButton.isClicked())
            Greenfoot.setWorld(new MainGame());
        if(aboutPageButton.isClicked())
            Greenfoot.setWorld(new AboutPage());
    }
    
    private void prepare()
    {
        addObject(logoGif, getWidth()/2, getHeight()/8 + 5);
        addObject(startButton, getWidth()/2, getHeight()/2);
        addObject(aboutPageButton, getWidth()/2, getHeight()/2 + 50);
    }
}
