package practicejavaprograms;

import javax.swing.*;//import JFrame
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class GUI extends JFrame{
    private JList leftList;
    private JList rightList;
    private JButton moveButton;
    private static String[] food = {"bacon", "wings", "ham", "beef", "more"};


    public GUI() {
        super("List And Button");
        setLayout(new FlowLayout());

        leftList = new JList(food);
        leftList.setVisibleRowCount(4);
        leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftList));//adding left list into scroll bar

        moveButton = new JButton("Move-->");
        moveButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                       rightList.setListData(leftList.getSelectedValues());
                    }
                }
        );


        add(moveButton);

        rightList = new JList();
        rightList.setVisibleRowCount(4);
        rightList.setFixedCellWidth(80);
        rightList.setFixedCellHeight(20);

        rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightList));

    }


}
