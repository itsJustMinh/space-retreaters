import greenfoot.*;
public class Label extends Actor
{
    private GifImage gif;
    private GreenfootImage label;
    public Label(String text, int size)
    {
        Color color = Color.WHITE;
        Color bgColor = new Color(0, 0, 0, 0); //clear background color
        label = new GreenfootImage(text, size, color, bgColor);
        setImage(label);
    }
    public Label(String img)
    {
        try{gif = new GifImage(img);}
        catch(Exception e){label = new GreenfootImage(img);}
    }
    public void act()
    {
        try{setImage(gif.getCurrentImage());}
        catch(Exception e){}
    }
    public boolean isClicked(){return Greenfoot.mouseClicked(this);}
    public boolean isPressed(){return Greenfoot.mousePressed(this);}
}