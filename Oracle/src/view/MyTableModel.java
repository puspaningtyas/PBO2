/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.AbstractTableModel;

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
    Object[][] data = {
        {"001", "Smith"},
        {"02", "Doe"}
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
        return data[rowIndex][columnIndex];
    }
}
