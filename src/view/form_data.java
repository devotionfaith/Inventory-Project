/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JTable;
import controller.DataSepatuController;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class form_data extends javax.swing.JFrame {

    /**
     * Creates new form form_data
     */
    DataSepatuController dc;
    String cari;
    public form_data() {
        initComponents();
        dc = new DataSepatuController(this);
        dc.showtabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelData = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        InputId = new javax.swing.JTextField();
        InputNama = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        InputBrand = new javax.swing.JTextField();
        InputUkuran = new javax.swing.JTextField();
        InputWarna = new javax.swing.JTextField();
        InputJumlah = new javax.swing.JTextField();
        InputHarga = new javax.swing.JTextField();
        ButtonReset = new javax.swing.JButton();
        ButtonUbah = new javax.swing.JButton();
        ButtonTambah = new javax.swing.JButton();
        ButtonHapus = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        RBNama = new javax.swing.JRadioButton();
        RBBrand = new javax.swing.JRadioButton();
        RBUkuran = new javax.swing.JRadioButton();
        RBWarna = new javax.swing.JRadioButton();
        InputSearch = new javax.swing.JTextField();
        ButtonSearch = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ButtonLogOut = new javax.swing.JButton();
        ButtonShow = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LIST DATA SEPATU");

        TabelData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama", "Brand", "Ukuran", "Warna", "Jumlah", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelData);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Jumlah  ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID          ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nama    ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Brand    ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ukuran   ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Warna   ");

        InputId.setEditable(false);
        InputId.setToolTipText("");
        InputId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputIdActionPerformed(evt);
            }
        });

        InputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNamaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Harga   ");

        InputBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputBrandActionPerformed(evt);
            }
        });

        InputUkuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputUkuranActionPerformed(evt);
            }
        });

        InputWarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputWarnaActionPerformed(evt);
            }
        });

        InputJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputJumlahActionPerformed(evt);
            }
        });

        InputHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputHargaActionPerformed(evt);
            }
        });

        ButtonReset.setText("Reset");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });

        ButtonUbah.setBackground(new java.awt.Color(204, 204, 255));
        ButtonUbah.setText("Ubah");
        ButtonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUbahActionPerformed(evt);
            }
        });

        ButtonTambah.setBackground(new java.awt.Color(204, 255, 204));
        ButtonTambah.setText("Tambah");
        ButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambahActionPerformed(evt);
            }
        });

        ButtonHapus.setBackground(new java.awt.Color(255, 204, 204));
        ButtonHapus.setText("Hapus");
        ButtonHapus.setToolTipText("");
        ButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InputId)
                                    .addComponent(InputNama, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(InputBrand)
                                    .addComponent(InputUkuran)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InputHarga)
                                    .addComponent(InputWarna)
                                    .addComponent(InputJumlah)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(65, 105, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonUbah)
                            .addComponent(ButtonReset))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonTambah, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonHapus, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(InputId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(InputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(InputBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(InputUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(InputWarna, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(InputHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonReset)
                    .addComponent(ButtonTambah))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonHapus)
                    .addComponent(ButtonUbah))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EDIT", jPanel2);

        jLabel10.setText("Cari berdasarkan :");

        buttonGroup1.add(RBNama);
        RBNama.setText("Nama");
        RBNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBNamaActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBBrand);
        RBBrand.setText("Brand");
        RBBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBBrandActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBUkuran);
        RBUkuran.setText("Ukuran");
        RBUkuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBUkuranActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBWarna);
        RBWarna.setText("Warna");
        RBWarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBWarnaActionPerformed(evt);
            }
        });

        ButtonSearch.setText("Cari");
        ButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchActionPerformed(evt);
            }
        });

        jLabel11.setText("Kata Kunci :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(RBBrand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBWarna))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(RBNama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBUkuran))
                    .addComponent(ButtonSearch)
                    .addComponent(InputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBBrand)
                    .addComponent(RBWarna, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBNama)
                    .addComponent(RBUkuran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonSearch)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SEARCH", jPanel4);

        ButtonLogOut.setBackground(new java.awt.Color(255, 51, 51));
        ButtonLogOut.setText("Log Out");
        ButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogOutActionPerformed(evt);
            }
        });

        ButtonShow.setBackground(new java.awt.Color(255, 255, 204));
        ButtonShow.setText("Show Data");
        ButtonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonShow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonLogOut)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(313, 313, 313))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonShow)
                            .addComponent(ButtonLogOut))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDataMouseClicked
        // TODO add your handling code here:
        int row = TabelData.getSelectedRow();
        InputId.setText(TabelData.getValueAt(row, 0).toString());
        InputNama.setText(TabelData.getValueAt(row, 1).toString());
        InputBrand.setText(TabelData.getValueAt(row, 2).toString());
        InputUkuran.setText(TabelData.getValueAt(row, 3).toString());
        InputWarna.setText(TabelData.getValueAt(row, 4).toString());
        InputJumlah.setText(TabelData.getValueAt(row, 5).toString());
        InputHarga.setText(TabelData.getValueAt(row, 6).toString());
    }//GEN-LAST:event_TabelDataMouseClicked

    private void RBNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBNamaActionPerformed

    private void RBBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBBrandActionPerformed

    private void RBWarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBWarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBWarnaActionPerformed
    
    private void ButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchActionPerformed
        // TODO add your handling code here:
        setCari(cari);
        dc.search();
        getInputSearch().setText("");
    }//GEN-LAST:event_ButtonSearchActionPerformed

    private void ButtonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShowActionPerformed
        dc.showtabel();
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonShowActionPerformed

    private void ButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogOutActionPerformed
        // TODO add your handling code here:
        JFrame login_page;
        login_page= new login_page();
        login_page.setVisible(true);
        login_page.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ButtonLogOutActionPerformed

    private void RBUkuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBUkuranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBUkuranActionPerformed

    private void ButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusActionPerformed
        // TODO add your handling code here:
        
        if(InputId.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Data Tidak Ada", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else{
            int option = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    dc.delete();
                    JOptionPane.showMessageDialog(null, "Berhasil Dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
        }
        dc.reset();
        dc.showtabel();
    }//GEN-LAST:event_ButtonHapusActionPerformed

    private void ButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTambahActionPerformed
        if(dc.isDataExist()==true){
            dc.updateJumlah();
            JOptionPane.showMessageDialog(null, "Data Sudah Ada, Jumlah Ditambahkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if(InputNama.getText().equals("")||InputBrand.getText().equals("")||InputUkuran.getText().equals("")
            ||InputWarna.getText().equals("")||InputJumlah.getText().equals("")||InputHarga.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Data Tidak Lengkap", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else{
            dc.insert();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        dc.showtabel();
        dc.reset();
    }//GEN-LAST:event_ButtonTambahActionPerformed

    private void ButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUbahActionPerformed
        // TODO add your handling code here:
        if(InputNama.getText().equals("")||InputBrand.getText().equals("")||InputUkuran.getText().equals("")
            ||InputWarna.getText().equals("")||InputJumlah.getText().equals("")||InputHarga.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Data Tidak Lengkap", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else{
            dc.update();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            dc.showtabel();
            dc.reset();

        }

    }//GEN-LAST:event_ButtonUbahActionPerformed

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
        dc.reset();

    }//GEN-LAST:event_ButtonResetActionPerformed

    private void InputHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputHargaActionPerformed

    private void InputJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputJumlahActionPerformed

    private void InputWarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputWarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputWarnaActionPerformed

    private void InputUkuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUkuranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputUkuranActionPerformed

    private void InputBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputBrandActionPerformed

    private void InputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputNamaActionPerformed

    private void InputIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputIdActionPerformed
    
    public String getCari(){
        cari = null;
        if(RBNama.isSelected()==true){
            cari = "nama";
        }else if(RBBrand.isSelected()==true){
            cari = "brand";
        }else if(RBUkuran.isSelected()==true){
            cari = "ukuran";
        }else if(RBWarna.isSelected()==true){
            cari = "warna";
        }
        return cari;
    }
    
    public void setCari(String cari){
        this.cari = cari;
    }
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_data().setVisible(true);
            }
        });/* Set the Nimbus look and feel */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonHapus;
    private javax.swing.JButton ButtonLogOut;
    private javax.swing.JButton ButtonReset;
    private javax.swing.JButton ButtonSearch;
    private javax.swing.JButton ButtonShow;
    private javax.swing.JButton ButtonTambah;
    private javax.swing.JButton ButtonUbah;
    private javax.swing.JTextField InputBrand;
    private javax.swing.JTextField InputHarga;
    private javax.swing.JTextField InputId;
    private javax.swing.JTextField InputJumlah;
    private javax.swing.JTextField InputNama;
    private javax.swing.JTextField InputSearch;
    private javax.swing.JTextField InputUkuran;
    private javax.swing.JTextField InputWarna;
    private javax.swing.JRadioButton RBBrand;
    private javax.swing.JRadioButton RBNama;
    private javax.swing.JRadioButton RBUkuran;
    private javax.swing.JRadioButton RBWarna;
    private javax.swing.JTable TabelData;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    public JTable getTabelData() {
        return TabelData;
    }

    public void setTabelData(JTable TabelData) {
        this.TabelData = TabelData;
    }

    public JTextField getInputBrand() {
        return InputBrand;
    }

    public void setInputBrand(JTextField InputBrand) {
        this.InputBrand = InputBrand;
    }

    public JTextField getInputHarga() {
        return InputHarga;
    }

    public void setInputHarga(JTextField InputHarga) {
        this.InputHarga = InputHarga;
    }

    public JTextField getInputId() {
        return InputId;
    }

    public void setInputId(JTextField InputId) {
        this.InputId = InputId;
    }

    public JTextField getInputJumlah() {
        return InputJumlah;
    }

    public void setInputJumlah(JTextField InputJumlah) {
        this.InputJumlah = InputJumlah;
    }

    public JTextField getInputNama() {
        return InputNama;
    }

    public void setInputNama(JTextField InputNama) {
        this.InputNama = InputNama;
    }

    public JTextField getInputUkuran() {
        return InputUkuran;
    }

    public void setInputUkuran(JTextField InputUkuran) {
        this.InputUkuran = InputUkuran;
    }

    public JTextField getInputWarna() {
        return InputWarna;
    }

    public void setInputWarna(JTextField InputWarna) {
        this.InputWarna = InputWarna;
    }

    public JTextField getInputSearch() {
        return InputSearch;
    }

    public void setInputSearch(JTextField InputSearch) {
        this.InputSearch = InputSearch;
    }

    public JRadioButton getRBBrand() {
        return RBBrand;
    }

    public void setRBBrand(JRadioButton RBBrand) {
        this.RBBrand = RBBrand;
    }

    public JRadioButton getRBNama() {
        return RBNama;
    }

    public void setRBNama(JRadioButton RBNama) {
        this.RBNama = RBNama;
    }

    public JRadioButton getRBUkuran() {
        return RBUkuran;
    }

    public void setRBUkuran(JRadioButton RBUkuran) {
        this.RBUkuran = RBUkuran;
    }

    public JRadioButton getRBWarna() {
        return RBWarna;
    }

    public void setRBWarna(JRadioButton RBWarna) {
        this.RBWarna = RBWarna;
    }
    
    

} 