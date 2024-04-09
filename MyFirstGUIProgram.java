//created my first simple window with a button using Swing

import javax.swing.*;
public class MyFirstGUIProgram {

    public static void main(String[] args) {
        // Creating a JFrame (a window)
        JFrame frame = new JFrame("My First GUI Program");
        frame.setSize(500, 500); // Setting the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close when the window is closed
        frame.setLocationRelativeTo(null); // Center the window
        // Creating a JButton
        JButton button = new JButton("Click Me!");
        button.setBounds(100, 50, 100, 40); // Setting button's position and size
        
        // Adding the button to the frame
        frame.add(button);
        
        // Setting the frame layout and making it visible
        frame.setLayout(null);
        frame.setVisible(true);
    }
}