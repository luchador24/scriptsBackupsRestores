/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jocma
 */
public class Backups extends javax.swing.JFrame {

    fondoBl fondo  = new fondoBl();
    
    public Backups() {
        this.setContentPane(fondo);
        initComponents();
        cb_db.addItem("Oracle");
        cb_db.addItem("PostgresSQL");
        cb_db.addItem("MySQl");
        cb_db.addItem("SQLServer");
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fondoBl();
        jPanel2 = new fondoP();
        cmd_regresar = new javax.swing.JButton();
        lbl_txt = new javax.swing.JLabel();
        cb_db = new javax.swing.JComboBox<>();
        lbl_db = new javax.swing.JLabel();
        cmd_backup = new javax.swing.JButton();
        cmd_restore = new javax.swing.JButton();
        txtRuta = new javax.swing.JTextField();
        btnRuta = new javax.swing.JButton();
        txtNombreBD = new javax.swing.JTextField();
        txtBackup = new javax.swing.JTextField();
        txtComand = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmd_Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmd_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar_32.png"))); // NOI18N
        cmd_regresar.setContentAreaFilled(false);
        cmd_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cmd_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cmd_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        lbl_txt.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        lbl_txt.setForeground(new java.awt.Color(51, 51, 51));
        lbl_txt.setText("Backups");

        cb_db.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        lbl_db.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lbl_db.setForeground(new java.awt.Color(102, 102, 102));
        lbl_db.setText("Motor BD");

        cmd_backup.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        cmd_backup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backup_32.png"))); // NOI18N
        cmd_backup.setText("Backup");
        cmd_backup.setContentAreaFilled(false);
        cmd_backup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmd_backup.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backup_48.png"))); // NOI18N
        cmd_backup.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backup_32.png"))); // NOI18N
        cmd_backup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmd_backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_backupActionPerformed(evt);
            }
        });

        cmd_restore.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        cmd_restore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/restore_32.png"))); // NOI18N
        cmd_restore.setText("Restore");
        cmd_restore.setContentAreaFilled(false);
        cmd_restore.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmd_restore.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/restore_48.png"))); // NOI18N
        cmd_restore.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/restore_32.png"))); // NOI18N
        cmd_restore.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmd_restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_restoreActionPerformed(evt);
            }
        });

        btnRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_32.png"))); // NOI18N
        btnRuta.setContentAreaFilled(false);
        btnRuta.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_48.png"))); // NOI18N
        btnRuta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_32.png"))); // NOI18N
        btnRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Nombre Backup:");

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nombre Base de datos:");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Comando:");

        cmd_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar_24.png"))); // NOI18N
        cmd_Limpiar.setContentAreaFilled(false);
        cmd_Limpiar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar_32.png"))); // NOI18N
        cmd_Limpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar_24.png"))); // NOI18N
        cmd_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmd_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmd_restore, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(cmd_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombreBD, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComand, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(cb_db, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(lbl_txt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lbl_db)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_txt)
                .addGap(51, 51, 51)
                .addComponent(lbl_db)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_db, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtComand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(cmd_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmd_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(cmd_restore, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_regresarActionPerformed
        Menu mn  = new Menu();
        this.dispose();
        mn.setVisible(true);
    }//GEN-LAST:event_cmd_regresarActionPerformed

    private void btnRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutaActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        jf.showSaveDialog(this);
        File archivo= jf.getSelectedFile();
        if(archivo != null){
            txtRuta.setText(archivo.getAbsolutePath());
        }
    }//GEN-LAST:event_btnRutaActionPerformed

    private void cmd_backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_backupActionPerformed
    // TODO add your handling code here:
    /*try{
            String nameBackup = new String(txtBackup.getText());
            String nameBD = new String(txtNombreBD.getText());
            String ruta = new String(txtRuta.getText());
            Runtime.getRuntime().exec("cmd /c start cmd.exe /k \" pg_dump -U postgres -W -h localhost "+nameBD+" > "+ruta+nameBackup+".sql && exit");
            //Runtime.getRuntime().exec("cmd /c start copy C:\\Users\\rherr\\Downloads\\prueba\\"+nameBackup+".sql C:\\Users\\rherr");

    }catch(IOException e){
        
    }*/
    if(cb_db.getSelectedItem().equals("SQLServer")){
        //sql server
        //Backup-SqlDatabase -ServerInstance DESKTOP-MCNU6R0 -Database <nameBD> -BackupAction Database -Backupfile <nameBackup.bak>
        try{
                String nameBackup = new String(txtBackup.getText());
                String nameBD = new String(txtNombreBD.getText());
                String ruta = new String(txtRuta.getText());
                txtComand.setText("Backup-SqlDatabase -ServerInstance DESKTOP-MCNU6R0 -Database "+nameBD+" -BackupAction Database -Backupfile "+nameBackup+".bak");
                Runtime.getRuntime().exec("cmd /c start cmd.exe /k \" powershell start-process powershell && exit");
                //Runtime.getRuntime().exec("cmd /c start copy C:\\Users\\rherr\\Downloads\\prueba\\"+nameBackup+".sql C:\\Users\\rherr");

        }catch(IOException e){

        }    
    }else if(cb_db.getSelectedItem().equals("PostgresSQL")){
        try{
                String nameBackup = new String(txtBackup.getText());
                String nameBD = new String(txtNombreBD.getText());
                String ruta = new String(txtRuta.getText());
                Runtime.getRuntime().exec("cmd /c start cmd.exe /k \" pg_dump -U postgres -W -h localhost "+nameBD+" > "+ruta+nameBackup+".sql && exit");
                //Runtime.getRuntime().exec("cmd /c start copy C:\\Users\\rherr\\Downloads\\prueba\\"+nameBackup+".sql C:\\Users\\rherr");

        }catch(IOException e){

        }    
    }else if(cb_db.getSelectedItem().equals("MySQl")){
        try{
                String nameBackup = new String(txtBackup.getText());
                String nameBD = new String(txtNombreBD.getText());
                String ruta = new String(txtRuta.getText());
                Runtime.getRuntime().exec("cmd /c start cmd.exe /k \" mysqldump -u root -p "+nameBD+" > "+ruta+nameBackup+".sql");
                //Runtime.getRuntime().exec("cmd /c start copy C:\\Users\\rherr\\Downloads\\prueba\\"+nameBackup+".sql C:\\Users\\rherr");

        }catch(IOException e){

        }    
    }else if(cb_db.getSelectedItem().equals("Oracle")){
        try{
                String nameBackup = new String(txtBackup.getText());
                String nameBD = new String(txtNombreBD.getText());
                String ruta = new String(txtRuta.getText());
                txtComand.setText("backup database plus archivelog delete input;");
                Runtime.getRuntime().exec("cmd /c start cmd.exe /k \" rman target syselse");
                //list backup;
                //show all;
                //backup database plus archivelog delete input;
                //Runtime.getRuntime().exec("cmd /c start copy C:\\Users\\rherr\\Downloads\\prueba\\"+nameBackup+".sql C:\\Users\\rherr");

        }catch(IOException e){

        }    
    }

    }//GEN-LAST:event_cmd_backupActionPerformed

    private void cmd_restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_restoreActionPerformed

        // TODO add your handling code here:
    /*try{
            //Runtime.getRuntime().exec("cmd /c start ");
            String nameBackup = new String(txtBackup.getText());
            String nameBD = new String(txtNombreBD.getText());
            String ruta = new String(txtRuta.getText());
            
                    //Runtime.getRuntime().exec("cmd /c start cd C:/Users/rherr/Downloads/PFbaseDeDatosII/PFBDII && exit");
            Runtime.getRuntime().exec("cmd /c start cmd.exe /k \" psql -h localhost -p 5432 -U postgres -f "+ruta+" "+nameBD+" && exit");

    }catch(IOException e){
        
    }*/
    if(cb_db.getSelectedItem().equals("SQLServer")){
        //Restore database <nameBD> from disk='C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\Backup\<nameBackup.bak>' with replace
        try{
                String nameBackup = new String(txtBackup.getText());
                String nameBD = new String(txtNombreBD.getText());
                String ruta = new String(txtRuta.getText());
                txtComand.setText("Restore database "+nameBD+" from disk='C:\\Program Files\\Microsoft SQL Server\\MSSQL16.MSSQLSERVER\\MSSQL\\Backup\\"+nameBackup+".bak' with replace");
                Runtime.getRuntime().exec("cmd /c start cmd.exe /k \" sqlcmd -S DESKTOP-MCNU6R0 && exit");
                //Runtime.getRuntime().exec("cmd /c start copy C:\\Users\\rherr\\Downloads\\prueba\\"+nameBackup+".sql C:\\Users\\rherr");

        }catch(IOException e){

        }    
    }else if(cb_db.getSelectedItem().equals("PostgresSQL")){
        try{
                //Runtime.getRuntime().exec("cmd /c start ");
                String nameBackup = new String(txtBackup.getText());
                String nameBD = new String(txtNombreBD.getText());
                String ruta = new String(txtRuta.getText());

                        //Runtime.getRuntime().exec("cmd /c start cd C:/Users/rherr/Downloads/PFbaseDeDatosII/PFBDII && exit");
                Runtime.getRuntime().exec("cmd /c start cmd.exe /k \" psql -h localhost -p 5432 -U postgres -f "+ruta+" "+nameBD+" && exit");

        }catch(IOException e){

        }    
    }else if(cb_db.getSelectedItem().equals("MySQl")){
        try{
                //Runtime.getRuntime().exec("cmd /c start ");
                String nameBackup = new String(txtBackup.getText());
                String nameBD = new String(txtNombreBD.getText());
                String ruta = new String(txtRuta.getText());

                        //Runtime.getRuntime().exec("cmd /c start cd C:/Users/rherr/Downloads/PFbaseDeDatosII/PFBDII && exit");
                Runtime.getRuntime().exec("cmd /c start cmd.exe /k \" mysql -u root -p "+nameBD+" < "+ruta);

        }catch(IOException e){

        }    
    }
    }//GEN-LAST:event_cmd_restoreActionPerformed

    private void cmd_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_LimpiarActionPerformed
        txtNombreBD.setText("");
        txtBackup.setText("");
        txtComand.setText("");
        txtRuta.setText("");
    }//GEN-LAST:event_cmd_LimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Backups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Backups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Backups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Backups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Backups().setVisible(true);
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Backups.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Backups.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Backups.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Backups.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRuta;
    private javax.swing.JComboBox<String> cb_db;
    private javax.swing.JButton cmd_Limpiar;
    private javax.swing.JButton cmd_backup;
    private javax.swing.JButton cmd_regresar;
    private javax.swing.JButton cmd_restore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_db;
    private javax.swing.JLabel lbl_txt;
    private javax.swing.JTextField txtBackup;
    private javax.swing.JTextField txtComand;
    private javax.swing.JTextField txtNombreBD;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables

class fondoBl extends JPanel
            
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
          imagen = new ImageIcon(getClass().getResource("/Imagenes/FondoB.jpg")).getImage();
          g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
          setOpaque(false);
          
          super.paint(g);
        }
    }
    
    
    class fondoP extends JPanel
            
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
          imagen = new ImageIcon(getClass().getResource("/Imagenes/FondoN.jpg")).getImage();
          g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
          setOpaque(false);
          
          super.paint(g);
        }
    }



}
