/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.Controller;
import Model.User;

public class Murid extends javax.swing.JFrame {

    /**
     * Creates new form Murid
     */
    public Murid() {
        initComponents();
         String n = getTitle();
         fieldNama.setText(n);
        
    }
    
    public Murid(String username,String password) {
        initComponents();
         String n = getTitle();
         fieldNama.setText(n);
         User users = Controller.getSiswa(username, password);
         System.out.println(users);
         fieldNama.setText(users.getNama());
         fieldNama.setEditable(false);
         fieldIpa.setText(String.valueOf(users.getNilaiIpa()));
         fieldIpa.setEditable(false);
         fieldIps.setText(String.valueOf(users.getNilaiIps()));
         fieldIps.setEditable(false);
         fieldIndo.setText(String.valueOf(users.getNilaiIndo()));
         fieldIndo.setEditable(false);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        fieldNama = new javax.swing.JTextField();
        Nama = new javax.swing.JLabel();
        fieldIpa = new javax.swing.JTextField();
        NilaiIpa = new javax.swing.JLabel();
        NilaiIps = new javax.swing.JLabel();
        fieldIps = new javax.swing.JTextField();
        fieldIndo = new javax.swing.JTextField();
        NilaiIndo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");

        fieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaActionPerformed(evt);
            }
        });

        Nama.setText("Nama");

        NilaiIpa.setText("Nilai Ipa");

        NilaiIps.setText("Nilai Ips");

        fieldIndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIndoActionPerformed(evt);
            }
        });

        NilaiIndo.setText("Nilai Bhs. Indonesia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NilaiIpa)
                            .addComponent(Nama)
                            .addComponent(NilaiIps)
                            .addComponent(NilaiIndo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldIndo)
                            .addComponent(fieldIpa)
                            .addComponent(fieldNama)
                            .addComponent(fieldIps, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldIpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldIps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldIndo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nama)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NilaiIpa)
                                        .addGap(33, 33, 33))
                                    .addComponent(NilaiIps))
                                .addGap(33, 33, 33))
                            .addComponent(NilaiIndo, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaActionPerformed
        // TODO add your handling code here:
        
//        DefaultTableModel view = (DefaultTableModel)tabel.getModel();
//        for(int i = 1; i < Controller.user.size(); i++){
//            view.addRow(new Object[]{Controller.user.get(i).getNama(),
//            Controller.user.get(i).getNilaiIpa(),Controller.user.get(i).getNilaiIps(),
//            Controller.user.get(i).getNilaiIndo()});
//        }
    }//GEN-LAST:event_fieldNamaActionPerformed

    private void fieldIndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIndoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIndoActionPerformed

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
            java.util.logging.Logger.getLogger(Murid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Murid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Murid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Murid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Murid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel NilaiIndo;
    private javax.swing.JLabel NilaiIpa;
    private javax.swing.JLabel NilaiIps;
    private javax.swing.JTextField fieldIndo;
    private javax.swing.JTextField fieldIpa;
    private javax.swing.JTextField fieldIps;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
