package ec.edu.puce.SFactura;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;

public class ListaCliente extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JTable table;

    public ListaCliente(DefaultTableModel modeloTabla) {
    	setForeground(new Color(176, 232, 236));
    	getContentPane().setFont(new Font("Tw Cen MT", Font.ITALIC, 11));
    	setBackground(new Color(176, 232, 236));
    	getContentPane().setBackground(new Color(176, 232, 236));
        setBounds(100, 100, 519, 617);
        JScrollPane scrollPane = new JScrollPane();
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        table = new JTable();
        table.setBackground(new Color(176, 232, 236));
        table.setFont(new Font("Tw Cen MT", Font.ITALIC, 11));
        table.setModel(modeloTabla); 
        scrollPane.setViewportView(table);
    }
}


