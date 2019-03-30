package practicejavaprograms;

import jdk.internal.org.objectweb.asm.Handle;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;//this imports JFrame

//adding checkboxes to your GUI - bold and italics
//one check box and

public class GUI extends JFrame{


    //3 variables
    private JTextField tf;//this will hold text
    private JCheckBox boldbox;//checkbox
    private JCheckBox italicbox;// checkbox

    public GUI (){
        super("Practice Checkboxes");
        setLayout(new FlowLayout());//give you a default layout

        //creating a textfild with its size with the tf variable
        tf = new JTextField("This is a peice of text for practice",20 );
        //set a font for the textfield
        tf.setFont(new Font("Serif", Font.PLAIN, 14));
        add(tf);//once you create tf and its font you add it


        //add checkboxes
        boldbox = new JCheckBox("bold");
        italicbox = new JCheckBox("italic");
        add(boldbox);
        add(italicbox);



        //we need to get the text and checkboxes the ability to do something
        //so we need to create a handler class
        HandlerClass handlerClass = new HandlerClass();
        //add itemListener which is waiting on something happening like a click
        boldbox.addItemListener(handlerClass);
        italicbox.addItemListener(handlerClass);



    }

    private class HandlerClass implements ItemListener{

        public void itemStateChanged (ItemEvent event){
            Font font = null;

            if(boldbox.isSelected() && italicbox.isSelected())//if both selected
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (boldbox.isSelected())
                font = new Font("Serif", Font.BOLD, 14);
            else if (italicbox.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            else

                //if nothing is chosen
                font = new Font ("Serif", Font.PLAIN, 14);

            tf.setFont(font);//font must be set to whatever is chosen or not chosen

        }



    }


}
