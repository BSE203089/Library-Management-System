/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ViewBookDAO implements DAO {
    String url = "jdbc:mysql://localhost:3306/Library";
    String username = "root";
    String pass = "";

    @Override
    public boolean insertIssueBook(int bid, int uid, int period, String issueDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> books = new ArrayList();
        try {
            Connection connection = DriverManager.getConnection(url,username,pass);
            String query = "SELECT * FROM Books";
            PreparedStatement pt = connection.prepareStatement(query);
            ResultSet rs = pt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("BID");
                String name = rs.getString("BNAME");
                String genre = rs.getString("GENRE");
                int price = rs.getInt("PRICE");
                books.add(new Book(id,name,genre,price));      
            }
            return books;
        } catch (SQLException ex) {
            Logger.getLogger(ViewBookDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
