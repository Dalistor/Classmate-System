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
public class User {
    int studantId;
    String studantName;
    String studantEmail;
    String studantPhone;
    String studantCity;
    String studantState;
    String[] columns = new String[]{"Id", "Nome", "Telefone", "Email", "Cidade", "Estado"};

    public int getStudantId() {
        return studantId;
    }

    public void setStudantId(int studantId) {
        this.studantId = studantId;
    }

    public String getStudantName() {
        return studantName;
    }

    public void setStudantName(String studantName) {
        this.studantName = studantName;
    }

    public String getStudantEmail() {
        return studantEmail;
    }

    public void setStudantEmail(String studantEmail) {
        this.studantEmail = studantEmail;
    }

    public String getStudantPhone() {
        return studantPhone;
    }

    public void setStudantPhone(String studantPhone) {
        this.studantPhone = studantPhone;
    }

    public String getStudantCity() {
        return studantCity;
    }

    public void setStudantCity(String studantCity) {
        this.studantCity = studantCity;
    }

    public String getStudantState() {
        return studantState;
    }

    public void setStudantState(String studantState) {
        this.studantState = studantState;
    }

    public String[] getColumns() {
        return columns;
    }

    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    
}
