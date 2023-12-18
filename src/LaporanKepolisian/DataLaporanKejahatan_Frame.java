package LaporanKepolisian;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class DataLaporanKejahatan_Frame extends javax.swing.JInternalFrame {

    public DataLaporanKejahatan_Frame() {
        initComponents();
        refreshTabel();
    }
    
    private void refreshTabel() {
        Thread tr = new Thread(new Runnable() {
            @Override
            public void run() {
                JTableHeader header = tabelLaporan.getTableHeader();
                header.setFont(new Font("Dialog", Font.BOLD, 12));
                tabelLaporan.setModel(DataHelper.getDataPelaporModel());
                tabelLaporan.setShowGrid(true);
                tabelLaporan.setRowHeight(40);
                setSizeTabel();
            }
        });
        tr.start();
    }
    
    private void setSizeTabel() {
        //1024
        
        //NO
        TableColumn col1 = tabelLaporan.getColumnModel().getColumn(0);
        col1.setPreferredWidth(50);
        
        //ID
        TableColumn col5 = tabelLaporan.getColumnModel().getColumn(1);
        col5.setPreferredWidth(100);
        
        //Nama 
        TableColumn col2 = tabelLaporan.getColumnModel().getColumn(2);
        col2.setPreferredWidth(300);
        
        //Jenis Kelamin
        TableColumn col4 = tabelLaporan.getColumnModel().getColumn(3);
        col4.setPreferredWidth(100);
       
        //Umur
        TableColumn col6 = tabelLaporan.getColumnModel().getColumn(4);
        col6.setPreferredWidth(100);
        
        //Pekerjaan
        TableColumn col7 = tabelLaporan.getColumnModel().getColumn(5);
        col7.setPreferredWidth(100);
        
        //Alamat
        TableColumn col8 = tabelLaporan.getColumnModel().getColumn(6);
        col8.setPreferredWidth(256);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelLaporan = new javax.swing.JTable();
        tampilBtn = new javax.swing.JButton();
        hapusBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Data Laporan");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabelLaporan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "ID", "Nama Pelapor", "Jenis Kelamin", "Umur", "Pekerjaan", "Alamat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelLaporan);

        tampilBtn.setBackground(new java.awt.Color(139, 69, 19));
        tampilBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tampilBtn.setForeground(new java.awt.Color(255, 255, 255));
        tampilBtn.setText("Tampilkan Data");
        tampilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilBtnActionPerformed(evt);
            }
        });

        hapusBtn.setBackground(new java.awt.Color(139, 69, 19));
        hapusBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        hapusBtn.setForeground(new java.awt.Color(255, 255, 255));
        hapusBtn.setText("Hapus Data");
        hapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBtnActionPerformed(evt);
            }
        });

        refreshBtn.setBackground(new java.awt.Color(139, 69, 19));
        refreshBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        closeBtn.setBackground(new java.awt.Color(139, 69, 19));
        closeBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(tampilBtn)
                .addGap(30, 30, 30)
                .addComponent(hapusBtn)
                .addGap(31, 31, 31)
                .addComponent(refreshBtn)
                .addGap(30, 30, 30)
                .addComponent(closeBtn)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapusBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tampilBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
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

    private void tampilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilBtnActionPerformed
        int row = tabelLaporan.getSelectedRow();
        if(row != -1) {
            String id = tabelLaporan.getValueAt(row, 1).toString();
            String namaPelapor = tabelLaporan.getValueAt(row, 2).toString();
            TampilkanData_Frame frame = new TampilkanData_Frame(id);
            MainForm.DeskPane.repaint();
            MainForm.DeskPane.revalidate();
            
            MainForm.DeskPane.add(frame);
            MainForm.DeskPane.repaint();
            MainForm.DeskPane.revalidate();
            frame.setVisible(true);
            frame.setLocation(200, 120);
            frame.setTitle("Data Laporan dari : " + namaPelapor);
        } else {
            JOptionPane.showMessageDialog(this, "Harap Pilih Data yang ingin ditampilkan");
        }
    }//GEN-LAST:event_tampilBtnActionPerformed

    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBtnActionPerformed
        int row = tabelLaporan.getSelectedRow();
        if(row != -1) {
            Thread tr = new Thread(new Runnable() {
                @Override
                public void run() {
                    String id = tabelLaporan.getValueAt(row, 1).toString();
                    DataHelper.hapusData(id);
                    refreshTabel();
                }
            });
            tr.start();
        } else {
            JOptionPane.showMessageDialog(this, "Harap Pilih Data yang ingin dihapus");
        }
        
    }//GEN-LAST:event_hapusBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        refreshTabel();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        dispose();
    }//GEN-LAST:event_closeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTable tabelLaporan;
    private javax.swing.JButton tampilBtn;
    // End of variables declaration//GEN-END:variables
}

