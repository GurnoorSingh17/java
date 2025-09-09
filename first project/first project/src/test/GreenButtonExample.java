import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GreenButtonExample {
    public static void main(String[] args) {
        // Create a new window (frame)
        JFrame frame = new JFrame("Button Color Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new FlowLayout()); // Simple layout

        // Create a button
        JButton button = new JButton("Press Me");

        // Add an ActionListener to detect clicks
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Change button color to green when clicked
                button.setBackground(Color.RED);
            }
        });

        // Add button to the window
        frame.add(button);
        JButton button2 = new JButton("Press Me");

        // Add an ActionListener to detect clicks
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Change button color to green when clicked
                button2.setBackground(Color.GRAY);
            }
        });

        // Add button to the window
        frame.add(button2);

        // Make the window visible
        frame.setVisible(true);
    }
}