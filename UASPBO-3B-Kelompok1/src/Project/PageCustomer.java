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
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;

/**
 * UAS PEMROGRAMAN BERORIENTASI OBJEK
 * 3B INFORMATIKA - KELOMPOK 1
 * @author Adi Pratama Putra
 */

public class PageCustomer extends javax.swing.JFrame {
    public PageCustomer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TicketsTable = new javax.swing.JTable();
        BuyButton = new javax.swing.JButton();
        MoviesLabelTitle = new javax.swing.JLabel();
        MoviesLabel = new javax.swing.JLabel();
        SeatsLabelTitle = new javax.swing.JLabel();
        SeatsLabel = new javax.swing.JLabel();
        DaysLabelTitle = new javax.swing.JLabel();
        PriceLabelTitle = new javax.swing.JLabel();
        DaysLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        PrintButton = new javax.swing.JButton();
        TitleLable = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        LoadButton = new javax.swing.JButton();
        PaymentCodeTitle = new javax.swing.JLabel();
        PaymentCodeLabel = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Page - Cinema XXIV");

        Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        TicketsTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TicketsTable.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TicketsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movies", "Seats", "Days", "Price"
            }
        ));
        jScrollPane2.setViewportView(TicketsTable);

        BuyButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BuyButton.setText("Buy Tickets");
        BuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyButtonActionPerformed(evt);
            }
        });

        MoviesLabelTitle.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MoviesLabelTitle.setText("Movies");

        MoviesLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MoviesLabel.setText(": [ Movies Name ]");

        SeatsLabelTitle.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        SeatsLabelTitle.setText("Seats");

        SeatsLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SeatsLabel.setText(": [ Seats Name ]");

        DaysLabelTitle.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DaysLabelTitle.setText("Days");

        PriceLabelTitle.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PriceLabelTitle.setText("Price");

        DaysLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        DaysLabel.setText(": [ Days ]");

        PriceLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PriceLabel.setText(": [ Price ]");

        PrintButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PrintButton.setText("Print Tickets");
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });

        TitleLable.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TitleLable.setText("BUY THE TICKET!!");

        ExitButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        LoadButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LoadButton.setText("Load");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });

        PaymentCodeTitle.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PaymentCodeTitle.setText("Payment Code");

        PaymentCodeLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PaymentCodeLabel.setText(": [ Movies Name ]");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(LoadButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BuyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MoviesLabelTitle)
                                    .addComponent(SeatsLabelTitle)
                                    .addComponent(DaysLabelTitle)
                                    .addComponent(PriceLabelTitle))
                                .addGap(38, 38, 38)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PriceLabel)
                                    .addComponent(DaysLabel)
                                    .addComponent(SeatsLabel)
                                    .addComponent(MoviesLabel)))
                            .addComponent(TitleLable)
                            .addComponent(PrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaymentCodeTitle)
                            .addComponent(PaymentCodeLabel))))
                .addGap(27, 27, 27))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(TitleLable)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoadButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuyButton)
                    .addComponent(ExitButton))
                .addGap(26, 26, 26)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MoviesLabelTitle)
                    .addComponent(MoviesLabel)
                    .addComponent(PaymentCodeTitle))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeatsLabelTitle)
                    .addComponent(SeatsLabel)
                    .addComponent(PaymentCodeLabel))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DaysLabelTitle)
                    .addComponent(DaysLabel))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceLabelTitle)
                    .addComponent(PriceLabel))
                .addGap(18, 18, 18)
                .addComponent(PrintButton)
                .addGap(17, 17, 17))
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

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        try {
            // Koneksi ke database
            Connection conn = Bridge.configDB();
            System.out.println("Koneksi berhasil.");

            // Query SQL
            String sql = "SELECT Movies, Seats, Days, Price FROM MOVIES WHERE Status = 'Available' ORDER BY Movies ASC, Seats ASC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            // Membuat model tabel
            DefaultTableModel model = new DefaultTableModel(
                new String[]{"Movies", "Seats", "Days", "Price"}, 0
            );

            // Mengisi data ke model tabel
            while (rs.next()) {
                System.out.println("Data ditemukan: " + 
                    rs.getString("Movies") + ", " +
                    rs.getString("Seats") + ", " +
                    rs.getString("Days") + ", " +
                    rs.getString("Price")
                );
                model.addRow(new Object[]{
                    rs.getString("Movies"),
                    rs.getString("Seats"),
                    rs.getString("Days"),
                    rs.getString("Price")
                });
            }

            // Set model ke JTable
            TicketsTable.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_LoadButtonActionPerformed

    private void BuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyButtonActionPerformed
        // MENDAPATKAN BARIS YANG DIPILIH DI TABEL, JIKA TIDAK ADA MAKA MENAMPILKAN PESAN PERINGATAN
        int selectedRow = TicketsTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "PILIH FILM & SEATS YANG AKAN DIBELI !!"); // TAMPILKAN PESAN JIKA TIDAK ADA BARIS DIPILIH
            return;
        }

        // MENGAMBIL DATA DARI TABEL BERDASARKAN BARIS YANG DIPILIH
        String movie = (String) TicketsTable.getValueAt(selectedRow, 0);
        String seat = (String) TicketsTable.getValueAt(selectedRow, 1);
        String day = (String) TicketsTable.getValueAt(selectedRow, 2);
        String price = (String) TicketsTable.getValueAt(selectedRow, 3);

        try {
            // MEMBUKA KONEKSI KE DATABASE
            Connection conn = Bridge.configDB();
            String sql = "UPDATE MOVIES SET Status = 'Not Available' WHERE Movies = ? AND Seats = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            // MENGATUR PARAMETER QUERY DENGAN DATA YANG DIPILIH
            ps.setString(1, movie);
            ps.setString(2, seat);
            ps.executeUpdate(); // MENJALANKAN QUERY UPDATE UNTUK MENGUBAH STATUS TIKET

            // MEMPERBARUI LABEL DETAIL TIKET
            MoviesLabel.setText(movie);
            SeatsLabel.setText(seat);
            DaysLabel.setText(day);
            PriceLabel.setText(price);
            PaymentCodeLabel.setText("XXXX-XXXX-XXXX");

            // TAMPILKAN PESAN SUKSES DAN REFRESH TABEL
            JOptionPane.showMessageDialog(this, "TIKET TELAH BERHASIL DIBELI !!");
            LoadButtonActionPerformed(null); // MELOAD ULANG TABEL UNTUK MENAMPILKAN DATA TERKINI
        } catch (Exception e) {
            e.printStackTrace(); // MENAMPILKAN ERROR DI KONSOLE
            JOptionPane.showMessageDialog(this, "GAGAL MEMBELI TIKET !!" + e.getMessage()); // TAMPILKAN PESAN ERROR
        }
    }//GEN-LAST:event_BuyButtonActionPerformed

    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtonActionPerformed
        try {
            // MENGAMBIL DATA TIKET DARI LABEL
            String movie = MoviesLabel.getText();
            String seat = SeatsLabel.getText();
            String day = DaysLabel.getText();
            String price = PriceLabel.getText();

            // MENULIS DETAIL TIKET KE FILE "Ticket.txt"
            FileWriter writer = new FileWriter("MOVIES TICKET - CINEMA XXIV.txt");
            writer.write("TICKET DETAILS\n"); // HEADER FILE
            writer.write("Movies : " + movie + "\n"); // DETAIL FILM
            writer.write("Seats : " + seat + "\n"); // DETAIL KURSI
            writer.write("Days : " + day + "\n"); // DETAIL HARI
            writer.write("Price : " + price + "\n"); // DETAIL HARGA
            writer.write("Payment Code : XXXX-XXXX-XXXX \n"); // DETAIL HARGA
            writer.close(); // MENUTUP FILE WRITER

            // MENAMPILKAN PESAN SUKSES
            JOptionPane.showMessageDialog(this, "TIKET BERHASIL DISIMPAN !!");
        } catch (Exception e) {
            e.printStackTrace(); // MENAMPILKAN ERROR DI KONSOLE
            JOptionPane.showMessageDialog(this, "GAGAL MENYIMPAN TIKET !!" + e.getMessage()); // PESAN ERROR KE PENGGUNA
        }
    }//GEN-LAST:event_PrintButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // KELUAR DARI HALAMAN INI
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuyButton;
    private javax.swing.JLabel DaysLabel;
    private javax.swing.JLabel DaysLabelTitle;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LoadButton;
    private javax.swing.JLabel MoviesLabel;
    private javax.swing.JLabel MoviesLabelTitle;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel PaymentCodeLabel;
    private javax.swing.JLabel PaymentCodeTitle;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JLabel PriceLabelTitle;
    private javax.swing.JButton PrintButton;
    private javax.swing.JLabel SeatsLabel;
    private javax.swing.JLabel SeatsLabelTitle;
    private javax.swing.JTable TicketsTable;
    private javax.swing.JLabel TitleLable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

}

/**
 * UAS PEMROGRAMAN BERORIENTASI OBJEK
 * 3B INFORMATIKA - KELOMPOK 1
 * @author Adi Pratama Putra
 */