/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Usuario;

import BussinesLogic.ConsultorioJ;
import GUI.Inicial.EscojerInicioDeSesion;
import GUI.Inicial.PaginaPrincipal;
import data.Usuarios.Cliente.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mauri
 */
public class LoginUsuarioPeiticion extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public LoginUsuarioPeiticion() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        idIngreso = new javax.swing.JTextField();
        botonDeIngreso = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Documento de identidad");

        botonDeIngreso.setText("Ingresar");
        botonDeIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeIngresoActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar al menu anterior");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(idIngreso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botonDeIngreso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(botonDeIngreso)
                        .addGap(67, 67, 67)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonDeIngreso)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDeIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeIngresoActionPerformed
        ConsultorioJ LlamarMetodos = new ConsultorioJ();
        ArrayList listaCliente = new ArrayList<>();
        LlamarMetodos.LeerTodosLosClientes(listaCliente);
        String [] Confirmacion = {"Aceptar"};
        boolean encontro = false;
        for (int i = 0;i < listaCliente.size(); i++) {
            Cliente nuevo = (Cliente) listaCliente.get(i);
            String IdPersonal = nuevo.getIdPersonal();
            if (IdPersonal.equals(idIngreso.getText())) {
                this.setVisible(false);
                encontro = true;
                int respuesta = JOptionPane.showOptionDialog(this,"Bienvenido "+nuevo.getNombre(),"Ingreso exitoso",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,Confirmacion,Confirmacion[0]);
                if (respuesta == 0){
                    /*LoginUsuario IniciaConLogin = new LoginUsuario();
                    IniciaConLogin.setVisible(true);
                    IniciaConLogin.setLocationRelativeTo(null); */
                }
            }             
        }
        if (encontro == false) {
                int respuestaErronea = JOptionPane.showOptionDialog(this,"Número de documento de identidad no encontrado "+ idIngreso.getText(),"Ingreso fallido",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE,null,Confirmacion,Confirmacion[0]);
                    if (respuestaErronea == 0){
                        this.setVisible(false);
                        LoginUsuarioPeiticion reintento = new LoginUsuarioPeiticion();
                        reintento.setLocationRelativeTo(null);
                        reintento.setVisible(true);
                    }
               }
    }//GEN-LAST:event_botonDeIngresoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String [] TipoUsuario = {"Nuevo","Antiguo","Regresar al inicio"};
        this.setVisible(false);
        int respuesta = JOptionPane.showOptionDialog(this,"Escoje tu tipo de usuario","Tipo de usuario",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,TipoUsuario,TipoUsuario[0]);
        if (respuesta == 0){
            Registro1 UsuarioNuevo = new Registro1();
            UsuarioNuevo.setVisible(true);
            this.setVisible(false);
        }
        if (respuesta == 1){
            this.setVisible(false);
            LoginUsuarioPeiticion UsuarioAntiguo = new LoginUsuarioPeiticion();
            UsuarioAntiguo.setVisible(true);   
        }
        if (respuesta == 2){
            PaginaPrincipal regreso = new PaginaPrincipal();
            regreso.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUsuarioPeiticion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUsuarioPeiticion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUsuarioPeiticion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUsuarioPeiticion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUsuarioPeiticion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonDeIngreso;
    private javax.swing.JTextField idIngreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
