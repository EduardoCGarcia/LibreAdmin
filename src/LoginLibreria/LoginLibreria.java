/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginLibreria;

import Includes.Conexion;
import PagInicio.Panel1;
import Utilerias.FondoImagen;
import Utilerias.Mostrar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gonzalo CH
 */
public class LoginLibreria extends javax.swing.JFrame {

    PanelReportes rep = new PanelReportes();
    PanelFacturacion fac = new PanelFacturacion();
    PanelLibrerias lib = new PanelLibrerias();
    PanelLibros book = new PanelLibros();
    Panel1 panel1 = new Panel1();

    public LoginLibreria() {
        initComponents();
        transparenciaBotones();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        panel1.setSize(750, 500);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel1.setLocation(0, 0);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        //Contenedor.removeAll();
        Contenedor.add(panel1);
        Contenedor.revalidate();
        Contenedor.repaint();
        panel1.setVisible(true);
        

    }

    public void transparenciaBotones() {
        btnInicio.setOpaque(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setBorderPainted(false);

        btnReportes.setOpaque(false);
        btnReportes.setContentAreaFilled(false);
        btnReportes.setBorderPainted(false);

        btnFact.setOpaque(false);
        btnFact.setContentAreaFilled(false);
        btnFact.setBorderPainted(false);

        btnLibrerias.setOpaque(false);
        btnLibrerias.setContentAreaFilled(false);
        btnLibrerias.setBorderPainted(false);

        btnLibros.setOpaque(false);
        btnLibros.setContentAreaFilled(false);
        btnLibros.setBorderPainted(false);

        btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Utilerias.FondoImagen fondo = new FondoImagen();
        fondo.setRuta("LibroInicio.jpeg");
        jPanel1 = fondo;
        btnInicio = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnFact = new javax.swing.JButton();
        btnLibrerias = new javax.swing.JButton();
        btnLibros = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        Contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnInicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("   Inicio");
        btnInicio.setBorder(null);
        btnInicio.setBorderPainted(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnReportes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Reportes");
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesMouseExited(evt);
            }
        });
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnFact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFact.setForeground(new java.awt.Color(255, 255, 255));
        btnFact.setText("Facturación");
        btnFact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFact.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFactMouseExited(evt);
            }
        });
        btnFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactActionPerformed(evt);
            }
        });

        btnLibrerias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLibrerias.setForeground(new java.awt.Color(255, 255, 255));
        btnLibrerias.setText("Librerias");
        btnLibrerias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLibrerias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLibrerias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLibreriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLibreriasMouseExited(evt);
            }
        });
        btnLibrerias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibreriasActionPerformed(evt);
            }
        });

        btnLibros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnLibros.setText("Libros");
        btnLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLibros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLibrosMouseExited(evt);
            }
        });
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        Contenedor.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFact, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
            .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLibrerias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFact, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLibrerias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFact, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLibrerias, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosMouseExited
        btnLibros.setContentAreaFilled(false);
    }//GEN-LAST:event_btnLibrosMouseExited

    private void btnLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosMouseEntered
        btnLibros.setContentAreaFilled(true);
        btnLibros.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_btnLibrosMouseEntered

    private void btnLibreriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibreriasMouseExited
        btnLibrerias.setContentAreaFilled(false);
    }//GEN-LAST:event_btnLibreriasMouseExited

    private void btnLibreriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibreriasMouseEntered
        btnLibrerias.setContentAreaFilled(true);
        btnLibrerias.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnLibreriasMouseEntered

    private void btnFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactActionPerformed
        fac.setSize(Contenedor.getWidth(), Contenedor.getHeight());
        fac.setLocation(0, 0);
        Contenedor.removeAll();
        Contenedor.add(fac, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
        fac.setVisible(true);
    }//GEN-LAST:event_btnFactActionPerformed

    private void btnFactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFactMouseExited
        btnFact.setContentAreaFilled(false);
    }//GEN-LAST:event_btnFactMouseExited

    private void btnFactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFactMouseEntered
        btnFact.setContentAreaFilled(true);
        btnFact.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnFactMouseEntered

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        rep.setSize(Contenedor.getWidth(), Contenedor.getHeight());
        rep.setLocation(0, 0);
        Contenedor.removeAll();
        Contenedor.add(rep, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
        rep.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseExited
        btnReportes.setContentAreaFilled(false);
    }//GEN-LAST:event_btnReportesMouseExited

    private void btnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseEntered
        btnReportes.setContentAreaFilled(true);
        btnReportes.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnReportesMouseEntered

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        btnInicio.setContentAreaFilled(false);
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        btnInicio.setContentAreaFilled(true);
        btnInicio.setBackground(Color.BLUE);

    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setContentAreaFilled(true);
        btnSalir.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setContentAreaFilled(false);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Contenedor.removeAll();
        Contenedor.add(panel1);
        Contenedor.revalidate();
        Contenedor.repaint();
        panel1.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnLibreriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibreriasActionPerformed
        lib.setSize(Contenedor.getWidth(), Contenedor.getHeight());
        lib.setLocation(0, 0);
        Contenedor.removeAll();
        Contenedor.add(lib, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint(); 
        Conexion conn = new Conexion();
        conn.estableceConexion("Eduardo","987456321");
        ResultSet rs;
        String sql = """
                        SELECT l.nombre_libreria, l.telefono,l.direccion, 
                        	CONCAT(e.nombre_persona, ' ', e.apellido_paterno, ' ', e.apellido_materno) as encargado
                        FROM libreria.libreria as l, libreria.encargado as e
                        WHERE  e.rfc = l.rfc
                        ORDER BY libreria_id;
                     """;
        
        
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            lib.getTblLibrerias().setModel(modelo);
            PreparedStatement st ;
            st = conn.cn.prepareStatement(sql);
            rs = st.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int numColumnas = rsMd.getColumnCount();
            modelo.addColumn("Nombre");
            modelo.addColumn("Telefono");
            modelo.addColumn("Direccion");
            modelo.addColumn("Encargado");
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
            
        
        lib.setVisible(true);
    }//GEN-LAST:event_btnLibreriasActionPerformed

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        book.setSize(Contenedor.getWidth(), Contenedor.getHeight());
        book.setLocation(0, 0);
        Contenedor.removeAll();
        Contenedor.add(book, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
        book.setVisible(true);
    }//GEN-LAST:event_btnLibrosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        if (Mostrar.respSimple("¿Esta seguro que desea salir?") == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginLibreria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton btnFact;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLibrerias;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
