/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scd;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public interface DAO {

    public boolean insertIssueBook(int bid, int uid, int period,String issueDate);
    public ArrayList<Book> getAllBooks();
}
