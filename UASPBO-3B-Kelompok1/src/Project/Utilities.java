/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * UAS PEMROGRAMAN BERORIENTASI OBJEK
 * 3B INFORMATIKA - KELOMPOK 1
 * @author Adi Pratama Putra
 */

// DEKLARASI KELAS UTIITIES YANG MENYIDIAKAN BERBAGAI FUNGSI UTILITIES UNTUK APLIKASI
// SEPERTI KONEKSI DATABASE, VALIDASI, DAN MENAMPILKAN PESAN DIALOG
public class Utilities {
    // VARIABEL STATIS UNTUK MENYIMPAN OBJEK KONEKSI DATABASE
    // VARIABEL INI DIGUNAKAN AGAR KONEKSI DAPAT DIAKSES SECARA GLOBAL DALAM APLIKASI
    private static Connection connection;

    // METHOD UNTUK MENDAPATKAN KONEKSI KE DATABASE
    // METHOD INI MENGGUNAKAN POLA SINGLETON AGAR HANYA ADA SATU KONEKSI DATABASE DALAM SATU WAKTU
    public static Connection getConnection() {
        // MENGECEK APAKAH KONEKSI BELUM DIBUAT (CONNECTION == NULL)
        if (connection == null) {
            try {
                // MEMUAT DRIVER JDBC UNTUK MYSQL
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // MEMBUAT KONEKSI KE DATABASE DENGAN URL, USERNAME, DAN PASSWORD
                // URL KONEKSI : JDBC:MYSQL://LOCALHOST:3306/CINEMA
                // ~ LOCALHOST : MENUNJUKAN SERVER DATABASE BERADA DI MESIN LOKAL
                // ~ 3306      : PORT DEFAULT MYSQL
                // ~ CINEMA    : NAMA DATABASE YANG DIAKSES
                // KREDENSIAL  : USERNAME "root" & PASSWORD " "
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CINEMA", "root", "");

                // MENAMPILKAN PESAN DI KONSOL JIKA KONEKSI BERHASIL
                System.out.println("[Koneksi Database Berhasil]");
            } catch (ClassNotFoundException | SQLException e) {
                // MENANGKAP KESALAHAN JIKA DRIVER TIDAK DITEMUKAN ATAU KONEKSI GAGAL
                e.printStackTrace(); // Mencetak detail error ke konsol.

                // MENAMPILKAN PESAN KESALAHAN MENGGUNAKAN DIALOG JOPTIONPANE
                JOptionPane.showMessageDialog(null, "Koneksi Database Gagal: " + e.getMessage());
            }
        }
        // MENGAMBILKAN OBJEK KONEKSI (BAIK KONEKSI YANG BARU DIBUAT ATAU YANG SUDAH ADA SEBELUMNYA)
        return connection;
    }

    // METHOD UNTUK MENAMPILKAN PESAN SUSKSES KEPADA PENGGUNA
    // MENGGUNAKAN DIALOG JOPTIONPANE DENGAN IKON INFORMASI
    public static void showSuccessMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    // METHOD UNTUK MENAMPILKAN PESAN ERROR KEPADA PENGGUNA
    // MENGGUNAKAN DIALOG JOPTIONPANE DENGAN IKON ERROR
    public static void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // METHOD UNTUK MEMVALIDASI FORMAT EMAIL
    // MENGGUNAKAN POLA REGEX UNTUK MEMASTIKAN EMAIL SESUAI DENGAN FORMAT STANDAR
    public static boolean isValidEmail(String email) {
        return email.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
    }
    
    // METHOD UNTUK MEMVALIDASI NOMOR HP
    // MEMASTIKAN NOMOR TERDIRI DARI 10 HINGGA 13 DIGIT MENGGUNAKAN REGEX
    public static boolean isValidPhoneNumber(String phone) {
        return phone.matches("^\\d{10,13}$");
    }
}

/**
 * UAS PEMROGRAMAN BERORIENTASI OBJEK
 * 3B INFORMATIKA - KELOMPOK 1
 * @author Adi Pratama Putra
 */