package ec.edu.puce.SFactura;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmCliente extends JInternalFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtCedula;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JTextField txtEmail;
    private JTable table;
    private DefaultTableModel model;

    public FrmCliente() {
        setBounds(100, 100, 425, 583);
        getContentPane().setLayout(null);

        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(186, 233, 239));
        contentPane.setLayout(null);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBounds(0, 0, 540, 684);
        getContentPane().add(contentPane);

        JLabel lblNewLabel = new JLabel("Cédula");
        lblNewLabel.setFont(new Font("Tw Cen MT", Font.ITALIC, 12));
        lblNewLabel.setBounds(10, 11, 57, 29);
        contentPane.add(lblNewLabel);

        txtCedula = new JTextField();
        txtCedula.setFont(new Font("Segoe UI Historic", Font.PLAIN, 10));
        txtCedula.setColumns(10);
        txtCedula.setBounds(103, 16, 121, 20);
        contentPane.add(txtCedula);

        JLabel lblNewLabel_1 = new JLabel("Nombres");
        lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.ITALIC, 12));
        lblNewLabel_1.setBounds(10, 51, 57, 29);
        contentPane.add(lblNewLabel_1);

        txtNombres = new JTextField();
        txtNombres.setFont(new Font("Segoe UI Historic", Font.PLAIN, 10));
        txtNombres.setColumns(10);
        txtNombres.setBounds(103, 56, 121, 20);
        contentPane.add(txtNombres);

        JLabel lblNewLabel_2 = new JLabel("Apellidos");
        lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.ITALIC, 12));
        lblNewLabel_2.setBounds(10, 91, 57, 14);
        contentPane.add(lblNewLabel_2);

        txtApellidos = new JTextField();
        txtApellidos.setFont(new Font("Segoe UI Historic", Font.PLAIN, 10));
        txtApellidos.setColumns(10);
        txtApellidos.setBounds(103, 89, 121, 20);
        contentPane.add(txtApellidos);

        JLabel lblNewLabel_3 = new JLabel("Dirección");
        lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.ITALIC, 12));
        lblNewLabel_3.setBounds(10, 116, 57, 29);
        contentPane.add(lblNewLabel_3);

        txtDireccion = new JTextField();
        txtDireccion.setFont(new Font("Segoe UI Historic", Font.PLAIN, 10));
        txtDireccion.setColumns(10);
        txtDireccion.setBounds(103, 121, 121, 20);
        contentPane.add(txtDireccion);

        JLabel lblNewLabel_4 = new JLabel("Teléfono");
        lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.ITALIC, 12));
        lblNewLabel_4.setBounds(10, 156, 57, 29);
        contentPane.add(lblNewLabel_4);

        txtTelefono = new JTextField();
        txtTelefono.setFont(new Font("Segoe UI Historic", Font.PLAIN, 10));
        txtTelefono.setColumns(10);
        txtTelefono.setBounds(103, 161, 121, 20);
        contentPane.add(txtTelefono);

        JLabel lblNewLabel_5 = new JLabel("Email");
        lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.ITALIC, 12));
        lblNewLabel_5.setBounds(10, 196, 57, 29);
        contentPane.add(lblNewLabel_5);

        txtEmail = new JTextField();
        txtEmail.setFont(new Font("Segoe UI Historic", Font.PLAIN, 10));
        txtEmail.setColumns(10);
        txtEmail.setBounds(103, 201, 121, 20);
        contentPane.add(txtEmail);

        JButton btnNuevo = new JButton("Nuevo");
        btnNuevo.setBackground(new Color(253, 208, 168));
        btnNuevo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });
        btnNuevo.setFont(new Font("Serif", Font.BOLD, 12));
        btnNuevo.setBounds(20, 236, 96, 23);
        contentPane.add(btnNuevo);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBackground(new Color(253, 208, 168));
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cerrarVentana();
            }
        });
        btnCancelar.setFont(new Font("Serif", Font.BOLD, 12));
        btnCancelar.setBounds(308, 236, 96, 23);
        contentPane.add(btnCancelar);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBackground(new Color(253, 208, 168));
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (camposValidos()) {
                    crearCliente();
                } else {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnGuardar.setFont(new Font("Serif", Font.BOLD, 12));
        btnGuardar.setBounds(166, 236, 96, 23);
        contentPane.add(btnGuardar);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(20, 284, 384, 257);
        contentPane.add(scrollPane);

        table = new JTable();
        table.setFont(new Font("Tw Cen MT", Font.ITALIC, 11));
        table.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Cédula", "Nombres", "Apellidos", "Direccion", "Telefono", "Email"}
        ));
        scrollPane.setViewportView(table);
        model = (DefaultTableModel) table.getModel();
    }

    private void crearCliente() {
        ClienteFact cliente = new ClienteFact();
        cliente.setCedula(txtCedula.getText());
        cliente.setNombre(txtNombres.getText());
        cliente.setApellido(txtApellidos.getText());
        cliente.setDireccion(txtDireccion.getText());
        cliente.setTelefono(txtTelefono.getText());
        cliente.setEmail(txtEmail.getText());
        agregarFila(cliente);
    }

    private void agregarFila(ClienteFact cliente) {
        Object[] fila = new Object[]{
                cliente.getCedula(),
                cliente.getNombre(),
                cliente.getApellido(),
                cliente.getDireccion(),
                cliente.getTelefono(),
                cliente.getEmail()
        };
        model.addRow(fila);
        model.fireTableDataChanged(); 
    }
    
    private void limpiarCampos() {
        txtCedula.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
    }

    private boolean camposValidos() {
        return !txtCedula.getText().isEmpty() &&
                !txtNombres.getText().isEmpty() &&
                !txtApellidos.getText().isEmpty() &&
                !txtDireccion.getText().isEmpty() &&
                !txtTelefono.getText().isEmpty() &&
                !txtEmail.getText().isEmpty();
    }

    public void cerrarVentana() {
        this.dispose();
    }

    public DefaultTableModel getModeloTabla() {
        return model;
    }
}
