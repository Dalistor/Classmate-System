package models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * fonte: http://devsv.wordpress.com/2012/07/08/como-implementar-um-tablemodel/
 */
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

// Implementacao do modelo da minha JTable.
public class ModelTable extends AbstractTableModel {

    private ArrayList lines = null;
    private String[] columns = null;

    public ModelTable(ArrayList lin, String[] col) {
        this.lines = lin;
        this.columns = col;
    }

    public ArrayList getLinhas() {
        return lines;
    }

    public String[] getColunas() {
        return columns;
    }

    public int getRowCount() {
        return lines.size();
    }

    public int getColumnCount() {
        return columns.length;
    }

    // Expecifica o nome das columns na tabela
    @Override
    public String getColumnName(int numCol) {
        return columns[numCol];
    }

    // Retornas as informacoes na tabela
    public Object getValueAt(int numLines, int numColumns) {

        Object[] line = (Object[]) getLinhas().get(numLines);

        return line[numColumns];
    }

}
