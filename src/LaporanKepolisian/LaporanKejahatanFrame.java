package LaporanKepolisian;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LaporanKejahatanFrame extends javax.swing.JInternalFrame {

    ArrayList<JComponent> components;
    String namaPelapor,kelaminPel, umurPel, pekerjaanPel, alamatPel,
           namaTerlapor, kelaminTer, umurTer, pekerjaanTer, alamatTer,
           jenisPeristiwa, waktuKejadian, tempatTerjadi, apaYangTerjadi, bagaimanaTerjadi;
            
    
    /** Creates new form LaporanKejahatanFrame */
    public LaporanKejahatanFrame() {
        initComponents();
        initComp();
    }
    
    private void initComp() {
        components = new ArrayList<>();
        components.add(NamaPelaporTF);
        components.add(umurTF);
        components.add(pekerjaanTF);
        components.add(alamatTF);
        
        components.add(NamaTerlaporTF1);
        components.add(umurTerTF);
        components.add(pekerjaanTerTF);
        components.add(alamatTerTF);
        
        components.add(jenisPeristiwaBox);
        components.add(waktuKejadianTF);
        components.add(tempatKejadianTF);
        components.add(ApaYangTerjadiArea);
        components.add(BagaimanaTerjadiArea);
        
    }
    
    private void getAllData() {
        namaPelapor = NamaPelaporTF.getText();
        if(lakiBtn.isSelected()) {
            kelaminPel = lakiBtn.getText();
        } else if(perempuanBtn.isSelected()) {
            kelaminPel = perempuanBtn.getText();
        }
        umurPel = umurTF.getText();
        pekerjaanPel = pekerjaanTF.getText();
        alamatPel = alamatTF.getText();
        
        namaTerlapor = NamaTerlaporTF1.getText();
        if(lakiTerBtn.isSelected()) {
            kelaminTer = lakiTerBtn.getText();
        } else if(perempuanTerBtn.isSelected()) {
            kelaminTer = perempuanTerBtn.getText();
        }
        umurTer = umurTerTF.getText();
        pekerjaanTer = pekerjaanTerTF.getText();
        alamatTer = alamatTerTF.getText();
        
        jenisPeristiwa = jenisPeristiwaBox.getSelectedItem().toString();
        waktuKejadian = waktuKejadianTF.getText();
        tempatTerjadi = tempatKejadianTF.getText();
        apaYangTerjadi = ApaYangTerjadiArea.getText();
        bagaimanaTerjadi = BagaimanaTerjadiArea.getText();
    }
    
    private void clearAll() {
        NamaPelaporTF.setText("");
        buttonGroup1.clearSelection();
        umurTF.setText("");
        pekerjaanTF.setText("");
        alamatTF.setText("");
        
        NamaTerlaporTF1.setText("");
        buttonGroup2.clearSelection();
        umurTerTF.setText("");
        pekerjaanTerTF.setText("");
        alamatTerTF.setText("");
        
        waktuKejadianTF.setText("");
        tempatKejadianTF.setText("");
        ApaYangTerjadiArea.setText("");
        BagaimanaTerjadiArea.setText("");
    }
    
    private boolean checkInputan() {
        int i = 0;
        for (JComponent component : components) {
            if(component instanceof JTextField) {
                if(((JTextField) component).getText().equals("")) {
                    component.requestFocus();
                    gotoPanel(i);
                    return false;
                }
            } else if(component instanceof JTextArea) {
                if(((JTextArea) component).getText().equals("")) {
                    component.requestFocus();
                    gotoPanel(i);
                    return false;
                }
            } else if(component instanceof JComboBox) {
                if(((JComboBox) component).getSelectedIndex() == 0) {
                    component.requestFocus();
                    gotoPanel(i);
                    return false;
                }
            }
            i++;
        }
        return true;
    }
    
    private void gotoPanel(int i) {
        String msg = "";
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        if(i < 4) {
            ContentPanel.add(DataPelaporPanel);
            msg = "Harap Mengisi Semua kolom diData Pelapor";
        } else if(i < 8) {
            ContentPanel.add(DataTerlaporPanel);
            msg = "Harap Mengisi Semua kolom diData Terlapor";
        } else if(i < 13) {
            ContentPanel.add(DataPeristiwaPanel);
            msg = "Harap Mengisi Semua kolom diData Peristiwa";
        }
        ContentPanel.repaint();
        ContentPanel.revalidate();
        JOptionPane.showMessageDialog(this, msg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        SideBarPanel = new javax.swing.JPanel();
        DataPelaporBtn = new javax.swing.JButton();
        DataTerlaporBtn = new javax.swing.JButton();
        DataPerisiwaBtn = new javax.swing.JButton();
        FinalisasiBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        ContentPanel = new javax.swing.JPanel();
        DataPelaporPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NamaPelaporTF = new javax.swing.JTextField();
        lakiBtn = new javax.swing.JRadioButton();
        perempuanBtn = new javax.swing.JRadioButton();
        umurTF = new javax.swing.JTextField();
        pekerjaanTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatTF = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        DataTerlaporPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        NamaTerlaporTF1 = new javax.swing.JTextField();
        lakiTerBtn = new javax.swing.JRadioButton();
        perempuanTerBtn = new javax.swing.JRadioButton();
        pekerjaanTerTF = new javax.swing.JTextField();
        umurTerTF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamatTerTF = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        DataPeristiwaPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        waktuKejadianTF = new javax.swing.JTextField();
        tempatKejadianTF = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        BagaimanaTerjadiArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        ApaYangTerjadiArea = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jenisPeristiwaBox = new javax.swing.JComboBox<>();
        FinalisasiPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        setujuBox = new javax.swing.JCheckBox();
        SimpanBtn = new javax.swing.JButton();

        setClosable(true);
        setTitle("Form Laporan");

        MainPanel.setLayout(new java.awt.BorderLayout());

        SideBarPanel.setBackground(new java.awt.Color(153, 153, 153));

        DataPelaporBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DataPelaporBtn.setText("Data Pelapor");
        DataPelaporBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPelaporBtnActionPerformed(evt);
            }
        });

        DataTerlaporBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DataTerlaporBtn.setText("Data Terlapor");
        DataTerlaporBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataTerlaporBtnActionPerformed(evt);
            }
        });

        DataPerisiwaBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DataPerisiwaBtn.setText("Data Peristiwa");
        DataPerisiwaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPerisiwaBtnActionPerformed(evt);
            }
        });

        FinalisasiBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FinalisasiBtn.setText("Finalisasi");
        FinalisasiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalisasiBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        closeBtn.setText("close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SideBarPanelLayout = new javax.swing.GroupLayout(SideBarPanel);
        SideBarPanel.setLayout(SideBarPanelLayout);
        SideBarPanelLayout.setHorizontalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGroup(SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SideBarPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DataTerlaporBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataPelaporBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataPerisiwaBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(FinalisasiBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                    .addGroup(SideBarPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        SideBarPanelLayout.setVerticalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(DataPelaporBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(DataTerlaporBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(DataPerisiwaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(FinalisasiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(clearBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeBtn)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        MainPanel.add(SideBarPanel, java.awt.BorderLayout.LINE_START);

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setLayout(new java.awt.CardLayout());

        DataPelaporPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Jenis Kelamin");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nama Pelapor");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Umur");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pekerjaan");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Alamat");

        NamaPelaporTF.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        buttonGroup1.add(lakiBtn);
        lakiBtn.setText("Laki-laki");

        buttonGroup1.add(perempuanBtn);
        perempuanBtn.setText("perempuan");

        umurTF.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        pekerjaanTF.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        alamatTF.setColumns(20);
        alamatTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        alamatTF.setLineWrap(true);
        alamatTF.setRows(5);
        alamatTF.setWrapStyleWord(true);
        jScrollPane1.setViewportView(alamatTF);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Data Pelapor");

        javax.swing.GroupLayout DataPelaporPanelLayout = new javax.swing.GroupLayout(DataPelaporPanel);
        DataPelaporPanel.setLayout(DataPelaporPanelLayout);
        DataPelaporPanelLayout.setHorizontalGroup(
            DataPelaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPelaporPanelLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(DataPelaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DataPelaporPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(DataPelaporPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NamaPelaporTF, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DataPelaporPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(umurTF, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DataPelaporPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lakiBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(perempuanBtn))
                    .addGroup(DataPelaporPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pekerjaanTF, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPelaporPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(344, 344, 344))
        );
        DataPelaporPanelLayout.setVerticalGroup(
            DataPelaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPelaporPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(58, 58, 58)
                .addGroup(DataPelaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamaPelaporTF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(DataPelaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lakiBtn)
                    .addComponent(perempuanBtn))
                .addGap(26, 26, 26)
                .addGroup(DataPelaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(umurTF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(DataPelaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pekerjaanTF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(DataPelaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        ContentPanel.add(DataPelaporPanel, "card2");

        DataTerlaporPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nama Terlapor");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Umur");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Jenis Kelamin");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Alamat");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Pekerjaan");

        NamaTerlaporTF1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        buttonGroup2.add(lakiTerBtn);
        lakiTerBtn.setText("Laki-laki");

        buttonGroup2.add(perempuanTerBtn);
        perempuanTerBtn.setText("Perempuan");

        pekerjaanTerTF.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        umurTerTF.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        alamatTerTF.setColumns(20);
        alamatTerTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        alamatTerTF.setLineWrap(true);
        alamatTerTF.setRows(5);
        alamatTerTF.setWrapStyleWord(true);
        jScrollPane2.setViewportView(alamatTerTF);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Data Terlapor");

        javax.swing.GroupLayout DataTerlaporPanelLayout = new javax.swing.GroupLayout(DataTerlaporPanel);
        DataTerlaporPanel.setLayout(DataTerlaporPanelLayout);
        DataTerlaporPanelLayout.setHorizontalGroup(
            DataTerlaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataTerlaporPanelLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(DataTerlaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DataTerlaporPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(DataTerlaporPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lakiTerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(perempuanTerBtn))
                    .addGroup(DataTerlaporPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NamaTerlaporTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DataTerlaporPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(umurTerTF, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DataTerlaporPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pekerjaanTerTF, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(DataTerlaporPanelLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DataTerlaporPanelLayout.setVerticalGroup(
            DataTerlaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataTerlaporPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(52, 52, 52)
                .addGroup(DataTerlaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamaTerlaporTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(DataTerlaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lakiTerBtn)
                    .addComponent(perempuanTerBtn))
                .addGap(27, 27, 27)
                .addGroup(DataTerlaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(umurTerTF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(DataTerlaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pekerjaanTerTF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(DataTerlaporPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        ContentPanel.add(DataTerlaporPanel, "card3");

        DataPeristiwaPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Tempat Kejadian");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Waktu Kejadian");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Bagaimana Terjadi");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Apa Yang Terjadi");

        waktuKejadianTF.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        tempatKejadianTF.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        BagaimanaTerjadiArea.setColumns(20);
        BagaimanaTerjadiArea.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BagaimanaTerjadiArea.setLineWrap(true);
        BagaimanaTerjadiArea.setRows(5);
        BagaimanaTerjadiArea.setWrapStyleWord(true);
        jScrollPane3.setViewportView(BagaimanaTerjadiArea);

        ApaYangTerjadiArea.setColumns(20);
        ApaYangTerjadiArea.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ApaYangTerjadiArea.setLineWrap(true);
        ApaYangTerjadiArea.setRows(5);
        ApaYangTerjadiArea.setWrapStyleWord(true);
        jScrollPane4.setViewportView(ApaYangTerjadiArea);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setText("Data Peristiwa");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Jenis Peristiwa");

        jenisPeristiwaBox.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jenisPeristiwaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Perampokan", "Pemerkosaan", "Penculikan", "Pembegalan", "Pembunuhan", "Pencemaran Nama Baik" }));

        javax.swing.GroupLayout DataPeristiwaPanelLayout = new javax.swing.GroupLayout(DataPeristiwaPanel);
        DataPeristiwaPanel.setLayout(DataPeristiwaPanelLayout);
        DataPeristiwaPanelLayout.setHorizontalGroup(
            DataPeristiwaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPeristiwaPanelLayout.createSequentialGroup()
                .addGap(0, 131, Short.MAX_VALUE)
                .addGroup(DataPeristiwaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPeristiwaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(336, 336, 336))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPeristiwaPanelLayout.createSequentialGroup()
                        .addGroup(DataPeristiwaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DataPeristiwaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DataPeristiwaPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(DataPeristiwaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(DataPeristiwaPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jenisPeristiwaBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(DataPeristiwaPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(waktuKejadianTF, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(DataPeristiwaPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane4))
                                    .addGroup(DataPeristiwaPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tempatKejadianTF, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(110, 110, 110))))
        );
        DataPeristiwaPanelLayout.setVerticalGroup(
            DataPeristiwaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPeristiwaPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(DataPeristiwaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jenisPeristiwaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DataPeristiwaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waktuKejadianTF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DataPeristiwaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempatKejadianTF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(DataPeristiwaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DataPeristiwaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        ContentPanel.add(DataPeristiwaPanel, "card4");

        FinalisasiPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel18.setText("*Note : periksa kembali data-data yang telah anda masukkan sebelum melakukan finalisasi");

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("DENGAN INI SAYA MENYATAKAN BAHWA SAYA MELAPORKAN KEJADIAN INI DENGAN SEJUJUR-JUJURNYA, DAN APABILA TERNYATA LAPORAN INI BERSIFAT PALSU, MAKA SAYA SIAP MENERIMA SEGALA SANKSI YANG AKAN DIKENAKAN KEPADA SAYA");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextArea1);

        setujuBox.setText("Setuju");

        SimpanBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SimpanBtn.setText("Simpan");
        SimpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FinalisasiPanelLayout = new javax.swing.GroupLayout(FinalisasiPanel);
        FinalisasiPanel.setLayout(FinalisasiPanelLayout);
        FinalisasiPanelLayout.setHorizontalGroup(
            FinalisasiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinalisasiPanelLayout.createSequentialGroup()
                .addGroup(FinalisasiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FinalisasiPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(FinalisasiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(setujuBox)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FinalisasiPanelLayout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(SimpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FinalisasiPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(103, 103, 103))
        );
        FinalisasiPanelLayout.setVerticalGroup(
            FinalisasiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinalisasiPanelLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setujuBox)
                .addGap(92, 92, 92)
                .addComponent(SimpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        ContentPanel.add(FinalisasiPanel, "card5");

        MainPanel.add(ContentPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataPelaporBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPelaporBtnActionPerformed
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        
        ContentPanel.add(DataPelaporPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_DataPelaporBtnActionPerformed

    private void DataTerlaporBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataTerlaporBtnActionPerformed
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        
        ContentPanel.add(DataTerlaporPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_DataTerlaporBtnActionPerformed

    private void DataPerisiwaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPerisiwaBtnActionPerformed
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        
        ContentPanel.add(DataPeristiwaPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_DataPerisiwaBtnActionPerformed

    private void FinalisasiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalisasiBtnActionPerformed
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        
        ContentPanel.add(FinalisasiPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_FinalisasiBtnActionPerformed

    private void SimpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanBtnActionPerformed
        boolean isComplete = checkInputan();
        if(isComplete) {
            if(setujuBox.isSelected()) {
                try {
                    getAllData();
                    DataHelper.MasukkanDataPelapor(namaPelapor, kelaminPel, umurPel, pekerjaanPel, alamatPel);
                    DataHelper.MasukkanDataTerlapor(namaTerlapor, kelaminTer, umurTer, pekerjaanTer, alamatTer);
                    DataHelper.MasukkanDataPeristiwa(jenisPeristiwa, waktuKejadian, tempatTerjadi, apaYangTerjadi, bagaimanaTerjadi);
                } catch (Exception e) {
                    System.out.println("ERROR : " + e.getMessage());
                }                
            } else {
                JOptionPane.showMessageDialog(this, "Harap Centang Setuju !");
            }
        }
    }//GEN-LAST:event_SimpanBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearAll();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        dispose();
    }//GEN-LAST:event_closeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ApaYangTerjadiArea;
    private javax.swing.JTextArea BagaimanaTerjadiArea;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JButton DataPelaporBtn;
    private javax.swing.JPanel DataPelaporPanel;
    private javax.swing.JButton DataPerisiwaBtn;
    private javax.swing.JPanel DataPeristiwaPanel;
    private javax.swing.JButton DataTerlaporBtn;
    private javax.swing.JPanel DataTerlaporPanel;
    private javax.swing.JButton FinalisasiBtn;
    private javax.swing.JPanel FinalisasiPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField NamaPelaporTF;
    private javax.swing.JTextField NamaTerlaporTF1;
    private javax.swing.JPanel SideBarPanel;
    private javax.swing.JButton SimpanBtn;
    private javax.swing.JTextArea alamatTF;
    private javax.swing.JTextArea alamatTerTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> jenisPeristiwaBox;
    private javax.swing.JRadioButton lakiBtn;
    private javax.swing.JRadioButton lakiTerBtn;
    private javax.swing.JTextField pekerjaanTF;
    private javax.swing.JTextField pekerjaanTerTF;
    private javax.swing.JRadioButton perempuanBtn;
    private javax.swing.JRadioButton perempuanTerBtn;
    private javax.swing.JCheckBox setujuBox;
    private javax.swing.JTextField tempatKejadianTF;
    private javax.swing.JTextField umurTF;
    private javax.swing.JTextField umurTerTF;
    private javax.swing.JTextField waktuKejadianTF;
    // End of variables declaration//GEN-END:variables

}
