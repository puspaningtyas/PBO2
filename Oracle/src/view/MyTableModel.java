/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model_RS.Dokter;
import model_RS.RumahSakit;

/**
 *
 * @author user only
 */
public class MyTableModel extends AbstractTableModel {

//    private String[] columnNames = {"First Name",
//        "Last Name",
//        "Sport",
//        "# of Years",
//        "Vegetarian"};
    private String[] columnNames = {
        "Id Dokter",
        "Nama"};
//    private Object[][] data;
    
    private Object[][] data = {
        {"01", "Budi"},
        {"02", "Ani"}
    };

//    Object[][] data = {
//    {"Kathy", "Smith",
//     "Snowboarding", new Integer(5), new Boolean(false)},
//    {"John", "Doe",
//     "Rowing", new Integer(3), new Boolean(true)},
//    {"Sue", "Black",
//     "Knitting", new Integer(2), new Boolean(false)},
//    {"Jane", "White",
//     "Speed reading", new Integer(20), new Boolean(true)},
//    {"Joe", "Brown",
//     "Pool", new Integer(10), new Boolean(false)}
//};
    private ArrayList<Dokter> dataDokter = new ArrayList<Dokter>();

    public MyTableModel() {
//        bacaDataDokter();        
    }
    
    public void bacaDataDokter() {
        RumahSakit rs = new RumahSakit("Panti Rapih", "Yogyakarta");
        rs.bacaDataDokter();
        dataDokter = rs.getDaftarDokter();        
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
//        if (columnIndex == 0) {
//            return data.get(rowIndex).getIdDokter();
//        } else {
//            return data.get(rowIndex).getNama();
//        }
        return data[rowIndex][columnIndex];
    }
}
