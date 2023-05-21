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

public class AdminForm extends JFrame {
    private JButton viewBooksButton;
    private JButton viewUsersButton;
    private JButton viewIssuedBooksButton;
    private JButton issueBookButton;
    private JButton addUserButton;
    private JButton addBookButton;
    private JButton returnBookButton;
    private JButton createResetButton;

    public AdminForm() {
        setTitle("Admin ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        viewBooksButton = new JButton("View Books");
        viewUsersButton = new JButton("View Users");
        viewIssuedBooksButton = new JButton("View Issued Books");
        issueBookButton = new JButton("Issue Book");
        addUserButton = new JButton("Add User");
        addBookButton = new JButton("Add Book");
        returnBookButton = new JButton("Return Book");
        createResetButton = new JButton("Create/Reset");

        panel.add(viewBooksButton);
        panel.add(viewUsersButton);
        panel.add(viewIssuedBooksButton);
        panel.add(issueBookButton);
        panel.add(addUserButton);
        panel.add(addBookButton);
        panel.add(returnBookButton);
        panel.add(createResetButton);

        viewBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the logic to view books
                //JOptionPane.showMessageDialog(null, "View Books button clicked");
                new ViewBook().setVisible(true);
            }
        });

        viewUsersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the logic to view users
              //  JOptionPane.showMessageDialog(null, "View Users button clicked");
                new ViewUsers().setVisible(true);
            }
        });

        viewIssuedBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the logic to view issued books
                //JOptionPane.showMessageDialog(null, "View Issued Books button clicked");
                new IssueBook().setVisible(true);
            }
        });

        issueBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the logic to issue a book
                JOptionPane.showMessageDialog(null, "Issue Book button clicked");
            }
        });

        addUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the logic to add a user
                JOptionPane.showMessageDialog(null, "Add User button clicked");
            }
        });

        addBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the logic to add a book
               // JOptionPane.showMessageDialog(null, "Add Book button clicked");
                new AddBook().setVisible(true);
            }
        });

        returnBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the logic to return a book
                JOptionPane.showMessageDialog(null, "Return Book button clicked");
            }
        });

        createResetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the logic to create/reset something
                JOptionPane.showMessageDialog(null, "Database created/Reset");
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AdminForm();
            }
        });
    }
}
