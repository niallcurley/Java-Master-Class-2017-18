package practicejavaprograms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layout extends JFrame{

    private JButton lb;
    private JButton cb;
    private JButton rb;
    private FlowLayout flowLayout;
    private Container container;

    public Layout (){
        super("Three button Gui");
        flowLayout = new FlowLayout ();//the layouts buttons will flow from left to right
        container = getContentPane();
        setLayout(flowLayout);

        //left button info
        lb = new JButton("Left");
        add(lb);//adds button on screen
        lb.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        flowLayout.setAlignment(FlowLayout.LEFT);//pulls button to leftside of screen
                        flowLayout.layoutContainer(container);

                    }
                }

        );

        //centre button info

        cb = new JButton("Centre");
        add(cb);//adds button on screen
        cb.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        flowLayout.setAlignment(FlowLayout.CENTER);//pulls button to leftside of screen
                        flowLayout.layoutContainer(container);

                    }
                }

        );


        //right button infor

        rb = new JButton("Right");
        add(rb);//adds button on screen
        rb.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        flowLayout.setAlignment(FlowLayout.RIGHT);//pulls button to leftside of screen
                        flowLayout.layoutContainer(container);

                    }
                }

        );

    }


}
