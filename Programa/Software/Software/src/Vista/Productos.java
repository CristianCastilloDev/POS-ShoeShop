
package Vista;

import java.awt.Color;


public class Productos extends javax.swing.JFrame {


    public Productos() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Round_JWC1 = new swing.Panel_Round_JWC();
        jLabel7 = new javax.swing.JLabel();
        panel_Round_JWC6 = new swing.Panel_Round_JWC();
        img_Round_JWC1 = new swing.Img_Round_JWC();
        Codigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Codigo1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Codigo2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Codigo3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_Round_JWC1.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC1.setEsqInferiorDerecha(30);
        panel_Round_JWC1.setEsqInferiorIzquierda(30);
        panel_Round_JWC1.setEsqSuperiorDerecha(30);
        panel_Round_JWC1.setEsqSuperiorIzquierda(30);
        panel_Round_JWC1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Producto");
        panel_Round_JWC1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 70, -1));

        panel_Round_JWC6.setBackground(new java.awt.Color(43, 43, 43));
        panel_Round_JWC6.setEsqInferiorDerecha(40);
        panel_Round_JWC6.setEsqInferiorIzquierda(40);
        panel_Round_JWC6.setEsqSuperiorDerecha(40);
        panel_Round_JWC6.setEsqSuperiorIzquierda(40);
        panel_Round_JWC6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_Round_JWC1.setForeground(new java.awt.Color(204, 204, 204));
        img_Round_JWC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/pexels-mnz-1598505.jpg"))); // NOI18N
        panel_Round_JWC6.add(img_Round_JWC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 160));

        panel_Round_JWC1.add(panel_Round_JWC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 200, 200));

        Codigo.setBackground(new java.awt.Color(43, 43, 43));
        Codigo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Codigo.setForeground(new java.awt.Color(204, 204, 204));
        Codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Codigo.setBorder(null);
        panel_Round_JWC1.add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 210, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Productos");
        panel_Round_JWC1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 120, -1));

        Codigo1.setBackground(new java.awt.Color(43, 43, 43));
        Codigo1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Codigo1.setForeground(new java.awt.Color(204, 204, 204));
        Codigo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Codigo1.setBorder(null);
        panel_Round_JWC1.add(Codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 210, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Codigo");
        panel_Round_JWC1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 60, -1));

        Codigo2.setBackground(new java.awt.Color(43, 43, 43));
        Codigo2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Codigo2.setForeground(new java.awt.Color(204, 204, 204));
        Codigo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Codigo2.setBorder(null);
        panel_Round_JWC1.add(Codigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 210, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Precio");
        panel_Round_JWC1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 60, -1));

        Codigo3.setBackground(new java.awt.Color(43, 43, 43));
        Codigo3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Codigo3.setForeground(new java.awt.Color(204, 204, 204));
        Codigo3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Codigo3.setBorder(null);
        panel_Round_JWC1.add(Codigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 210, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Talla");
        panel_Round_JWC1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Round_JWC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Round_JWC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField Codigo1;
    private javax.swing.JTextField Codigo2;
    private javax.swing.JTextField Codigo3;
    private swing.Img_Round_JWC img_Round_JWC1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private swing.Panel_Round_JWC panel_Round_JWC1;
    private swing.Panel_Round_JWC panel_Round_JWC6;
    // End of variables declaration//GEN-END:variables
}
