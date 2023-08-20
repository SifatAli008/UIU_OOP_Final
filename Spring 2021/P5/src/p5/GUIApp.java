package p5;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIApp {

    public GUIApp() {
        JFrame frame = new JFrame("MyApplication");
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());
        
        JButton upButton = new JButton();
        upButton.setText("UP");
        upButton.setBounds(0, 0, 400, 40);
        frame.add(upButton);
        
        JLabel middleLabel = new JLabel();
        middleLabel.setText("A JLabel object can display either text,  an image, or both. ");
        frame.add(middleLabel);
        
       JTextField downTextField = new JTextField();
     

    }

    public static void main(String[] args) {
        new GUIApp();

    }
}
