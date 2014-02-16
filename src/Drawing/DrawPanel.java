package Drawing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ryanbolt on 2/16/2014.
 */
public class DrawPanel extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.drawLine(0,0,width,height);
        g.drawLine(0,height,width,0);

    }
}
