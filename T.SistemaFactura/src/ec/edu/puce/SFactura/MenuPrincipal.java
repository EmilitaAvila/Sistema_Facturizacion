package ec.edu.puce.SFactura;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;

public class MenuPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;
    private FrmCliente frmCliente;
    private JDesktopPane desktopPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuPrincipal frame = new MenuPrincipal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MenuPrincipal() {
        setTitle("SISTEMA DE FACTURACIÓN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 803, 614);

        desktopPane = new JDesktopPane(); // Debes crear el JDesktopPane
        desktopPane.setBackground(new Color(223, 179, 230));
        setContentPane(desktopPane);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(191, 240, 235));
        setJMenuBar(menuBar);

        JMenu mnNewMenu_3 = new JMenu("Clientes");
        mnNewMenu_3.setFont(new Font("Serif", Font.BOLD, 12));
        menuBar.add(mnNewMenu_3);

        JMenuItem mntmNewMenuItem_4 = new JMenuItem("Crear Clientes");
        mntmNewMenuItem_4.setBackground(new Color(255, 255, 255));
        mntmNewMenuItem_4.setFont(new Font("Tw Cen MT", Font.ITALIC, 11));
        mntmNewMenuItem_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (frmCliente == null || frmCliente.isClosed()) {
                    frmCliente = new FrmCliente();
                    desktopPane.add(frmCliente);
                    frmCliente.setVisible(true);
                } else {
                    frmCliente.toFront();
                }
            }
        });
        mnNewMenu_3.add(mntmNewMenuItem_4);

        JMenuItem mntmNewMenuItem_5 = new JMenuItem("Lista de Clientes");
        mntmNewMenuItem_5.setBackground(new Color(255, 255, 255));
        mntmNewMenuItem_5.setFont(new Font("Tw Cen MT", Font.ITALIC, 11));
        mnNewMenu_3.add(mntmNewMenuItem_5);

        JMenu mnNewMenu_1 = new JMenu("Productos");
        mnNewMenu_1.setFont(new Font("Serif", Font.BOLD, 12));
        menuBar.add(mnNewMenu_1);

        JMenuItem mntmNewMenuItem = new JMenuItem("Crear Producto");
        mntmNewMenuItem.setBackground(new Color(255, 255, 255));
        mntmNewMenuItem.setFont(new Font("Tw Cen MT", Font.ITALIC, 11));
        mnNewMenu_1.add(mntmNewMenuItem);

        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Lista Productos");
        mntmNewMenuItem_2.setBackground(new Color(255, 255, 255));
        mntmNewMenuItem_2.setFont(new Font("Tw Cen MT", Font.ITALIC, 11));
        mnNewMenu_1.add(mntmNewMenuItem_2);

        JMenu mnNewMenu_2 = new JMenu("Redes Sociales");
        mnNewMenu_2.setFont(new Font("Serif", Font.BOLD, 12));
        menuBar.add(mnNewMenu_2);

        JLabel lblNewLabel = new JLabel("Facebook    ");
        lblNewLabel.setFont(new Font("Tw Cen MT", Font.ITALIC, 11));
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBackground(new Color(213, 247, 200));
        mnNewMenu_2.add(lblNewLabel);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario\\Downloads\\icons8-facebook-64.png"));

        JLabel lblNewLabel_1 = new JLabel("Instagram   ");
        lblNewLabel_1.setBackground(new Color(213, 247, 200));
        lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.ITALIC, 11));
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\Downloads\\icons8-instagram-64.png"));
        mnNewMenu_2.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("  Twitter           ");
        lblNewLabel_2.setBackground(new Color(213, 247, 200));
        lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.ITALIC, 11));
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Usuario\\Downloads\\icons8-twitter-64.png"));
        mnNewMenu_2.add(lblNewLabel_2);
    }
}
