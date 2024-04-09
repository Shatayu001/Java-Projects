//new year code

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyHoverButton {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Difficulty level hard");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout()); // Use GridBagLayout for precise button placement
        
        JButton loveButton = new JButton("2023 + 1 = ");
        loveButton.setPreferredSize(new Dimension(180, 40));
        
        JButton button1 = new JButton(" 2024 ");
        button1.setPreferredSize(new Dimension(100, 40));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                int newX = (int) (Math.random() * (frame.getWidth() - button1.getWidth()));
                int newY = (int) (Math.random() * (frame.getHeight() - button1.getHeight()));
                button1.setLocation(newX, newY);
            }
        });
        
        JButton button2 = new JButton(" ? ");
        button2.setPreferredSize(new Dimension(100, 40));
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Happy New year!! 🕺🥳");
            }
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0); // Add some padding
        frame.add(loveButton, gbc);
        gbc.gridy = 1;
        frame.add(button2, gbc);
        gbc.gridy = 2;
        frame.add(button1, gbc);
        frame.setVisible(true);
    }
}
