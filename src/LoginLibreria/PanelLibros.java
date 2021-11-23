package LoginLibreria;

import Includes.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PanelLibros extends javax.swing.JPanel {

    public PanelLibros() {
        initComponents();
        tblLibros.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCategoria = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();

        lblCategoria.setText("CATEGORIA");

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aventura", "Ciencia Ficción", "Policíaca", "Terro y misterio", "Romántica", "Humor", "Poesía", "Mitología", "Teatro", "Cuento", "Matemáticas", "Astronomía y ciencias afines ", "Física", "Química y ciencias afines", "Geociencias", "Paleontología", "Ciencias biológicas", "Ciencias botánicas", "Ciencias zoológicas", "Religión natural", "Biblia", "Teología cristiana", "Moral y prácticas cristianas", "Iglesia local y órdenes religiosas", "Teología social y eclesiología", "Historia y geografía de la iglesia", "Credos de la iglesia cristiana", "Otras religiones", "Ciencias médicas", "Ingeniería y operaciones afines", "Agricultura y tecnologías afines", "Economía doméstica", "Servicios administrativos empresariales", "Química industrial", "Manufacturas", "Manufacturas varias", "Construcciones" }));
        cbxCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCategoriaItemStateChanged(evt);
            }
        });
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Titulo", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLibros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCategoria)
                .addGap(18, 18, 18)
                .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCategoriaItemStateChanged
        
    }//GEN-LAST:event_cbxCategoriaItemStateChanged

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        Conexion conn = new Conexion();
        conn.estableceConexion("Eduardo","987456321");
        ResultSet rs;
        String sql = """
                        SELECT l.isbn,l.titulo,l.precio
                        FROM libreria.libro as l
                        WHERE l.categoria_id = (SELECT categoria_id FROM libreria.categoria WHERE nombre_categoria = ?);
                     """;
        
        
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tblLibros.setModel(modelo);
            PreparedStatement st ;
            st = conn.cn.prepareStatement(sql);
            st.setString(1, (String)cbxCategoria.getSelectedItem());
            rs = st.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int numColumnas = rsMd.getColumnCount();
            modelo.addColumn("ISBN");
            modelo.addColumn("Titulo");
            modelo.addColumn("Precio");
            while (rs.next()) {                
                Object[] filas = new Object[numColumnas];
                for (int i = 0; i < numColumnas; i++) {
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
                    
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginLibreria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbxCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JTable tblLibros;
    // End of variables declaration//GEN-END:variables
}
