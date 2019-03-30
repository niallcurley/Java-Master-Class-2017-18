package practicejavaprograms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {

    private JComboBox box;//the combo box
    private JLabel picture;//the image

    //array for files
    private static String [] filename = {"man-utd.png", "raywilkins.png"};
    //array of images using Icon class for images
    private Icon [] pics = {new ImageIcon(getClass().getResource(filename[0]))
            ,new ImageIcon(getClass().getResource(filename[1]))};

    public GUI (){//constructor built without parametres
        super("The best drop menu");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);//new box created and parameter filename

        //add item listener
        box.addItemListener(//add anonomous class
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent event) {
                        if(event.getStateChange()==ItemEvent.SELECTED)
                            picture.setIcon(pics[box.getSelectedIndex()]);
                    }
                }



        );


        add(box);
        picture=new JLabel(pics[1]);
        add(picture);
    }


}
