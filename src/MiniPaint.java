import java.awt.*;
import java.awt.event.MouseMotionAdapter;

public class MiniPaint extends MouseMotionAdapter {
    Frame f;

    MiniPaint(){ //Constructor
        // creating the frame with the title
        f = new Frame("Mouse Motion Adapter");

        // adding MouseMotionListener to the Frame
        f.addMouseMotionListener (this);

        // setting the size, layout and visibility of the frame
        f.setSize (300, 300);
        f.setLayout (null);
        f.setVisible (true);
    }

}
