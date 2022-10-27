import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * AboutPage class only shows a couple blocks of texts in order to
 * give information about the game and its creators
 * 
 * @author Minh Nguyen && Henry Ballsack 
 * @version v0.0.4
 */
public class AboutPage extends World
{
    private Label aboutPageTitle1;
    private Label aboutPageTitle2;
    private Label aboutPageDescription1;
    private Label aboutPageDescription2;
    private Label aboutPageDescription3;
    private Label aboutPageDescription4;
    private final Label logoGif  = new Label("logo.gif");
    private final Label keySpace = new Label("key-space.png");
    private final Label keyLeft  = new Label("arrow-key-left.png");
    private final Label keyRight = new Label("arrow-key-right.png");;
    private final Label keyA     = new Label("key-a.png");
    private final Label keyD     = new Label("key-d.png");
    /**
     * Constructor for objects of class AboutPage.
     * 
     */
    public AboutPage()
    {
        super(300,400,1);
        prepare();
    }
    public void act(){if(Greenfoot.isKeyDown("u"))Greenfoot.setWorld(new Menu());}
    private void prepare()
    {
        String strTitle1 = "About Game:";
        String strTitle2 = "Controls:";
        String strDesc = "You're a space invader, and you're trying to run away\n" + 
                          "from a tumor alien that's trying to kill you! Collect     \n" +
                          "powerups and try to survive as long as possible!       ";
        aboutPageTitle1 = new Label(strTitle1, 30);
        aboutPageTitle2 = new Label(strTitle2,30);
        aboutPageDescription1 = new Label(strDesc, 15);
        aboutPageDescription2 = new Label("    hold the space key is to pause the game", 15);
        aboutPageDescription3 = new Label("the left and right keys, along with the \n\"w\" and \"a\" keys are for moving the    \n" +
                                           "player left and right                               ", 15);
        aboutPageDescription4 = new Label("the \"u\" key is to return to the menu      ", 15);
        addObjects();
    }
    public void addObjects()
    {
        //initialize logo and first half of text
        addObject(logoGif, getWidth()/2, getHeight()/16 + 5/2);
        addObject(aboutPageTitle1, getWidth()/2, getHeight()/8 + 30);
        addObject(aboutPageTitle2, getWidth()/2, getHeight()/2);
        addObject(aboutPageDescription1, getWidth()/2, getHeight()/8 + 70);
        //controls for robot and menu access
        addObject(aboutPageDescription2, getWidth()/2, getHeight()/2 + 70);
        addObject(aboutPageDescription3, getWidth()/2, getHeight()/2 + 110);
        addObject(aboutPageDescription4, getWidth()/2, getHeight()/2 + 150);
        //icons for reference
        addObject(keySpace,    2*(getWidth()/10), getHeight()/2 + 40);
        addObject(keyRight,    2*(getWidth()/10 - 15), getHeight()/2 + 70);
        addObject(keyLeft,     2*(getWidth()/10 - 15), getHeight()/2 +100);
        addObject(keyA,        2*(getWidth()/10 - 15), getHeight()/2 +130);
        addObject(keyD,        2*(getWidth()/10 - 15), getHeight()/2 +160);
    }  
}
