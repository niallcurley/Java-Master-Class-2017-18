package practicejavaprograms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChooseColour extends JFrame{

    private JButton b;
    private Color color = (Color.WHITE);
    private JPanel panel;

    public ChooseColour (){
        super("Display Different Colours");
        panel = new JPanel();
        panel.setBackground(color);

        b = new JButton("Choose a color");//creates a button with script
        b.addActionListener(//determines what happens when button clicked
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        color = JColorChooser.showDialog(null, "What Colour?", color);
                        //shows ColorChooser for user to - appears in centre -

                        if(color==null)//validation for choice
                            color=(Color.WHITE);//color remains WHITE if nothing is chosen

                        panel.setBackground(color);//color chosen
                    }
                }
        );

        add(panel, BorderLayout.CENTER);//panel will be centre
        add(b,BorderLayout.SOUTH);//will make the button appear at bottom
        setSize(424, 150);
        setVisible(true);

    }

}
