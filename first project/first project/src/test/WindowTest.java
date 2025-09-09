import javax.swing.JFrame;

public class WindowTest {


    public static void main(String[] args) {
        // Create a new JFrame object
        JFrame frame = new JFrame("My First Java Window");

        // Set the size of the window
        frame.setSize(1920, 1080);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        frame.setVisible(true);
    }
}

