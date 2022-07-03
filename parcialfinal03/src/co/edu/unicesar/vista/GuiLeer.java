
package co.edu.unicesar.vista;

import co.edu.unicesar.utilidades.Mensaje;
import Excepciones.ExcepcionArchivo;
import co.edu.unicesar.modelo.ListaPublicacion;
import co.edu.unicesar.modelo.Publicacion;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jairo F
 */
public class GuiLeer extends JDialog {

    private JPanel  panelPrinicipal;
    private JScrollPane panelTabla;
    private JTextField txtBusqueda;
    private JTable tablaRegistros;
    private DefaultTableModel modeloTabla;
       private String titulosTabla[] = {"IDBM", "TITULO", "AUTOR", "AÑO", "COSTO", "N. PAGS","EDICION","DURACION","PESO","FORMATO "};
    private String datosTabla[][] = {null};
    private Container contenedor;
    private ListaPublicacion modelo;

    public GuiLeer(Frame frame, boolean bln) {
        super(frame, bln);
        this.modelo = new ListaPublicacion();

        this.setTitle("Catalogo de Publicaciones - Leer - Version 1.0");
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.iniciarComponentes();
        this.setSize(500, 600);
        try {
            List<Publicacion> lista = this.modelo.leerPublicacion();
            this.actualizarTabla(lista);

        } catch (Exception e) {
        }
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void iniciarComponentes() {
        this.contenedor = this.getContentPane();
        this.contenedor.setLayout(new FlowLayout());

        this.panelPrinicipal = new JPanel();
        this.panelPrinicipal.setLayout(new BorderLayout());

        this.iniciarPanelTabla();
        this.panelPrinicipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        this.contenedor.add(this.panelPrinicipal);
    }
    private void iniciarPanelTabla() {

        this.tablaRegistros = new JTable();
        this.modeloTabla = new DefaultTableModel(this.datosTabla, this.titulosTabla);
        this.tablaRegistros.setModel(this.modeloTabla);
        this.panelTabla = new JScrollPane(this.tablaRegistros);

        this.panelPrinicipal.add(this.panelTabla, BorderLayout.CENTER);

    }
    public void actualizarTabla(List<Publicacion> lista) {

        this.modeloTabla.setNumRows(0);

        for (Publicacion a : lista) {
            //{"IDBM", "TITULO", "AUTOR", "AÑO", "COSTO", "Otros"};
              String datos[] = a.getInfoDatos();
            this.modeloTabla.addRow(datos);
        }

    }

    private void filtrarDatos() {

        try {

            String serial;
            List<Publicacion> lista;
            if (this.txtBusqueda.getText().isEmpty()) {
                serial = "";
                lista = this.modelo.leerPublicacion();
            } else {
                serial = (this.txtBusqueda.getText());
                lista = this.modelo.filtrarPublicacion(serial);
            }
            this.actualizarTabla(lista);

        } catch (ExcepcionArchivo e) {
        }

    }

    private void eliminarDato() {

        int row = this.tablaRegistros.getSelectedRow();
        String idbn = (String) this.modeloTabla.getValueAt(row, 0);
        try {
            this.modelo.eliminarPublicacion(new Publicacion(idbn) {
                @Override
                public String getDataStringFormat() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public String getStringFormat() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public String[] getInfoDatos() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            });
            Mensaje.mostrar(this, "Confirmacion", "Registro eliminadi", JOptionPane.INFORMATION_MESSAGE);
            this.filtrarDatos();

        } catch (Exception e) {

        }

    }

    class eventoFiltroBusqueda implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
            filtrarDatos();
        }

    }

    class eventoClickEliminar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            eliminarDato();
        }

    }
}
