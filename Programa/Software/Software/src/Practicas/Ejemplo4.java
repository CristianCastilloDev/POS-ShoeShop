/*
Descripciòn: Ventana para conectar con una base de datos  
Fecha: 23-Junio-2022
Nombre: Jesús Alejandro Peinado Ávila
*/

package Practicas;

import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class Ejemplo4 extends javax.swing.JFrame {
    Connection con;

  
    public Ejemplo4() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        box = new javax.swing.JComboBox<>();
        Servidor = new javax.swing.JLabel();
        BaseDatos = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        Consulta = new javax.swing.JLabel();
        txtServer = new javax.swing.JTextField();
        txtBase = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsulta = new javax.swing.JTextArea();
        Limpiar = new javax.swing.JButton();
        Conectar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana para conectar BD");

        Servidor.setText("Servidor:");

        BaseDatos.setText("Base de datos:");

        Usuario.setText("Usuario:");

        Contraseña.setText("Contraseña:");

        Consulta.setText("Consulta:");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtConsulta.setColumns(20);
        txtConsulta.setRows(5);
        jScrollPane1.setViewportView(txtConsulta);

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Conectar.setText("Conectar");
        Conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectarActionPerformed(evt);
            }
        });

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(Tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BaseDatos)
                            .addComponent(Servidor)
                            .addComponent(Usuario)
                            .addComponent(Contraseña)
                            .addComponent(Consulta))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtServer)
                            .addComponent(txtBase)
                            .addComponent(txtUsuario)
                            .addComponent(txtPass)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Limpiar)
                            .addComponent(Conectar)
                            .addComponent(Consultar))
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Servidor)
                    .addComponent(txtServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BaseDatos)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Usuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Contraseña)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Conectar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Consulta)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consultar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        txtServer.setText("");
        txtBase.setText("");
        txtUsuario.setText("");
        txtPass.setText("");
        txtConsulta.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void ConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConectarActionPerformed
         if(conectar()) {
            JOptionPane.showMessageDialog(null, "Conectado exitosamente");
        }else {
            JOptionPane.showMessageDialog(null, "No se puede conectar");
        }
    }//GEN-LAST:event_ConectarActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        String query = txtConsulta.getText();
        DefaultTableModel dtm = Consultar(query);
        Tabla.setModel(dtm); //Asociamos el modelo a la tabla (JTable)
    }//GEN-LAST:event_ConsultarActionPerformed

    
    
    public boolean conectar(){
        try{
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            String cadenaDeConexion = "jdbc:mysql://" + txtServer.getText() 
                    + ":3306/" + txtBase.getText() ;
            String usuario = txtUsuario.getText();
            String contraseña = txtPass.getText();
            con = DriverManager.getConnection(cadenaDeConexion, usuario, contraseña);
            return true;
            
        }catch(SQLException e){
            return false;
        }
    }
    
    public DefaultTableModel Consultar(String query){
        try{
            Statement s = con.createStatement();            
            ResultSet rs = s.executeQuery(query); // Ejecuta la consulta
            DefaultTableModel dtm = new DefaultTableModel();
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnas = rsMd.getColumnCount(); //obtiene el numero de columnas 
            
            //Ciclo para agregar columnas al dtm
            for(int i = 1; i <= columnas; i++) { // Sirve para obtener los nombres de cada columna (encabezado)
                dtm.addColumn(rsMd.getColumnName(i));
            }
            
            //ciclos para agregar las filas a dtm
            // ciclos para agregar las filas al dtm
            while(rs.next()) {
                Object[] fila = new Object[columnas];
                for(int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                dtm.addRow(fila);
            }
            
            return dtm;
        }catch(SQLException e){
            return null;
        }
    }
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejemplo4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BaseDatos;
    private javax.swing.JButton Conectar;
    private javax.swing.JLabel Consulta;
    private javax.swing.JButton Consultar;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel Servidor;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel Usuario;
    private javax.swing.JComboBox<String> box;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextArea txtConsulta;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtServer;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
