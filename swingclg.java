import javax.swing.*;
import java.awt.*;

class SwingClg {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Page");
        frame.setSize(900, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 2));

        // Left panel with background image
        JPanel leftPanel = new JPanel() {
            // NOTE: Make sure the path to your image is correct, or place the image in the project directory
            Image img = new ImageIcon("D:\\javaass\\collage project\\logo.jpeg").getImage(); 

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Right panel with login form
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(new Color(70, 130, 180)); // Steel Blue
        rightPanel.setLayout(new GridLayout(4, 2, 15, 15)); // 4 rows, 2 columns, with gaps
        rightPanel.setBorder(BorderFactory.createEmptyBorder(40, 50, 40, 50)); // Padding

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JLabel msg = new JLabel("", SwingConstants.CENTER); // Message label

        // Style labels and button
        userLabel.setForeground(Color.WHITE);
        passLabel.setForeground(Color.WHITE);

        // Make the message label smaller and compact
        msg.setFont(new Font("Arial", Font.PLAIN, 10)); // Smaller font size
        msg.setForeground(Color.YELLOW);
        msg.setPreferredSize(new Dimension(150, 20)); // Compact preferred size

        loginButton.setBackground(Color.WHITE);
        loginButton.setForeground(new Color(70, 130, 180)); // Steel Blue text
        loginButton.setFont(new Font("Arial", Font.BOLD, 12)); // Slightly smaller font for button
        
        // Ensure the button doesn't take up too much space by setting its preferred size
        loginButton.setPreferredSize(new Dimension(80, 25)); // Compact button size

        // Add components to right panel
        rightPanel.add(userLabel);
        rightPanel.add(userField);
        rightPanel.add(passLabel);
        rightPanel.add(passwordField);
        rightPanel.add(new JLabel("")); // Empty label for spacing
        rightPanel.add(loginButton);
        rightPanel.add(new JLabel("")); // Empty label for spacing
        rightPanel.add(msg);

        // Login button action
        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passwordField.getPassword());
            if (username.equals("tejaswi") && password.equals("1234")) {
                msg.setText("Login Successful!");
                msg.setForeground(Color.GREEN);
            } else {
                msg.setText("Invalid Username/Password");
                msg.setForeground(Color.RED);
            }
        });

        frame.add(leftPanel);
        frame.add(rightPanel);
        frame.setVisible(true);
    }
}