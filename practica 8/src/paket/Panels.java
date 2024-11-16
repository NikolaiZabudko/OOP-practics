package paket;
import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Две панели");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Первая панель");
        label1.setFont(label1.getFont().deriveFont(72f));
        label1.setForeground(Color.RED);
        panel1.add(label1);

        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Вторая панель");
        label2.setFont(label2.getFont().deriveFont(24f));
        label2.setForeground(Color.BLACK);
        panel2.add(label2);

        frame.getContentPane().setLayout(new java.awt.GridLayout(2, 1));
        frame.add(panel1);
        frame.add(panel2);

        frame.setVisible(true);
    }
}