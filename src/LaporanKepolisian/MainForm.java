package LaporanKepolisian;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
        InformasiFrame frame = new InformasiFrame();
        DeskPane.removeAll();
        DeskPane.repaint();
        DeskPane.revalidate();
        
        DeskPane.add(frame);
        DeskPane.repaint();
        DeskPane.revalidate();
        frame.setVisible(true);
        frame.setLocation(20, 35);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeskPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        InformasiMenu = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        LaporanKejahatanMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        dataLaporanMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kepolisian Republik Indonesia");

        javax.swing.GroupLayout DeskPaneLayout = new javax.swing.GroupLayout(DeskPane);
        DeskPane.setLayout(DeskPaneLayout);
        DeskPaneLayout.setHorizontalGroup(
            DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1175, Short.MAX_VALUE)
        );
        DeskPaneLayout.setVerticalGroup(
            DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenu3.setText("Menu");

        InformasiMenu.setText("Informasi");
        InformasiMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformasiMenuActionPerformed(evt);
            }
        });
        jMenu3.add(InformasiMenu);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Layanan");

        LaporanKejahatanMenu.setText("Laporan Kejahatan");
        LaporanKejahatanMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanKejahatanMenuActionPerformed(evt);
            }
        });
        jMenu1.add(LaporanKejahatanMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Data");

        dataLaporanMenu.setText("Data Laporan Kejahatan");
        dataLaporanMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataLaporanMenuActionPerformed(evt);
            }
        });
        jMenu2.add(dataLaporanMenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DeskPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InformasiMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformasiMenuActionPerformed
        InformasiFrame frame = new InformasiFrame();
        DeskPane.removeAll();
        DeskPane.repaint();
        DeskPane.revalidate();
        
        DeskPane.add(frame);
        DeskPane.repaint();
        DeskPane.revalidate();
        frame.setVisible(true);
        frame.setLocation(20, 35);
    }//GEN-LAST:event_InformasiMenuActionPerformed

    private void LaporanKejahatanMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanKejahatanMenuActionPerformed
        LaporanKejahatanFrame frame = new LaporanKejahatanFrame();
        DeskPane.removeAll();
        DeskPane.repaint();
        DeskPane.revalidate();
        
        DeskPane.add(frame);
        DeskPane.repaint();
        DeskPane.revalidate();
        frame.setVisible(true);
        frame.setLocation(70, 20);
    }//GEN-LAST:event_LaporanKejahatanMenuActionPerformed

    private void dataLaporanMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataLaporanMenuActionPerformed
        DataLaporanKejahatan_Frame frame = new DataLaporanKejahatan_Frame();
        DeskPane.removeAll();
        DeskPane.repaint();
        DeskPane.revalidate();
        
        DeskPane.add(frame);
        DeskPane.repaint();
        DeskPane.revalidate();
        frame.setVisible(true);
        frame.setLocation(80, 40);
    }//GEN-LAST:event_dataLaporanMenuActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane DeskPane;
    private javax.swing.JMenuItem InformasiMenu;
    private javax.swing.JMenuItem LaporanKejahatanMenu;
    private javax.swing.JMenuItem dataLaporanMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

