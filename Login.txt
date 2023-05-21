/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scd;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginForm() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150); // Adjusted frame size for wider text fields
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20); // Set preferred width for the username field
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20); // Set preferred width for the password field

        JButton loginButton = new JButton("Login");

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();

                // Authenticate the user using the DAO
                UserDao userDao = new UserDao();
                if (userDao.authenticate(username, password)) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    // Open the main library management system window or perform any other necessary actions
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
                }

                // Clear the fields
                usernameField.setText("");
                passwordField.setText("");
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginForm();
            }
        });
    }
}

class UserDao {
    private String validUsername = "admin";
    private String validPassword = "admin123";

    public boolean authenticate(String username, char[] password) {
        // Here you can implement your authentication logic
        // This can include checking against a database or any other authentication mechanism

        return username.equals(validUsername) && new String(password).equals(validPassword);
    }
}
