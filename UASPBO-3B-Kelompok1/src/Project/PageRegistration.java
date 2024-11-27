/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/**
 * UAS PEMROGRAMAN BERORIENTASI OBJEK
 * 3B INFORMATIKA - KELOMPOK 1
 * @author Adi Pratama Putra
 */

public class PageRegistration extends javax.swing.JFrame {
    public PageRegistration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        LogInButton = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        UsernameText = new javax.swing.JTextField();
        EmailText = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        PhoneText = new javax.swing.JTextField();
        PhoneLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        PasswordText = new javax.swing.JTextField();
        RegisterButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration - Cinema XXIV");

        Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        ExitButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        TitleLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TitleLabel.setText("REGISTRATION ACCOUNT");

        Label2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        Label2.setText("You Already Have An Account?");

        LogInButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LogInButton.setText("Log In");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });

        Label1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setText("Or");

        UsernameLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        UsernameLabel.setText("Username");

        UsernameText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        EmailText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        EmailLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        EmailLabel.setText("Email");

        PhoneText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        PhoneLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PhoneLabel.setText("Phone");

        PasswordLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PasswordLabel.setText("Password");

        PasswordText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        RegisterButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cinema Logo.png"))); // NOI18N

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TitleLabel)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ExitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Label2)
                                .addGap(18, 18, 18)
                                .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameLabel)
                                    .addComponent(EmailLabel)
                                    .addComponent(PhoneLabel)
                                    .addComponent(PasswordLabel))
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PasswordText)
                                    .addComponent(PhoneText)
                                    .addComponent(UsernameText)
                                    .addComponent(EmailText)))
                            .addComponent(RegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(115, 115, 115))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(TitleLabel)
                .addGap(30, 30, 30)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel)
                    .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel)
                    .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneLabel)
                    .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RegisterButton)
                .addGap(20, 20, 20)
                .addComponent(Label1)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label2)
                    .addComponent(LogInButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExitButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        // MENUTUP HALAMAN INI
        this.setVisible(false);
        // MENGALIHKAN JENDELA INI KE HALAMAN PAGELOGIN
        new PageLogin().setVisible(true);
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // KELUAR DARI HALAMAN INI
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // MENGAMBIL INPUT DARI FIELD USERNAME, EMAIL, PHONE, DAN PASSWORD
        String username = UsernameText.getText();
        String email = EmailText.getText();
        String phone = PhoneText.getText();
        String password = PasswordText.getText();

        // VALIDASI JIKA ADA FIELD YANG KOSONG
        if (username.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "SELURUH ASPEK HARAP DIISI !!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return; // MENGHENTIKAN EKSEKUSI JIKA ADA FIELD KOSONG
        }

        // VALIDASI FORMAT EMAIL DENGAN METODE DI KELAS UTILITIES
        if (!Utilities.isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "FORMAT EMAIL INAVLID !!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return; // MENGHENTIKAN EKSEKUSI JIKA FORMAT EMAIL SALAH
        }

        // VALIDASI FORMAT NOMOR TELEPON DENGAN METODE DI KELAS UTILITIES
        if (!Utilities.isValidPhoneNumber(phone)) {
            JOptionPane.showMessageDialog(this, "FORMAT NOMOR HANDPHONE INVALID !!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return; // MENGHENTIKAN EKSEKUSI JIKA FORMAT NOMOR SALAH
        }

        try {
            // MEMBUAT KONEKSI KE DATABASE
            Connection conn = Utilities.getConnection();
            
            // MENYIAPKAN QUERY UNTUK INSERT DATA USER KE TABEL "users"
            String sql = "INSERT INTO users (Username, Email, Phone, Password) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            // MENGISI PARAMETER QUERY DENGAN DATA DARI INPUT USER
            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, password);
            
            // MENJALANKAN QUERY INSERT KE DATABASE
            ps.executeUpdate();

            // MENAMPILKAN PESAN SUKSES DAN MEMBUKA HALAMAN LOGIN
            Utilities.showSuccessMessage("REGISTRASI BERHASIL !!");
            new PageLogin().setVisible(true); // MEMBUKA HALAMAN LOGIN
            dispose(); // MENUTUP HALAMAN SAAT INI
        } catch (SQLException ex) {
            // MENANGANI ERROR JIKA INSERT KE DATABASE GAGAL
            ex.printStackTrace(); // MENAMPILKAN ERROR DI KONSOLE
            Utilities.showErrorMessage("REGISTRASI GAGAL !!"); // MENAMPILKAN PESAN ERROR KE PENGGUNA
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageRegistration().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailText;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JButton LogInButton;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField PasswordText;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}

/**
 * UAS PEMROGRAMAN BERORIENTASI OBJEK
 * 3B INFORMATIKA - KELOMPOK 1
 * @author Adi Pratama Putra
 */