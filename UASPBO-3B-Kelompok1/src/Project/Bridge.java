/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * UAS PEMROGRAMAN BERORIENTASI OBJEK
 * 3B INFORMATIKA - KELOMPOK 1
 * @author Adi Pratama Putra
 */

// DEKLARASI KELAS "BRIDGE" YANG BERTUGAS MENGELOLA KONEKSI KE DATABASE
public class Bridge {
    
    // VARIABEL STATIS UNTUK MENYIMPAN KONEKSI DATABASE
    // VARIAVEL BERSIFAT "PRIVATE" SEHINGGA HANYA DAPAT DIAKSES DARI DALAM KELAS INI
    private static Connection Bridge;

    // METHOD STATIS UNTUK MENGONFIGURASI KONEKSI KE DATABASE
    // METHOD INI AKAN MENGEMBALIKAN OBJEK "CONNECTION" JIKA BERHASIL TERKONEKSI
    public static Connection configDB() throws SQLException, ClassNotFoundException {
        try {
            // MEMERIKSA APAKAH VARIABEL "BRIDGE" MASIH NULL ( BELUM TERKONEKSI KE DATABASE )
            if (Bridge == null) {
                // MEMUAT DRIVER JDBC UNTK MYSQL
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // MEMBUAT KONEKSI KE DATABASE MENGGUNAKAN "DRIVERMANAGAGER"
                // URL KONEKSI : JDBC:MYSQL://LOCALHOST:3306/CINEMA
                // ~ LOCALHOST : MENUNJUKAN SERVER DATABASE BERADA DI MESIN LOKAL
                // ~ 3306      : PORT DEFAULT MYSQL
                // ~ CINEMA    : NAMA DATABASE YANG DIAKSES
                // KREDENSIAL  : USERNAME "root" & PASSWORD " "
                Bridge = DriverManager.getConnection("jdbc:mysql://localhost:3306/CINEMA", 
                        "root", "");
                
                // MENAMPILKAN PESAN JIKA BERHASIL TERKONEKSI
                System.out.println(" -- SUCCESS : CONNECTED TO THE DATABASE --");
            }
            // MENGEMBALIKAN OBJEK CONNECTION YANG BERHASIL DIBUAT
            return Bridge;
        } catch (SQLException e) {
            // MENANGKAP DAN MENANGANI KESALAHAN KONEKSI KE DATABASE
            // MENAMPILKAN PESAN ERROR BESERTA INFORMASI DARI OBJEK SQLEXCEPTION
            System.err.println(" -- ERROR : UNABLE TO CONNECT TO THE DATABASE -- " + e.getMessage());
            
            // MENERUSKAN KESALAHAN AGAR DAPAT DITANGANI OLEH KODE PEMANGGIL
            throw e;
        }
    }
}

/**
 * UAS PEMROGRAMAN BERORIENTASI OBJEK
 * 3B INFORMATIKA - KELOMPOK 1
 * @author Adi Pratama Putra
 */