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

public class PageLogin extends javax.swing.JFrame {
    public PageLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        UsernameText = new javax.swing.JTextField();
        PasswordText = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        LogInButton = new javax.swing.JButton();
        Label2 = new javax.swing.JLabel();
        ForgotButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In - Cinema XXIV");

        Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        ExitButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        TitleLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TitleLabel.setText("SIGN-IN  ACCOUNT");

        Label3.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        Label3.setText("You Don't Have An Account?");

        RegisterButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        Label1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setText("Or");

        UsernameLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        UsernameLabel.setText("Username");

        UsernameText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        PasswordText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        PasswordLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PasswordLabel.setText("Password");

        LogInButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LogInButton.setText("Log In");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });

        Label2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        Label2.setText("Forgot Password?");

        ForgotButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ForgotButton.setText("Forgot");
        ForgotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addComponent(TitleLabel)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Label2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ForgotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ExitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                .addComponent(Label3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameLabel)
                                    .addComponent(PasswordLabel))
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameText)
                                    .addComponent(PasswordText)))
                            .addComponent(LogInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
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
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(LogInButton)
                .addGap(18, 18, 18)
                .addComponent(Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label2)
                    .addComponent(ForgotButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label3)
                    .addComponent(RegisterButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // MENUTUP HALAMAN INI
        this.setVisible(false);
        // MENGALIHKAN JENDELA INI KE HALAMAN PAGEREGISTRATION
        new PageRegistration().setVisible(true);
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        // MENGAMBIL INPUT USERNAME DAN PASSWORD DARI TEXT FIELD
        String username = UsernameText.getText();
        String password = PasswordText.getText();

        // VALIDASI JIKA FIELD USERNAME ATAU PASSWORD KOSONG
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "SILAHKAN ISI USERNAME / PASSWORD !!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return; // MENGHENTIKAN EKSEKUSI JIKA VALIDASI GAGAL
        }

        try {
             // MENDAPATKAN KONEKSI KE DATABASE DARI KELAS UTILITIES
            Connection conn = Utilities.getConnection(); // Menggunakan metode di Utilities untuk mendapatkan koneksi
            
            // MENYIAPKAN QUERY UNTUK MENCARI USER DENGAN USERNAME DAN PASSWORD YANG DIBERIKAN
            String sql = "SELECT * FROM users WHERE Username = ? AND Password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            // MENJALANKAN QUERY DAN MENGAMBIL HASILNYA DALAM RESULTSET
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // MENGAMBIL ROLE USER DARI KOLOM "Role" DI TABEL USERS
                String userRole = rs.getString("Role");  // Pastikan ada kolom 'role' di tabel users

                // JIKA USER ADALAH ADMIN
                if (userRole != null && userRole.equals("Admin")) {
                    JOptionPane.showMessageDialog(this, "SELAMAT DATANG ADMIN !!", "BERHASIL", JOptionPane.INFORMATION_MESSAGE);
                    new PageAdmin().setVisible(true); // MEMBUKA HALAMAN ADMIN
                } else {
                    // JIKA USER ADALAH CUSTOMER
                    JOptionPane.showMessageDialog(this, "SELAMAT DATANG CUSTOMER !!", "BERHASIL", JOptionPane.INFORMATION_MESSAGE);
                    new PageCustomer().setVisible(true); // MEMBUKA HALAMAN CUSTOMER
                }
                dispose(); // MENUTUP HALAMAN LOGIN SAAT INI
                
            } else {
                // JIKA USERNAME ATAU PASSWORD TIDAK DITEMUKAN DI DATABASE
                JOptionPane.showMessageDialog(this, "USERNAME / PASSWORD INVALID", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            // MENANGANI ERROR DATABASE JIKA QUERY ATAU KONEKSI GAGAL
            ex.printStackTrace(); // MENAMPILKAN DETAIL ERROR DI KONSOLE
            Utilities.showErrorMessage("Database error occurred."); // MENAMPILKAN PESAN ERROR KE PENGGUNA
        }
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void ForgotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotButtonActionPerformed
        // MENUTUP HALAMAN INI
        this.setVisible(false);
        // MENGALIHKAN JENDELA INI KE HALAMAN PAGEFORGOTPASSWORD
        new PageForgot().setVisible(true);        
    }//GEN-LAST:event_ForgotButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ForgotButton;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JButton LogInButton;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField PasswordText;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameText;
    // End of variables declaration//GEN-END:variables

}

/**
 * UAS PEMROGRAMAN BERORIENTASI OBJEK
 * 3B INFORMATIKA - KELOMPOK 1
 * @author Adi Pratama Putra
 */