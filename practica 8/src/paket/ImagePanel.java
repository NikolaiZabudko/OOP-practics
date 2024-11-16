package paket;

import javax.swing.*;
import java.awt.*;

public class ImagePanel {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Изображения на панели");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel imagePanel = new JPanel();

        ImageIcon image1 = new ImageIcon("C:\\Users\\Yo Pi'erre\\Pictures\\scr\\photo_2024-09-23_21-25-59.jpg");
        JLabel label1 = new JLabel(image1);
        label1.setText("Изображение 1");
        label1.setForeground(Color.BLACK);
        label1.setHorizontalTextPosition(JLabel.CENTER);

        ImageIcon image2 = new ImageIcon("C:\\Users\\Yo Pi'erre\\Pictures\\scr\\irop.jpg");
        JLabel label2 = new JLabel(image2);
        label2.setText("Изображение 2");
        label2.setForeground(Color.WHITE);
        label2.setHorizontalTextPosition(JLabel.CENTER);

        imagePanel.add(label1);
        imagePanel.add(label2);

        frame.add(imagePanel);

        frame.setVisible(true);
    }
}