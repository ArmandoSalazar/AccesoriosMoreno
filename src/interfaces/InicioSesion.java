package interfaces;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import modelos.Usuario;
import modelos.UsuarioDAO;

/**
 *
 * @author armando
 */
public class InicioSesion extends javax.swing.JFrame {

    private final Container fondo = this.getContentPane();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Usuario usuario = new Usuario();

    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        fondo.setBackground(new Color(255, 217, 0));
        initComponents();
        usuarioTXT.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(255, 0, 44), 2), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        claveTXT.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(255, 0, 44), 2), BorderFactory.createEmptyBorder(0, 10, 0, 10)));
        claveTXT.setEchoChar('●');
        usuarioTXT.setText("Accesorios Moreno");
        claveTXT.setText("12345");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cerrarLB = new javax.swing.JLabel();
        tituloLB = new javax.swing.JLabel();
        usuarioTXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        claveTXT = new javax.swing.JPasswordField();
        panelBoton = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        msjLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accesorios Moreno");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 0, 44));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administrador.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 217, 0));
        jLabel3.setText("Accesorios Moreno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 44));

        cerrarLB.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cerrarLB.setForeground(new java.awt.Color(255, 255, 255));
        cerrarLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarLB.setText("X");
        cerrarLB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarLBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarLB, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cerrarLB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        tituloLB.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        tituloLB.setForeground(new java.awt.Color(255, 0, 44));
        tituloLB.setText("Iniciar sesión");

        usuarioTXT.setBackground(new java.awt.Color(255, 217, 0));
        usuarioTXT.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        usuarioTXT.setForeground(new java.awt.Color(255, 0, 44));
        usuarioTXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 44), 2));
        usuarioTXT.setCaretColor(new java.awt.Color(255, 0, 44));
        usuarioTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioTXTKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 44));
        jLabel5.setText("Usuario");

        jLabel6.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 44));
        jLabel6.setText("Contraseña");

        claveTXT.setBackground(new java.awt.Color(255, 217, 0));
        claveTXT.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        claveTXT.setForeground(new java.awt.Color(255, 0, 44));
        claveTXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 0, 44), 2));
        claveTXT.setCaretColor(new java.awt.Color(255, 0, 44));
        claveTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                claveTXTKeyTyped(evt);
            }
        });

        panelBoton.setBackground(new java.awt.Color(255, 0, 44));
        panelBoton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 44), 2));

        btnIngresar.setBackground(new java.awt.Color(255, 0, 44));
        btnIngresar.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 217, 0));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
            .addGroup(panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
        );

        msjLB.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        msjLB.setForeground(new java.awt.Color(255, 0, 44));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(usuarioTXT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                        .addComponent(claveTXT, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(msjLB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(tituloLB)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(tituloLB)
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(claveTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(msjLB, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(599, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        validar();
    }//GEN-LAST:event_btnIngresarActionPerformed

    public void validar() {
        String nombre = usuarioTXT.getText();
        String clave = claveTXT.getText();
        if (usuarioTXT.getText().equals("") || claveTXT.getText().equals("")) {
            msjLB.setText("¡Error, debes de rellenar todos los campos!");
            usuarioTXT.requestFocus();
        } else {
            usuario = usuarioDAO.validarUsuario(nombre, clave);
            if (usuario.getUsuario() != null && usuario.getClave() != null) {
                new VentanaPrincipal().setVisible(true);
                dispose();
            } else {
                msjLB.setText("¡Error, los datos ingresados son invalidos!");
            }
        }
    }
    private void cerrarLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarLBMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarLBMouseClicked

    private void claveTXTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_claveTXTKeyTyped
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER) {
            btnIngresar.doClick();
        }
    }//GEN-LAST:event_claveTXTKeyTyped

    private void usuarioTXTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioTXTKeyTyped
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER) {
            btnIngresar.doClick();
        }
    }//GEN-LAST:event_usuarioTXTKeyTyped

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        panelBoton.setBackground(new Color(255, 217,0));
        btnIngresar.setForeground(new Color(255,0,44));
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        panelBoton.setBackground(new Color(255, 0, 44));
        btnIngresar.setForeground(new Color(255, 217, 0));
    }//GEN-LAST:event_btnIngresarMouseExited

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel cerrarLB;
    private javax.swing.JPasswordField claveTXT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel msjLB;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JLabel tituloLB;
    private javax.swing.JTextField usuarioTXT;
    // End of variables declaration//GEN-END:variables
}
