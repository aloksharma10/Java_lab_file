import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Q15 extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;

    public Q15() {
        // Create the button and label
        button = new JButton("Click Me!");
        label = new JLabel("No button click yet");

        // Set up the frame
        setTitle("Event Handling Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Add the button and label to the frame
        add(button);
        add(label);

        // Register the button with the ActionListener
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle the button click event
        if (e.getSource() == button) {
            label.setText("Button clicked!");
        }
    }

    public static void main(String[] args) {
        Q15 frame = new Q15();
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}
