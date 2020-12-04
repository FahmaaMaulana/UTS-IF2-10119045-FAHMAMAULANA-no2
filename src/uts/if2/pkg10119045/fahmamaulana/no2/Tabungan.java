/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119045.fahmamaulana.no2;

/**
 *
 * @author Legion
 * NAMA     : Fahma Maulana
 * KELAS    : IF2
 * NIM      : 10119045
 * Deskripsi: UTS
 */
public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah) {
        return saldo - jumlah;
    }
}
