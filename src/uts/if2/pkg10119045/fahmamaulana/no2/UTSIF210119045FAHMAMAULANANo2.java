/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119045.fahmamaulana.no2;
import java.util.Scanner;
/**
 *
 * @author Legion
 * NAMA     : Fahma Maulana
 * KELAS    : IF2
 * NIM      : 10119045
 * Deskripsi: UTS
 */
public class UTSIF210119045FAHMAMAULANANo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int saldoAwal,jumlahUang;
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
            saldoAwal = scanner.nextInt();
            Tabungan tabungan = new Tabungan(saldoAwal);
        System.out.print("Jumlah uang yang diambil : ");
            jumlahUang = scanner.nextInt();
        System.out.println("Saldo anda sekarang : " + tabungan.ambilUang(jumlahUang));
    }
    
}
