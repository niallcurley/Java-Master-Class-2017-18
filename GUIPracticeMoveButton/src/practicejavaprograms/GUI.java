package practicejavaprograms;

import javax.swing.*;//import JFrame
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class GUI extends JFrame{

private JButton button;

    public GUI(){
        super("Practicing Buttons");
        setLayout(new FlowLayout());

        button = new JButton("My Button");
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        button.a
                    }
                }
        );
    }




}//end of class
