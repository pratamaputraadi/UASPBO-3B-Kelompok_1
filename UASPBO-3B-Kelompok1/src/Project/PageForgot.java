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

public class PageForgot extends javax.swing.JFrame {
    public PageForgot() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        EmailText = new javax.swing.JTextField();
        NewPasswordText = new javax.swing.JTextField();
        NewPasswordLabel = new javax.swing.JLabel();
        ChangePasswordButton = new javax.swing.JButton();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        AdtPasswordText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forgot Password - Cinema XXIV");

        Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        ExitButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        TitleLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TitleLabel.setText("FORGOT PASSWORD");

        EmailLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        EmailLabel.setText("Email");

        EmailText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        NewPasswordText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        NewPasswordLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        NewPasswordLabel.setText("New Password");

        ChangePasswordButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ChangePasswordButton.setText("Change Password");
        ChangePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordButtonActionPerformed(evt);
            }
        });

        Label2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        Label2.setText("Are You Admin?");

        Label3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Label3.setText("Insert Your Additional Password !!");

        AdtPasswordText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(Label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGap(0, 85, Short.MAX_VALUE)
                        .addComponent(TitleLabel)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AdtPasswordText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmailLabel)
                                    .addComponent(NewPasswordLabel))
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmailText)
                                    .addComponent(NewPasswordText)))
                            .addComponent(ChangePasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(TitleLabel)
                .addGap(30, 30, 30)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel)
                    .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewPasswordLabel)
                    .addComponent(NewPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label2)
                    .addComponent(Label3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdtPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(ChangePasswordButton)
                .addGap(18, 18, 18)
                .addComponent(ExitButton)
                .addGap(10, 10, 10))
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

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // KELUAR DARI HALAMAN INI
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ChangePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordButtonActionPerformed
        // MENGAMBIL INPUT DARI USER
            String email = EmailText.getText();
            String newPassword = NewPasswordText.getText();
            String additionalPassword = AdtPasswordText.getText(); // Kolom tambahan

            // VALIDASI INPUT
            if (email.isEmpty() || newPassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "EMAIL DAN NEW PASSWORD HARUS DIISI !!", "Error", JOptionPane.ERROR_MESSAGE);
                return; // MENGHENTIKAN EKSEKUSI JIKA VALIDASI GAGAL
            }

            // CEK JIKA EMAIL ADALAH admin@cinema.com
            if (email.equalsIgnoreCase("admin@cinema.com")) {
                if (additionalPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "ADMIN HARUS MEMASUKKAN ADDITIONAL PASSWORD !!", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // MENGHENTIKAN EKSEKUSI
                }

                try {
                    // KONEKSI KE DATABASE
                    Connection conn = Utilities.getConnection();

                    // QUERY UNTUK MEMVERIFIKASI ADDITIONAL PASSWORD
                    String verifySql = "SELECT * FROM Users WHERE Email = ? AND AdtPassword = ?";
                    PreparedStatement verifyPs = conn.prepareStatement(verifySql);
                    verifyPs.setString(1, email);
                    verifyPs.setString(2, additionalPassword); // Verifikasi additional password

                    ResultSet rs = verifyPs.executeQuery();

                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(this, "ADDITIONAL PASSWORD SALAH !!", "Error", JOptionPane.ERROR_MESSAGE);
                        return; // Hentikan jika additional password tidak cocok
                    }

                    // QUERY UNTUK MENGUBAH PASSWORD
                    String sql = "UPDATE Users SET Password = ? WHERE Email = ?";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, newPassword);
                    ps.setString(2, email);

                    // MENJALANKAN QUERY UPDATE
                    int rowsUpdated = ps.executeUpdate();

                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(this, "PASSWORD ADMIN BERHASIL DIUBAH !!", "Success", JOptionPane.INFORMATION_MESSAGE);

                        // Pindah ke halaman PageLogin
                        PageLogin loginPage = new PageLogin();
                        loginPage.setVisible(true);
                        this.dispose(); // Tutup halaman saat ini
                    } else {
                        JOptionPane.showMessageDialog(this, "EMAIL ADMIN TIDAK DAPAT DITEMUKAN !!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "TERJADI KESALAHAN SAAT MERUBAH PASSWORD !!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // PROSES UNTUK CUSTOMER
                try {
                    // KONEKSI KE DATABASE
                    Connection conn = Utilities.getConnection();

                    // QUERY UNTUK MENGUBAH PASSWORD
                    String sql = "UPDATE users SET Password = ? WHERE Email = ?";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, newPassword); // Mengisi password baru
                    ps.setString(2, email);       // Mengisi email untuk mencari user

                    // MENJALANKAN QUERY UPDATE
                    int rowsUpdated = ps.executeUpdate();

                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(this, "PASSWORD BERHASIL DIUBAH !!", "Success", JOptionPane.INFORMATION_MESSAGE);

                        // Pindah ke halaman PageLogin
                        PageLogin loginPage = new PageLogin();
                        loginPage.setVisible(true);
                        this.dispose(); // Tutup halaman saat ini
                    } else {
                        JOptionPane.showMessageDialog(this, "EMAIL TIDAK DAPAT DITEMUKAN !!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "TERJADI KESALAHAN SAAT MERUBAH PASSWORD !!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_ChangePasswordButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageForgot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdtPasswordText;
    private javax.swing.JButton ChangePasswordButton;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailText;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel NewPasswordLabel;
    private javax.swing.JTextField NewPasswordText;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel TitleLabel;
    // End of variables declaration//GEN-END:variables

}

/**
 * UAS PEMROGRAMAN BERORIENTASI OBJEK
 * 3B INFORMATIKA - KELOMPOK 1
 * @author Adi Pratama Putra
 */