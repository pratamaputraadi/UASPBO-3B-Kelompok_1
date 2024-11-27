/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Project;
import javax.swing.SwingUtilities;

/**
 * UAS PEMROGRAMAN BERORIENTASI OBJEK
 * 3B INFORMATIKA - KELOMPOK 1
 * @author Adi Pratama Putra
 */


// DEKLARASI KELAS UTAMA (MAIN) YANG MENJADI TITIK AWAL (ENTRY POINT) EKSEKUSI PROGRAM
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PageRegistration().setVisible(true);
        });
    }
}

/**
 * UAS PEMROGRAMAN BERORIENTASI OBJEK
 * 3B INFORMATIKA - KELOMPOK 1
 * @author Adi Pratama Putra
 */