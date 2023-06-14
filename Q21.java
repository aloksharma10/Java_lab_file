import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q21 {
    private JFrame frame;
    private JLabel nameLabel;
    private JTextField nameField;
    private JButton submitButton;
    private JCheckBox checkBox;
    private JComboBox<String> comboBox;

    public Q21() {
        createGUI();
    }

    private void createGUI() {
        // Create and configure the frame
        frame = new JFrame("Swing Controls Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Create and configure the name label
        nameLabel = new JLabel("Name:");
        frame.add(nameLabel);

        // Create and configure the name text field
        nameField = new JTextField(15);
        frame.add(nameField);

        // Create and configure the submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
            }
        });
        frame.add(submitButton);

        // Create and configure the check box
        checkBox = new JCheckBox("Agree to terms");
        frame.add(checkBox);

        // Create and configure the combo box
        String[] options = {"Option 1", "Option 2", "Option 3"};
        comboBox = new JComboBox<>(options);
        frame.add(comboBox);

        // Display the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Q21 demo = new Q21();
    }
}
