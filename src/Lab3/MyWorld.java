package Lab3;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ryan.bolt on 12/17/13.
 * This class will create an applet and count the times that paint is called.
 */
public class MyWorld extends Applet
{
    StringBuffer buffer;
    int numTimesPaintCalled; //used to track the number of times paint is called
    public void init()
    {
        numTimesPaintCalled= 0; //initilize the counter
        buffer = new StringBuffer();
        addItem("initializing . . .\n");
    }

    public void start()
    {
        addItem("starting . . .");
    }

    public void stop()
    {
        addItem("stopping . . .");
    }

    public void destroy()
    {
        addItem("death star has been destroyed . . .");
    }

    private void addItem(String newLine)
    {
        System.out.println(newLine);
        buffer.append(newLine);
        repaint();
    }

    public void paint(Graphics g)
    {
        numTimesPaintCalled++;//add 1 to the number of times called
        g.drawRect(0,0,getWidth()-1,getHeight()-1);
        g.drawString(buffer.toString(),5,15);
        g.drawString("Paint has been called: " + numTimesPaintCalled,5,25); //print out the number of times called
    }






}
