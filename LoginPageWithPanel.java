import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPageWithPanel extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginPageWithPanel() {
        // Frame settings
        setTitle("Login Page");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Right Panel with GridLayout (4 rows x 2 cols)
        JPanel rightPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        rightPanel.setBackground(new Color(70, 130, 180)); // Steel Blue
        rightPanel.setBorder(new EmptyBorder(20, 20, 20, 20)); // Padding
        // Components
        JLabel userLabel = new JLabel("Username:");
        userLabel.setForeground(Color.WHITE);
        usernameField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        passLabel.setForeground(Color.WHITE);
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        // Message JLabel (initially empty, yellow text)
        messageLabel = new JLabel("");
        messageLabel.setForeground(Color.YELLOW);

        // Add components to panel
        rightPanel.add(userLabel);
        rightPanel.add(usernameField);
        rightPanel.add(passLabel);
        rightPanel.add(passwordField);
        rightPanel.add(new JLabel("")); // Empty cell
        rightPanel.add(loginButton);
        rightPanel.add(new JLabel("")); // Empty cell
        rightPanel.add(messageLabel);

        // Add panel to frame
        add(rightPanel);

        // ActionListener for login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("1234")) {
                    messageLabel.setText("Login Successful ✅");
                } else {
                    messageLabel.setText("Invalid Username/Password ❌");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginPageWithPanel().setVisible(true);
        });
    }
}
