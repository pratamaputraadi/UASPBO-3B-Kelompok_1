/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 * UAS PEMROGRAMAN BERORIENTASI OBJEK
 * 3B INFORMATIKA - KELOMPOK 1
 * @author Adi Pratama Putra
 */

public class PageAdmin extends javax.swing.JFrame {
    public PageAdmin() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tabs = new javax.swing.JTabbedPane();
        PanelUsers = new javax.swing.JPanel();
        UsernameText = new javax.swing.JTextField();
        EmailText = new javax.swing.JTextField();
        EmailLable = new javax.swing.JLabel();
        PhoneText = new javax.swing.JTextField();
        PhoneLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordText = new javax.swing.JTextField();
        AddUsernameButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUsername = new javax.swing.JTable();
        LoadUsernameButton = new javax.swing.JButton();
        DeleteUsernameButton = new javax.swing.JButton();
        BackUsernameButton = new javax.swing.JButton();
        DeleteAllUsernameButton = new javax.swing.JButton();
        PanelFilms = new javax.swing.JPanel();
        SeatsLabel = new javax.swing.JLabel();
        DaysLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        MoviesLabel = new javax.swing.JLabel();
        MoviesText = new javax.swing.JTextField();
        SeatsCombo = new javax.swing.JComboBox<>();
        DaysCombo = new javax.swing.JComboBox<>();
        PriceCombo = new javax.swing.JComboBox<>();
        LoadFilmsButton = new javax.swing.JButton();
        DeleteFilmsButton = new javax.swing.JButton();
        AvailableButton = new javax.swing.JButton();
        AddFilmsButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableMovies = new javax.swing.JTable();
        BackFilmsButton = new javax.swing.JButton();
        DeleteAllFilmsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Page - Cinema XXIV");

        Tabs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Tabs.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        UsernameText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        EmailText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        EmailLable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        EmailLable.setText("Email");

        PhoneText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        PhoneLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PhoneLabel.setText("Phone");

        PasswordLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PasswordLabel.setText("Password");

        UsernameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        UsernameLabel.setText("Username");

