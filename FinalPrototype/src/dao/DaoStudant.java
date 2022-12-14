/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import models.Studant;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author senai
 */
public class DaoStudant {
    private Connection connection;
    int studantId;
    String studantName;
    String studantEmail;
    String studantPhone;
    String studantCity;
    String studantState;
    
    public DaoStudant() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void add(Studant user) {
        String sql = "INSERT INTO studant(studantName, studantEmail, studantPhone, studantCity, studantState) VALUES(?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, user.getStudantName());
            stmt.setString(2, user.getStudantEmail());
            stmt.setString(3, user.getStudantPhone());
            stmt.setString(4, user.getStudantCity());
            stmt.setString(5, user.getStudantState());
            
            stmt.execute();
            stmt.close();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public ArrayList consult(String collum, String value) {
        try {
            String sql = "SELECT * FROM studant WHERE " + collum + " LIKE '%" + value + "%'";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            ArrayList data = new ArrayList();
            while (rs.next()) {
                
                data.add(new Object[]{
                    rs.getInt("studantId"),
                    rs.getString("studantName"),
                    rs.getString("studantEmail"),
                    rs.getString("studantPhone"),
                    rs.getString("studantCity"),
                    rs.getString("studantState")
                });

            }
            
            stmt.close();
            rs.close();
            connection.close();
            
            return data;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void delete (int value) {
        String sql = "DELETE FROM studant WHERE studant.studantId = " + value;
        
        try {
            
            PreparedStatement stmt = connection.prepareStatement(sql);     
            stmt.execute();
            stmt.close();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void update (int id, String column, String newValue) {
        String sql = "UPDATE studant SET " + column + " = '" + newValue + "' WHERE studantId = " + id;
        
        try {
            
            PreparedStatement stmt = connection.prepareStatement(sql);     
            stmt.execute();
            stmt.close();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
