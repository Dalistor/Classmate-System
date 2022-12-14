/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author senai
 */
public class Teacher {
    int teacherId;
    String teacherName;
    String teacherMatter;
    String teacherSchedule;
    String teacherEmail;
    String teacherPhone;
    String teacherCity;
    String teacherState;
    String[] columns = new String[]{"Id", "Nome", "Matéria", "Horário", "Email", "Telefone", "Cidade", "Estado"};

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherMatter() {
        return teacherMatter;
    }

    public void setTeacherMatter(String teacherMatter) {
        this.teacherMatter = teacherMatter;
    }

    public String getTeacherSchedule() {
        return teacherSchedule;
    }

    public void setTeacherSchedule(String teacherSchedule) {
        this.teacherSchedule = teacherSchedule;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    public String getTeacherCity() {
        return teacherCity;
    }

    public void setTeacherCity(String teacherCity) {
        this.teacherCity = teacherCity;
    }

    public String getTeacherState() {
        return teacherState;
    }

    public void setTeacherState(String teacherState) {
        this.teacherState = teacherState;
    }

    public String[] getColumns() {
        return columns;
    }

    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    
}