        PasswordText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        AddUsernameButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        AddUsernameButton.setText("Add");
        AddUsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUsernameButtonActionPerformed(evt);
            }
        });

        TableUsername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TableUsername.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TableUsername.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Email", "Phone", "Password"
            }
        ));
        jScrollPane1.setViewportView(TableUsername);

        LoadUsernameButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LoadUsernameButton.setText("Load");
        LoadUsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadUsernameButtonActionPerformed(evt);
            }
        });

        DeleteUsernameButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DeleteUsernameButton.setText("Delete");
        DeleteUsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUsernameButtonActionPerformed(evt);
            }
        });

        BackUsernameButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BackUsernameButton.setText("Back");
        BackUsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackUsernameButtonActionPerformed(evt);
            }
        });

        DeleteAllUsernameButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DeleteAllUsernameButton.setText("Delete All");
        DeleteAllUsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAllUsernameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelUsersLayout = new javax.swing.GroupLayout(PanelUsers);
        PanelUsers.setLayout(PanelUsersLayout);
        PanelUsersLayout.setHorizontalGroup(
            PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsersLayout.createSequentialGroup()
                .addGroup(PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelUsersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackUsernameButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelUsersLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                            .addGroup(PanelUsersLayout.createSequentialGroup()
                                .addGroup(PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameLabel)
                                    .addComponent(EmailLable)
                                    .addComponent(PhoneLabel)
                                    .addComponent(PasswordLabel))
                                .addGap(18, 18, 18)
                                .addGroup(PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PasswordText)
                                    .addComponent(PhoneText)
                                    .addComponent(UsernameText)
                                    .addComponent(EmailText)))
                            .addGroup(PanelUsersLayout.createSequentialGroup()
                                .addComponent(AddUsernameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LoadUsernameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DeleteUsernameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteAllUsernameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        PanelUsersLayout.setVerticalGroup(
            PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsersLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BackUsernameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel)
                    .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLable)
                    .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneLabel)
                    .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddUsernameButton)
                    .addComponent(DeleteAllUsernameButton)
                    .addComponent(LoadUsernameButton)
                    .addComponent(DeleteUsernameButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        Tabs.addTab("Edit Users", PanelUsers);

        SeatsLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SeatsLabel.setText("Seats");

        DaysLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        DaysLabel.setText("Days");

        PriceLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PriceLabel.setText("Price");

        MoviesLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MoviesLabel.setText("Movies");

        MoviesText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        SeatsCombo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SeatsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A1", "A2", "A3", "A4", "A5", "A6", "B1", "B2", "B3", "B4", "B5", "B6", "C1", "C2", "C3", "C4", "C5", "C6", "D1", "D2", "D3", "D4", "D5", "D6" }));

        DaysCombo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        DaysCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));

        PriceCombo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PriceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25000", "35000", "45000", " " }));

        LoadFilmsButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LoadFilmsButton.setText("Load");
        LoadFilmsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadFilmsButtonActionPerformed(evt);
            }
        });

        DeleteFilmsButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DeleteFilmsButton.setText("Delete");
        DeleteFilmsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteFilmsButtonActionPerformed(evt);
            }
        });

        AvailableButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        AvailableButton.setText("Available");
        AvailableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailableButtonActionPerformed(evt);
            }
        });

        AddFilmsButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        AddFilmsButton.setText("Add");
        AddFilmsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFilmsButtonActionPerformed(evt);
            }
        });

        TableMovies.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TableMovies.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TableMovies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Movies", "Seats", "Days", "Price", "Status"
            }
        ));
        jScrollPane2.setViewportView(TableMovies);

        BackFilmsButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BackFilmsButton.setText("Back");
        BackFilmsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackFilmsButtonActionPerformed(evt);
            }
        });

        DeleteAllFilmsButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DeleteAllFilmsButton.setText("Delete All");
        DeleteAllFilmsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAllFilmsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFilmsLayout = new javax.swing.GroupLayout(PanelFilms);
        PanelFilms.setLayout(PanelFilmsLayout);
        PanelFilmsLayout.setHorizontalGroup(
            PanelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFilmsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFilmsLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(PanelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AvailableButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelFilmsLayout.createSequentialGroup()
                        .addGroup(PanelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DaysLabel)
                            .addGroup(PanelFilmsLayout.createSequentialGroup()
                                .addGroup(PanelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelFilmsLayout.createSequentialGroup()
                                        .addComponent(SeatsLabel)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelFilmsLayout.createSequentialGroup()
                                        .addComponent(PriceLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(PanelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(DaysCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SeatsCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MoviesText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PriceCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelFilmsLayout.createSequentialGroup()
                                .addGroup(PanelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddFilmsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MoviesLabel))
                                .addGroup(PanelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelFilmsLayout.createSequentialGroup()
                                        .addGap(320, 320, 320)
                                        .addComponent(BackFilmsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelFilmsLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(LoadFilmsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(DeleteFilmsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DeleteAllFilmsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(401, 401, 401))))
        );
        PanelFilmsLayout.setVerticalGroup(
            PanelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFilmsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PanelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MoviesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MoviesLabel)
                    .addComponent(BackFilmsButton))
                .addGap(12, 12, 12)
                .addGroup(PanelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeatsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeatsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DaysCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DaysLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceLabel))
                .addGap(30, 30, 30)
                .addGroup(PanelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddFilmsButton)
                    .addComponent(DeleteFilmsButton)
                    .addComponent(LoadFilmsButton)
                    .addComponent(DeleteAllFilmsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AvailableButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        Tabs.addTab("Edit Films", PanelFilms);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackUsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackUsernameButtonActionPerformed
        // MENUTUP HALAMAN INI
        this.setVisible(false);
        // MENGALIHKAN JENDELA INI KE HALAMAN PAGELOGIN
        new PageLogin().setVisible(true);
    }//GEN-LAST:event_BackUsernameButtonActionPerformed

    private void DeleteUsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUsernameButtonActionPerformed
        try {
            int selectedRow = TableUsername.getSelectedRow(); // MENDAPATKAN INDEKS BARIS YANG DIPILIH DI TABEL GUI
            if (selectedRow == -1) { // CEK APAKAH TIDAK ADA BARIS YANG DIPILIH
                JOptionPane.showMessageDialog(null, "PILIH DATA YANG INGIN DIHAPUS !!"); // TAMPILKAN NOTIFIKASI KEPADA PENGGUNA
                return; // HENTIKAN EKSEKUSI JIKA TIDAK ADA BARIS YANG DIPILIH
            }

            // AMBIL DATA EMAIL DARI KOLOM 1 PADA BARIS YANG DIPILIH
            String emailToDelete = (String) TableUsername.getValueAt(selectedRow, 1); 

            // MEMBUAT QUERY SQL UNTUK MENGHAPUS DATA BERDASARKAN EMAIL
            String sql = "DELETE FROM USERS WHERE Email = ?"; 
            Connection conn = Bridge.configDB(); // MEMBUAT KONEKSI KE DATABASE
            PreparedStatement ps = conn.prepareStatement(sql); // MENYIAPKAN QUERY DENGAN PARAMETER
            ps.setString(1, emailToDelete); // MENYETEL PARAMETER EMAIL UNTUK QUERY
            int rowsDeleted = ps.executeUpdate(); // MENJALANKAN QUERY DAN MENDAPATKAN JUMLAH BARIS YANG TERPENGARUH

            if (rowsDeleted > 0) { // CEK JIKA ADA DATA YANG BERHASIL DIHAPUS
                JOptionPane.showMessageDialog(null, "DATA CUSTOMER BERHASIL DIHAPUS !!"); // TAMPILKAN PESAN SUKSES
                // HAPUS BARIS DARI MODEL TABEL GUI UNTUK MENYINKRONKAN DENGAN DATABASE
                ((DefaultTableModel) TableUsername.getModel()).removeRow(selectedRow); 
            } else { // JIKA DATA TIDAK DITEMUKAN DI DATABASE
                JOptionPane.showMessageDialog(null, "DATA CUSTOMER TIDAK DITEMUKAN !!"); // TAMPILKAN PESAN KE PENGGUNA
            }
        } catch (Exception e) { // MENANGANI EXCEPTION ATAU ERROR
            // TAMPILKAN PESAN ERROR KE PENGGUNA
            JOptionPane.showMessageDialog(null, "GAGAL MENGHAPUS DATA CUSTOMER !!" + e.getMessage());
        }
    }//GEN-LAST:event_DeleteUsernameButtonActionPerformed

    private void LoadUsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadUsernameButtonActionPerformed
        try {
            // MEMBUAT KONEKSI KE DATABASE
            Connection conn = Bridge.configDB();

            // QUERY UNTUK MENGAMBIL DATA DARI TABEL `USERS` DI MANA ROLE ADALAH 'Customer'
            String sql = "SELECT * FROM USERS WHERE Role = 'Customer'";
            PreparedStatement ps = conn.prepareStatement(sql); // MENYIAPKAN STATEMENT QUERY

            // MENJALANKAN QUERY DAN MENYIMPAN HASIL KE DALAM `ResultSet`
            ResultSet rs = ps.executeQuery();

            // MEMBUAT MODEL TABEL DENGAN KOLOM YANG SESUAI
            DefaultTableModel model = new DefaultTableModel(
                new String[]{"Username", "Email", "Phone", "Password"}, // NAMA KOLOM
                0 // JUMLAH AWAL BARIS
            );

            // LOOPING MELALUI HASIL QUERY
            while (rs.next()) {
                // MENAMBAHKAN DATA KE MODEL TABEL DARI HASIL QUERY
                model.addRow(new Object[]{
                    rs.getString("username"), // AMBIL NILAI KOLOM `username`
                    rs.getString("email"),    // AMBIL NILAI KOLOM `email`
                    rs.getString("phone"),    // AMBIL NILAI KOLOM `phone`
                    rs.getString("Password")  // AMBIL NILAI KOLOM `Password`
                });
            }

            // MENAMPILKAN DATA DI TABEL GUI DENGAN MODEL YANG TELAH DIISI
            TableUsername.setModel(model);

        } catch (Exception e) { 
            // MENANGKAP DAN MENAMPILKAN ERROR JIKA TERJADI
            e.printStackTrace(); // MENAMPILKAN DETAIL ERROR KE KONSOLE
        }
    }//GEN-LAST:event_LoadUsernameButtonActionPerformed

    private void AddUsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUsernameButtonActionPerformed
        // AMBIL DATA DARI INPUT FIELD
        String username = UsernameText.getText();  // MENGAMBIL TEKS DARI INPUT FIELD USERNAME
        String email = EmailText.getText();        // MENGAMBIL TEKS DARI INPUT FIELD EMAIL
        String phone = PhoneText.getText();        // MENGAMBIL TEKS DARI INPUT FIELD PHONE
        String password = PasswordText.getText();  // MENGAMBIL TEKS DARI INPUT FIELD PASSWORD

        // VALIDASI INPUT: CEK JIKA ADA FIELD YANG KOSONG
        if (username.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "SELURUH DATA HARAP DIISI", "ERROR", JOptionPane.ERROR_MESSAGE); // TAMPILKAN ERROR JIKA ADA YANG KOSONG
            return; // HENTIKAN EKSEKUSI JIKA VALIDASI GAGAL
        }

        // VALIDASI FORMAT EMAIL
        if (!Utilities.isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "FORMAT EMAIL INVALID", "ERROR", JOptionPane.ERROR_MESSAGE); // TAMPILKAN ERROR JIKA FORMAT EMAIL TIDAK VALID
            return; // HENTIKAN EKSEKUSI JIKA VALIDASI GAGAL
        }

        // VALIDASI FORMAT NOMOR HANDPHONE
        if (!Utilities.isValidPhoneNumber(phone)) {
            JOptionPane.showMessageDialog(this, "FORMAT NOMOR HANDPHONE INVALID", "ERROR", JOptionPane.ERROR_MESSAGE); // TAMPILKAN ERROR JIKA FORMAT NOMOR TIDAK VALID
            return; // HENTIKAN EKSEKUSI JIKA VALIDASI GAGAL
        }

        try {
            // KONEKSI KE DATABASE
            Connection conn = Utilities.getConnection(); // MENGAMBIL OBJEK KONEKSI DATABASE

            // QUERY UNTUK MENAMBAHKAN DATA KE TABEL `users`
            String sql = "INSERT INTO users (Username, Email, Phone, Password) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql); // SIAPKAN QUERY DENGAN PARAMETER
            ps.setString(1, username);  // MENGISI PARAMETER 1 (USERNAME)
            ps.setString(2, email);     // MENGISI PARAMETER 2 (EMAIL)
            ps.setString(3, phone);     // MENGISI PARAMETER 3 (PHONE)
            ps.setString(4, password);  // MENGISI PARAMETER 4 (PASSWORD)
            ps.executeUpdate();         // EKSEKUSI QUERY UNTUK MENYIMPAN DATA KE DATABASE

            // TAMPILKAN PESAN SUKSES JIKA BERHASIL
            Utilities.showSuccessMessage("REGISTRASI BERHASIL !!");
            LoadUsernameButtonActionPerformed(evt); // REFRESH TABEL GUI DENGAN MEMANGGIL AKSI TOMBOL LOAD FILMS

        } catch (SQLException ex) {
            // CETAK DETAIL ERROR KE KONSOLE (UNTUK DEBUGGING)
            ex.printStackTrace();

            // TAMPILKAN PESAN ERROR KE PENGGUNA
            Utilities.showErrorMessage("REGISTRASI GAGAL !!");
        }
    }//GEN-LAST:event_AddUsernameButtonActionPerformed

    private void BackFilmsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackFilmsButtonActionPerformed
        // MENUTUP HALAMAN INI
        this.setVisible(false);
        // MENGALIHKAN JENDELA INI KE HALAMAN PAGELOGIN
        new PageLogin().setVisible(true);
    }//GEN-LAST:event_BackFilmsButtonActionPerformed

    private void AddFilmsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFilmsButtonActionPerformed
        String movies = MoviesText.getText(); // AMBIL INPUT FILM DARI TEXT FIELD
        String seats = SeatsCombo.getSelectedItem().toString(); // AMBIL JUMLAH KURSI DARI COMBO BOX
        String days = DaysCombo.getSelectedItem().toString(); // AMBIL HARI DARI COMBO BOX
        String price = PriceCombo.getSelectedItem().toString(); // AMBIL HARGA DARI COMBO BOX

        // VALIDASI INPUT: CEK APAKAH ADA FIELD YANG KOSONG
        if (movies.isEmpty() || seats.isEmpty() || days.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(this, "MOHON MASUKKAN NAMA MOVIES !!", "Error", JOptionPane.ERROR_MESSAGE); // TAMPILKAN PESAN ERROR
            return; // HENTIKAN EKSEKUSI JIKA ADA FIELD YANG KOSONG
        }

        try {
            // KONEKSI KE DATABASE
            Connection conn = Bridge.configDB(); 

            // QUERY UNTUK MENAMBAHKAN FILM KE DATABASE
            String sql = "INSERT INTO MOVIES (Movies, Seats, Days, Price, Status) VALUES (?, ?, ?, ?, 'Available')";
            PreparedStatement ps = conn.prepareStatement(sql); // MENYIAPKAN QUERY DENGAN PARAMETER
            ps.setString(1, movies); // MENGISI PARAMETER PERTAMA (FILM)
            ps.setString(2, seats);  // MENGISI PARAMETER KEDUA (KURSI)
            ps.setString(3, days);   // MENGISI PARAMETER KETIGA (HARI)
            ps.setString(4, price);  // MENGISI PARAMETER KEEMPAT (HARGA)
            ps.executeUpdate(); // EKSEKUSI QUERY UNTUK MENYIMPAN DATA

            JOptionPane.showMessageDialog(this, "FILM BERHASIL DITAMBAHKAN"); // KONFIRMASI KEPADA PENGGUNA
            LoadFilmsButtonActionPerformed(evt); // REFRESH TABEL GUI DENGAN MEMANGGIL AKSI TOMBOL LOAD FILMS
        } catch (Exception e) { 
            e.printStackTrace(); // CETAK DETAIL ERROR UNTUK DEBUGGING
            JOptionPane.showMessageDialog(this, "GAGAL MENAMBAHKAN FILM" + e.getMessage()); // TAMPILKAN ERROR KEPADA PENGGUNA
        }
    }//GEN-LAST:event_AddFilmsButtonActionPerformed

    private void DeleteFilmsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteFilmsButtonActionPerformed
        try {
            int selectedRow = TableMovies.getSelectedRow(); // MENDAPATKAN INDEKS BARIS YANG DIPILIH
            if (selectedRow == -1) { // CEK APAKAH ADA BARIS YANG DIPILIH
                JOptionPane.showMessageDialog(null, "PILIH DATA YANG INGIN DIHAPUS !!"); // TAMPILKAN PESAN JIKA TIDAK ADA BARIS YANG DIPILIH
                return; // HENTIKAN EKSEKUSI JIKA TIDAK ADA BARIS YANG DIPILIH
            }

            // MENGAMBIL ID DARI KOLOM PERTAMA PADA BARIS YANG DIPILIH
            int IDToDelete = (int) TableMovies.getValueAt(selectedRow, 0); 

            // QUERY UNTUK MENGHAPUS DATA BERDASARKAN ID
            String sql = "DELETE FROM MOVIES WHERE ID = ?";
            Connection conn = Bridge.configDB(); // KONEKSI KE DATABASE
            PreparedStatement ps = conn.prepareStatement(sql); // MENYIAPKAN QUERY DENGAN PARAMETER
            ps.setInt(1, IDToDelete); // MENGISI PARAMETER PERTAMA DENGAN ID
            int rowsDeleted = ps.executeUpdate(); // EKSEKUSI QUERY UNTUK MENGHAPUS DATA

            if (rowsDeleted > 0) { // CEK JIKA DATA BERHASIL DIHAPUS
                JOptionPane.showMessageDialog(null, "DATA FILM BERHASIL DIHAPUS !!."); // KONFIRMASI KEPADA PENGGUNA
                ((DefaultTableModel) TableMovies.getModel()).removeRow(selectedRow); // HAPUS BARIS DARI TABEL GUI
            } else {
                JOptionPane.showMessageDialog(null, "DATA FILM TIDAK DITEMUKAN !!"); // TAMPILKAN PESAN JIKA DATA TIDAK DITEMUKAN
            }
        } catch (Exception e) { 
            // CETAK DETAIL ERROR UNTUK DEBUGGING DAN TAMPILKAN PESAN ERROR KEPADA PENGGUNA
            JOptionPane.showMessageDialog(null, "GAGAL MENGHAPUS DATA FILM !!" + e.getMessage()); 
        }
    }//GEN-LAST:event_DeleteFilmsButtonActionPerformed

    private void LoadFilmsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadFilmsButtonActionPerformed
        try {
            // KONEKSI KE DATABASE
            Connection conn = Bridge.configDB(); // MEMBUKA KONEKSI KE DATABASE
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Koneksi ke database gagal!");
                return;
            }

            // QUERY UNTUK MENGAMBIL DATA
            String sql = "SELECT * FROM MOVIES ORDER BY Movies ASC, Seats ASC";
            PreparedStatement ps = conn.prepareStatement(sql); // MENYIAPKAN QUERY
            ResultSet rs = ps.executeQuery(); // EKSEKUSI QUERY DAN SIMPAN HASIL KE RESULTSET

            // MODEL UNTUK TABEL GUI
            DefaultTableModel model = new DefaultTableModel(
                new String[]{"ID", "Movies", "Seats", "Days", "Price", "Status"}, 0
            );

            // AMBIL DATA DARI DATABASE
            while (rs.next()) {
                System.out.println("Mengambil data: ID=" + rs.getInt("ID"));
                model.addRow(new Object[]{
                    rs.getInt("ID"),         // KOLOM ID
                    rs.getString("Movies"),  // KOLOM Movies
                    rs.getString("Seats"),   // KOLOM Seats
                    rs.getString("Days"),    // KOLOM Days
                    rs.getString("Price"),   // KOLOM Price
                    rs.getString("Status")   // KOLOM Status
                });
            }

            // SET MODEL KE TABEL
            TableMovies.setModel(model);
            TableMovies.repaint(); // REFRESH TABEL GUI
            System.out.println("Data berhasil dimuat ke tabel.");

        } catch (Exception e) {
            e.printStackTrace(); // CETAK ERROR UNTUK DEBUGGING
            JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage());
        }
    }//GEN-LAST:event_LoadFilmsButtonActionPerformed

    private void AvailableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailableButtonActionPerformed
        // AMBIL BARIS YANG DIPILIH DI TABEL GUI
        int selectedRow = TableMovies.getSelectedRow();
        if (selectedRow == -1) { // CEK APAKAH ADA BARIS YANG DIPILIH
            JOptionPane.showMessageDialog(this, "PILIH DATA YANG INGIN ANDA UBAH STATUSNYA !!"); // PEMBERITAHUAN KE PENGGUNA
            return; // HENTIKAN EKSEKUSI JIKA TIDAK ADA BARIS YANG DIPILIH
        }

        // AMBIL NILAI KOLOM "STATUS" DARI BARIS YANG DIPILIH (KOLOM INDEKS 5)
        Object valueStatus = TableMovies.getValueAt(selectedRow, 5);
        String status = valueStatus != null ? valueStatus.toString() : ""; // CEK JIKA NULL DAN KONVERSI KE STRING

        // HANYA LAKUKAN JIKA STATUS BELUM 'Yes'
        if ("Available".equalsIgnoreCase(status)) {
            JOptionPane.showMessageDialog(this, "STATUS SUDAH 'AVAILABLE'"); // TAMPILKAN PESAN
            return; // KELUAR JIKA STATUS SUDAH 'Yes'
        }

        try {
            // KONEKSI KE DATABASE
            Connection conn = Bridge.configDB();

            // QUERY UNTUK MENGUBAH STATUS MENJADI 'Yes'
            String sql = "UPDATE MOVIES SET Status = 'Available' WHERE ID = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            // AMBIL NILAI ID DARI KOLOM PERTAMA (KOLOM INDEKS 0)
            int movieId = (int) TableMovies.getValueAt(selectedRow, 0);
            ps.setInt(1, movieId); // SET PARAMETER ID UNTUK QUERY

            int rowsUpdated = ps.executeUpdate(); // EKSEKUSI QUERY DAN DAPATKAN JUMLAH BARIS YANG DIUBAH

            if (rowsUpdated > 0) { // JIKA STATUS BERHASIL DIUBAH
                // PERBARUI NILAI STATUS DI TABEL GUI
                TableMovies.setValueAt("Available", selectedRow, 5); 
                JOptionPane.showMessageDialog(this, "STATUS BERHASIL DIUBAH !!"); // TAMPILKAN PESAN SUKSES
            } else {
                // TAMPILKAN PESAN JIKA ID TIDAK DITEMUKAN
                JOptionPane.showMessageDialog(this, "GAGAL MENGUBAH STATUS !!");
            }

            // TUTUP STATEMENT DAN KONEKSI
            ps.close();
            conn.close();
        } catch (SQLException e) {
            // TANGANI KESALAHAN DATABASE DAN TAMPILKAN PESAN ERROR
            JOptionPane.showMessageDialog(this, "TERJADI KESALAHAN KONEKSI DATABASE : " + e.getMessage());
        } catch (Exception e) {
            // TANGANI KESALAHAN UMUM DAN TAMPILKAN PESAN ERROR
            JOptionPane.showMessageDialog(this, "TERJADI KESALAHAN : " + e.getMessage());
        }
    }//GEN-LAST:event_AvailableButtonActionPerformed

    private void DeleteAllUsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAllUsernameButtonActionPerformed
        try {
            // Membuat koneksi ke database
            Connection conn = Bridge.configDB();

            // Membuat query untuk menghapus semua data pengguna kecuali yang memiliki role 'admin'
            String sql = "DELETE FROM USERS WHERE Role != 'Admin'";
            PreparedStatement ps = conn.prepareStatement(sql); // Menyiapkan query

            // Menjalankan query untuk menghapus data
            int rowsDeleted = ps.executeUpdate(); // Menjalankan query dan mendapatkan jumlah baris yang terpengaruh

            if (rowsDeleted > 0) { // Jika ada data yang berhasil dihapus
                JOptionPane.showMessageDialog(null, "SEMUA DATA USER KECUALI ADMIN BERHASIL DIHAPUS!!");

                // Menghapus baris dari model tabel GUI untuk menyinkronkan dengan database
                DefaultTableModel model = (DefaultTableModel) TableUsername.getModel();

                // Loop untuk menghapus semua baris yang tidak memiliki role 'admin'
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    String role = (String) model.getValueAt(i, 2); // Asumsi role ada di kolom ke-3 (index 2)
                    if (!role.equals("admin")) {
                        model.removeRow(i); // Hapus baris dari tabel
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "TIDAK ADA DATA YANG DAPAT DIHAPUS!!");
            }
        } catch (Exception e) {
            // Menangani exception atau error
            JOptionPane.showMessageDialog(null, "GAGAL MENGHAPUS DATA CUSTOMER!! " + e.getMessage());
        }
    }//GEN-LAST:event_DeleteAllUsernameButtonActionPerformed

    private void DeleteAllFilmsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAllFilmsButtonActionPerformed
        try {
            // QUERY UNTUK MENGHAPUS SEMUA DATA DARI DATABASE
            String sql = "DELETE FROM MOVIES";
            Connection conn = Bridge.configDB(); // KONEKSI KE DATABASE
            PreparedStatement ps = conn.prepareStatement(sql); // SIAPKAN STATEMENT UNTUK EKSEKUSI
            int rowsDeleted = ps.executeUpdate(); // EKSEKUSI QUERY UNTUK MENGHAPUS SEMUA DATA

            if (rowsDeleted > 0) { // CEK JIKA ADA DATA YANG DIHAPUS
                JOptionPane.showMessageDialog(null, "SEMUA DATA FILM BERHASIL DIHAPUS !!");
                // HAPUS SEMUA DATA DARI TABEL GUI
                DefaultTableModel model = (DefaultTableModel) TableMovies.getModel();
                model.setRowCount(0); // SET ROW COUNT KE 0 UNTUK MENGOSONGKAN TABEL
            } else {
                JOptionPane.showMessageDialog(null, "TIDAK ADA DATA YANG DAPAT DIHAPUS !!");
            }
        } catch (Exception e) {
            // CETAK ERROR UNTUK DEBUGGING DAN TAMPILKAN PESAN ERROR KEPADA PENGGUNA
            JOptionPane.showMessageDialog(null, "GAGAL MENGHAPUS DATA FILM !!" + e.getMessage());
        }
    }//GEN-LAST:event_DeleteAllFilmsButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddFilmsButton;
    private javax.swing.JButton AddUsernameButton;
    private javax.swing.JButton AvailableButton;
    private javax.swing.JButton BackFilmsButton;
    private javax.swing.JButton BackUsernameButton;
    private javax.swing.JComboBox<String> DaysCombo;
    private javax.swing.JLabel DaysLabel;
    private javax.swing.JButton DeleteAllFilmsButton;
    private javax.swing.JButton DeleteAllUsernameButton;
    private javax.swing.JButton DeleteFilmsButton;
    private javax.swing.JButton DeleteUsernameButton;
    private javax.swing.JLabel EmailLable;
    private javax.swing.JTextField EmailText;
    private javax.swing.JButton LoadFilmsButton;
    private javax.swing.JButton LoadUsernameButton;
    private javax.swing.JLabel MoviesLabel;
    private javax.swing.JTextField MoviesText;
    private javax.swing.JPanel PanelFilms;
    private javax.swing.JPanel PanelUsers;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField PasswordText;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JComboBox<String> PriceCombo;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JComboBox<String> SeatsCombo;
    private javax.swing.JLabel SeatsLabel;
    private javax.swing.JTable TableMovies;
    private javax.swing.JTable TableUsername;
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}

/**
 * UAS PEMROGRAMAN BERORIENTASI OBJEK
 * 3B INFORMATIKA - KELOMPOK 1
 * @author Adi Pratama Putra
 */