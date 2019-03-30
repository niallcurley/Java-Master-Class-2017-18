package practicejavaprograms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class GUI extends JFrame {

    private JList list;
    //array list of colours names that we can recognise
    private static String [] colourNames = {"black", "blue", "red", "white"};
    //array list of colour that the system can understand
    private static Color [] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};


    public GUI (){
        super("Different Colours For BackGround");
        setLayout(new FlowLayout());

        list = new JList(colourNames);
        list.setVisibleRowCount(4);

        //ONLY SELECT ONE AT A TIME
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));

        list.addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent event) {
                        getContentPane().setBackground(colors[list.getSelectedIndex()]);
                    }
                }
        );

    }
}
