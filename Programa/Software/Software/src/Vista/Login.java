
package Vista;
import Modelo.Connect;
import Modelo.login;
import Modelo.UsuarioBD;
import java.awt.Color;

public class Login extends javax.swing.JFrame {
login lg = new login();
UsuarioBD login = new UsuarioBD();
int LayoutX;
int LayoutY;
    public Login() {
        initComponents();
        Connect a = new Connect();
        a.getConnection();
        setBackground(new Color(0,0,0,0));
    }
 
    public void Validar(){
        String Logeo = User.getText();
        String Password = String.valueOf(Pass.getText());        
        lg = login.log(Logeo, Password);      
        dispose();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Round_JWC1 = new swing.Panel_Round_JWC();
        img_Autosize_JWC1 = new swing.Img_Autosize_JWC();
        panel_Round_JWC5 = new swing.Panel_Round_JWC();
        jLabel1 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        Boton_Acceder = new swing.Btn_Round_JWC();
        jLabel6 = new javax.swing.JLabel();
        Check_Ver = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        Salir = new swing.Btn_Round_JWC();
        Minimizar = new swing.Btn_Round_JWC();
        panel_Round_JWC2 = new swing.Panel_Round_JWC();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_Round_JWC1.setBackground(new java.awt.Color(42, 42, 42));
        panel_Round_JWC1.setEsqInferiorDerecha(30);
        panel_Round_JWC1.setEsqInferiorIzquierda(30);
        panel_Round_JWC1.setEsqSuperiorDerecha(30);
        panel_Round_JWC1.setEsqSuperiorIzquierda(30);
        panel_Round_JWC1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_Autosize_JWC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/pexels-hipkicks-6726155.jpg"))); // NOI18N
        panel_Round_JWC1.add(img_Autosize_JWC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 440));

        panel_Round_JWC5.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC5.setEsqInferiorDerecha(30);
        panel_Round_JWC5.setEsqSuperiorDerecha(30);
        panel_Round_JWC5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Contraseña:");
        panel_Round_JWC5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 90, 20));

        User.setBackground(new java.awt.Color(43, 43, 43));
        User.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        User.setForeground(new java.awt.Color(204, 204, 204));
        User.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        User.setBorder(null);
        panel_Round_JWC5.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 250, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Usuario:");
        panel_Round_JWC5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 60, 20));

        Pass.setBackground(new java.awt.Color(43, 43, 43));
        Pass.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Pass.setForeground(new java.awt.Color(204, 204, 204));
        Pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pass.setBorder(null);
        panel_Round_JWC5.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 250, 40));

        Boton_Acceder.setBackground(new java.awt.Color(104, 70, 235));
        Boton_Acceder.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Acceder.setText("Acceder");
        Boton_Acceder.setArco_esquina(15);
        Boton_Acceder.setColor_Hover(new java.awt.Color(90, 63, 255));
        Boton_Acceder.setColor_Normal(new java.awt.Color(104, 70, 235));
        Boton_Acceder.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Boton_Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AccederActionPerformed(evt);
            }
        });
        panel_Round_JWC5.add(Boton_Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 170, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Login");
        panel_Round_JWC5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 70, 40));

        Check_Ver.setBackground(new java.awt.Color(32, 32, 32));
        Check_Ver.setForeground(new java.awt.Color(153, 153, 153));
        Check_Ver.setText("Ver");
        Check_Ver.setBorder(null);
        Check_Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_VerActionPerformed(evt);
            }
        });
        panel_Round_JWC5.add(Check_Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/icons8-huella-dactilar-60.png"))); // NOI18N
        panel_Round_JWC5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        Salir.setBackground(new java.awt.Color(255, 51, 51));
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("");
        Salir.setArco_esquina(15);
        Salir.setColor_Hover(new java.awt.Color(102, 0, 0));
        Salir.setColor_Normal(new java.awt.Color(255, 51, 51));
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        panel_Round_JWC5.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 15, 15));

        Minimizar.setBackground(new java.awt.Color(255, 102, 102));
        Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Minimizar.setText("");
        Minimizar.setArco_esquina(15);
        Minimizar.setColor_Hover(new java.awt.Color(255, 153, 153));
        Minimizar.setColor_Normal(new java.awt.Color(255, 102, 102));
        Minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarActionPerformed(evt);
            }
        });
        panel_Round_JWC5.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 15, 15));

        panel_Round_JWC1.add(panel_Round_JWC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 360, 440));

        panel_Round_JWC2.setEsqSuperiorDerecha(30);
        panel_Round_JWC2.setEsqSuperiorIzquierda(30);
        panel_Round_JWC2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_Round_JWC2MouseDragged(evt);
            }
        });
        panel_Round_JWC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_Round_JWC2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_Round_JWC2Layout = new javax.swing.GroupLayout(panel_Round_JWC2);
        panel_Round_JWC2.setLayout(panel_Round_JWC2Layout);
        panel_Round_JWC2Layout.setHorizontalGroup(
            panel_Round_JWC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        panel_Round_JWC2Layout.setVerticalGroup(
            panel_Round_JWC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        panel_Round_JWC1.add(panel_Round_JWC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Round_JWC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Round_JWC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AccederActionPerformed
        Validar();
    }//GEN-LAST:event_Boton_AccederActionPerformed

    private void Check_VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_VerActionPerformed
        if(Check_Ver.isSelected()==true){
            Pass.setEchoChar((char)0);
        }
        else{
            Pass.setEchoChar('•');
        }
    }//GEN-LAST:event_Check_VerActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(9);
    }//GEN-LAST:event_SalirActionPerformed

    private void MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_MinimizarActionPerformed

    private void panel_Round_JWC2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_Round_JWC2MouseDragged
        this.setLocation(evt.getXOnScreen()-LayoutX, evt.getYOnScreen()-LayoutY); 
    }//GEN-LAST:event_panel_Round_JWC2MouseDragged

    private void panel_Round_JWC2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_Round_JWC2MousePressed
        if(evt.getButton()==java.awt.event.MouseEvent.BUTTON1){
            LayoutX = evt.getX();
            LayoutY = evt.getY();          
        }
    }//GEN-LAST:event_panel_Round_JWC2MousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Btn_Round_JWC Boton_Acceder;
    private javax.swing.JCheckBox Check_Ver;
    private swing.Btn_Round_JWC Minimizar;
    private javax.swing.JPasswordField Pass;
    private swing.Btn_Round_JWC Salir;
    private javax.swing.JTextField User;
    private swing.Img_Autosize_JWC img_Autosize_JWC1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private swing.Panel_Round_JWC panel_Round_JWC1;
    private swing.Panel_Round_JWC panel_Round_JWC2;
    private swing.Panel_Round_JWC panel_Round_JWC5;
    // End of variables declaration//GEN-END:variables
}
