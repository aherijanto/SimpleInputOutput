import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener extends Frame implements KeyListener {

    Label l;
    TextArea area;

        // class constructor
    KeyboardListener() {
            // creating the label
        l = new Label();

            // setting the location of label
        l.setBounds (20, 50, 200, 20);

            // creating the text area
        area = new TextArea();

        // setting location of text area
        area.setBounds (20, 80, 300, 300);

        // adding KeyListener to the text area
        area.addKeyListener(this);

        // adding label and text area to frame
        add(l);
        add(area);

        // setting size, layout and visibility of frame
        setSize (400, 400);
        setLayout (null);
        setVisible (true);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        String text = area.getText();

        // splitting the string in words
        String words[] = text.split ("\\s");

        // printing the number of words and characters of the string
        l.setText ("Words: " + words.length + " Characters:" + text.length());
    }

    public static void main(String[] args) {
        new KeyboardListener();
    }
}
