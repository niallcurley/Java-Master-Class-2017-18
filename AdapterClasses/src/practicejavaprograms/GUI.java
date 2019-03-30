package practicejavaprograms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI extends JFrame {

    private String details;
    private JLabel statusbar;

    public GUI() {
        super("This title");

        statusbar = new JLabel("Default");
        add(statusbar, BorderLayout.SOUTH);
        addMouseListener(new Mouseclass());
    }

    //mouseAdapter class allows you to overide one method
    private class Mouseclass extends MouseAdapter {
        public void mouseClicked(MouseEvent event) {
            details = String.format("You clicked %d", event.getClickCount());

            if (event.isMetaDown())
            details += "with right mouse buttom";
            else if(event.isAltDown())
                details += "with center mouse button";
            else
                details += "with left nouse button";

            statusbar.setText(details);
        }
    }



}
