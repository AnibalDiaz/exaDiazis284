package vista;

//librerias de conexion
import javax.swing.JOptionPane;//ventanas emergentes
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//Controlador de java a MySQL
import java.sql.Statement;//Instrucciones SQL querys de BD
import java.sql.ResultSet;//Resultado final de datos
import java.sql.SQLException;//Trabajar errors de base de datos
import java.sql.*;//Libreria general de base de datos
import java.io.*;//Entrada y salidad de datos
import javax.swing.table.DefaultTableModel;//Modelo de datos

public class UsuarioVendedor extends javax.swing.JFrame {
    //variables de conexion
        public  Connection cn;//conexion a BD
        public  Statement stmt;//Instrucciones SQL querys de BD
        public  ResultSet rs;//Resultado final de datos

    public UsuarioVendedor() {
        initComponents();
    }

    public void conectarBase(){//inicia metodo conectar
    try{//inicia try
    //puente de conexion
    Class.forName("com.mysql.jdbc.Driver");//puente de conexion
       cn=DriverManager.getConnection("jdbc:mysql://localhost/bdexadiazis284","root","");
       stmt=cn.createStatement();//genera sentencias sql
       JOptionPane.showMessageDialog(null,"CONEXION BD ESTABLECIDA \nDiaz");
    }catch(SQLException ex){//inicia exeption
        JOptionPane.showMessageDialog(null, ex);
    }catch(Exception e){//inica exception errores generales
        JOptionPane.showMessageDialog(null, e);
    }  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panRegistrar = new javax.swing.JPanel();
        lblIdProducto = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsultarProductos = new javax.swing.JTable();
        txtConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario Vendedor Diaz");

        panRegistrar.setBackground(new java.awt.Color(153, 255, 153));
        panRegistrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Productos"));

        lblIdProducto.setText("IdProducto:");

        lblMarca.setText("Marca:");

        lblModelo.setText("Modelo:");

        lblPrecio.setText("Precio:");

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRegistrarLayout = new javax.swing.GroupLayout(panRegistrar);
        panRegistrar.setLayout(panRegistrarLayout);
        panRegistrarLayout.setHorizontalGroup(
            panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistrarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdProducto)
                    .addComponent(lblPrecio)
                    .addComponent(lblModelo)
                    .addComponent(lblMarca))
                .addGap(36, 36, 36)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panRegistrarLayout.setVerticalGroup(
            panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistrarLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdProducto)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panRegistrarLayout.createSequentialGroup()
                        .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMarca)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(lblModelo))
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jtConsultarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdProducto", "Marca", "Modelo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jtConsultarProductos);

        txtConsultar.setText("Consultar");
        txtConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(panRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConsultar)
                                .addGap(186, 186, 186)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtConsultar)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        conectarBase();//llamada a metodo conectar
        //declaracion de variables de entrada
        int idProducto=Integer.parseInt(txtIdProducto.getText());
        String marca=txtMarca.getText();
        String modelo=txtModelo.getText();
        String precio=txtPrecio.getText();
       
        //proceso guardar en la base de datos
  String altaProducto="INSERT INTO BDEXADIAZIS284 VALUES ('"+idProducto+"','"+marca+"','"+modelo+"','"+precio+"')";
        try {//estructura de control de tratamiento de errores
            //Ejecutar instruccion de alta
            stmt.executeUpdate(altaProducto);
            JOptionPane.showMessageDialog(null, "Se agrego producto de forma correcta\n"+marca);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD :\n"+ e);
        }//termina catch
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultarActionPerformed
        try{//inicia try    Estructura de control para trataminento de errores
                 conectarBase();//llamada  a la conexion a BD
                 //Objeto Model es para almacenar  y guardar los valores de la tabla
                 DefaultTableModel modeloDatos = new DefaultTableModel();
                 jtConsultarProductos.setModel(modeloDatos);
                 rs=stmt.executeQuery("Select * from bdexadiazis284");
                 ResultSetMetaData rsmd=rs.getMetaData();
                 int cantidadColumnas=rsmd.getColumnCount();
                 modeloDatos.addColumn("IdProducto ");
                 modeloDatos.addColumn("Marca");
                 modeloDatos.addColumn("Modelo");
                 modeloDatos.addColumn("Precio");
                 while (rs.next()) { //inicia                    
                     //arreglo objetos para imprimir filas
                     Object [] fila = new Object[cantidadColumnas];
                     for (int i = 0; i < cantidadColumnas; i++) {//inicia for
                         fila[i]=rs.getObject(i+1);
                     }//termina for
                     modeloDatos.addRow(fila);
                 }//termina while
             }catch(SQLException ex){
                 JOptionPane.showMessageDialog(null,"Error de BD\n"+ ex);
             }//terrmina catch
    }//GEN-LAST:event_txtConsultarActionPerformed

    
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
            java.util.logging.Logger.getLogger(UsuarioVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsultarProductos;
    private javax.swing.JLabel lblIdProducto;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel panRegistrar;
    private javax.swing.JButton txtConsultar;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
