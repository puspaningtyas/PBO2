/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author user only
 */
public class MyDokterDialog extends JDialog {

    private JTable table;

    public MyDokterDialog(Frame owner, boolean modal) {
        super(owner, modal);
        init();
    }

    public void init() {
        setSize(400, 300);
        table = new JTable(new MyTableModel());
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        add(scrollPane);
        setVisible(true);
    }

}
