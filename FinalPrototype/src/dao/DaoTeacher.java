/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import models.Teacher;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author senai
 */
public class DaoTeacher {
    private Connection connection;
    int teacherId;
    String teacherName;
    String teacherMatter;
    String teacherSchedule;
    String teacherEmail;
    String teacherPhone;
    String teacherCity;
    String teacherState;
    
    public DaoTeacher() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void add(Teacher teacher) {
        String sql = "INSERT INTO teacher(teacherName, teacherMatter, teacherSchedule, teacherEmail, teacherPhone, teacherCity, teacherState) VALUES(?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, teacher.getTeacherName());
            stmt.setString(2, teacher.getTeacherMatter());
            stmt.setString(3, teacher.getTeacherSchedule());
            stmt.setString(4, teacher.getTeacherEmail());
            stmt.setString(5, teacher.getTeacherPhone());
            stmt.setString(6, teacher.getTeacherCity());
            stmt.setString(7, teacher.getTeacherState());
            
            stmt.execute();
            stmt.close();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public ArrayList consult(String collum, String value) {
        try {
            String sql = "SELECT * FROM teacher WHERE " + collum + " LIKE '%" + value + "%'";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            ArrayList data = new ArrayList();
            while (rs.next()) {
                
                data.add(new Object[]{
                    rs.getInt("teacherId"),
                    rs.getString("teacherName"),
                    rs.getString("teacherMatter"),
                    rs.getString("teacherSchedule"),
                    rs.getString("teacherEmail"),
                    rs.getString("teacherPhone"),
                    rs.getString("teacherCity"),
                    rs.getString("teacherState")
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
        String sql = "DELETE FROM teacher WHERE teacher.teacherId = " + value;
        
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
        String sql = "UPDATE teacher SET " + column + " = '" + newValue + "' WHERE teacherId = " + id;
        
        try {
            
            PreparedStatement stmt = connection.prepareStatement(sql);     
            stmt.execute();
            stmt.close();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
