/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Square floor;
    private Person guyR;
    private Person guyL;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        floor = new Square();
        floor.changeColor("green");
        floor.moveHorizontal(-320);
        floor.moveVertical(130);
        floor.changeSize(1000);
        floor.makeVisible();
        
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(120);
        sun.moveVertical(-100);
        sun.changeSize(80);
        sun.makeVisible();
        sun.slowMoveVertical(400);
        
        moon = new Circle();
        moon.makeVisible();
        moon.moveHorizontal(-150);
        moon.changeColor("magenta");
        moon.changeSize(40);
    }
    
    public void amanecer()
    {
        moon.makeInvisible();
        sun.slowMoveVertical(-400);
        
        guyR = new Person();
        guyR.moveVertical(20);
        guyR.moveHorizontal(195);
        guyR.makeVisible();
        guyR.slowMoveHorizontal(-165);
        
        guyL = new Person();
        guyL.moveVertical(20);
        guyL.moveHorizontal(-240);
        guyL.makeVisible();
        guyL.slowMoveHorizontal(100);
        
        
        
        
    }
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
