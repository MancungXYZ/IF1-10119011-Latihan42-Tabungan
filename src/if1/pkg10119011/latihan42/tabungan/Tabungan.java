/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan42.tabungan;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1 
 *  Nim     : 10119011
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan (int saldo) {
        this.saldo = saldo;
    }
    
    public int ambilUang (int jumlah) {
        return saldo-jumlah;
    }
}
