/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class IssueBookDAO implements DAO {
   

    @Override
    public boolean insertIssueBook(int bid, int uid, int period, String issueDate) {
        try {
            Connection connection = DriverManager.getConnection(url, username, pass);
            String query = "INSERT INTO IssuedBooks(BID,UID,PERIOD,DATE)VALUES(?,?,?,?)";
            PreparedStatement pt = connection.prepareStatement(query);
            pt.setInt(1,bid);//To change body of generated methods, choose Tools | Templates.
            pt.setInt(2,uid);//To change body of generated methods, choose Tools | Templates.
            pt.setInt(3,period);//To change body of generated methods, choose Tools | Templates.
            pt.setString(4,issueDate);//To change body of generated methods, choose Tools | Templates.
            int rows = pt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(IssueBookDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
