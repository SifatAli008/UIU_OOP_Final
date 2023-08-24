package B;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToe extends JFrame {

    public TicTacToe() {

        setLayout(new GridLayout(3, 3));
        JButton[] btn = new JButton[9];

        for (int i = 0; i < 9; i++) {
            btn[i] = new JButton();
            add(btn[i]);
            int index = i;
            btn[i].addActionListener((ActionEvent e) -> {
                if(index%2==0){
                btn[index].setText("X");
                }
                else{
                  btn[index].setText("0");
                }
            });
        }
    }

    public static void main(String[] args) {
        TicTacToe frame = new TicTacToe();
        frame.setVisible(true);
        frame.setTitle("Tic Tac Toe");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
