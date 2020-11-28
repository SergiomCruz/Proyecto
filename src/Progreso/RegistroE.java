/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progreso;
import java.sql.*;
/**
 *
 * @author Sergio
 */
public class RegistroE extends javax.swing.JFrame {

    /**
     * Creates new form RegistroE
     */
    public RegistroE() {
        initComponents();
        setSize(565, 430);//tamaño de la interfaz
        setResizable(false);//evita que el usuruario modifica las dimenciones de la interfaz
        setTitle("Acceso al sistema");//nombre de la interfaz
        setLocationRelativeTo(null);//Sentrar la interfaz
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro Enfermero");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jButton1.setText("Registrar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jButton2.setText("Cargar Imagen");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jTextField1.setBackground(new java.awt.Color(102, 0, 102));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 150, -1));

        jTextField7.setBackground(new java.awt.Color(102, 0, 102));
        jTextField7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 150, -1));

        jRadioButton1.setBackground(new java.awt.Color(102, 0, 102));
        jRadioButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Hombre");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(102, 0, 102));
        jRadioButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Mujer");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jTextField5.setBackground(new java.awt.Color(102, 0, 102));
        jTextField5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 150, -1));

        jTextField2.setBackground(new java.awt.Color(102, 0, 102));
        jTextField2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 150, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Usuario:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 121, 99));

        jDateChooser1.setBackground(new java.awt.Color(102, 0, 102));
        jDateChooser1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 150, -1));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 560, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}