import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main extends JFrame {

    static double totalSales = 0.0;
   
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        JLabel Jl = new JLabel("Enter Sales:");
        Jl.setBounds(10, 10, 70, 30);
        frame.add(Jl);

        JTextField JTF = new JTextField();
        JTF.setBounds(90, 10, 200, 30);
        frame.add(JTF);

        JButton btn = new JButton("Record");
        btn.setBounds(310, 10, 100, 30);
        frame.add(btn);

        JLabel totalLabel = new JLabel();
        totalLabel.setBounds(10, 50, 400, 30);
        frame.add(totalLabel);

        frame.setSize(450, 200);
        frame.setTitle("Sales Record");

        btn.addActionListener((ActionEvent e) -> {
            try {
                  String num = JTF.getText();
                double sale = Double.parseDouble(num);
                totalSales = totalSales + sale;
                totalLabel.setText("Total Sales: " + totalSales); 
                JTF.setText("");
                frame.add(totalLabel);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid number for sale");
            }
        });
    }
}
