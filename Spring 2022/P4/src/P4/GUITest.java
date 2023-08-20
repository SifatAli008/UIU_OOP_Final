package P4;

import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUITest {
   private Container c;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swapping App");
        frame.setSize(275, 120);
        frame.setLayout(null);
       

        JTextField tf1 = new JTextField(10);
        tf1.setBounds(40,10,80,30);
        frame.add(tf1);
        
        JTextField tf2 = new JTextField(10);
        tf2.setBounds(150,10,80,30);
        frame.add(tf2);
        
        JButton btn = new JButton("Swap");
        btn.setBounds(80,45,80,30);
          frame.add(btn);
          
           
         btn.addActionListener((ActionEvent e)->{
         String str1 =  tf1.getText();
         String str2 =  tf2.getText();
         
          tf1.setText(str2);
          tf2.setText(str1);
         });
    }
}
