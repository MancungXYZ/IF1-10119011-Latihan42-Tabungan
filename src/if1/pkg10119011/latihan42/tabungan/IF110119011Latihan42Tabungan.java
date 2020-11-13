    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang=====");
        System.out.print("Masukan Saldo Awal\t: Rp ");
        Tabungan tb = new Tabungan(sc.nextInt());
        
        System.out.print("Jumlah uang yang di diambil\t: Rp ");
        System.out.println("Saldo anda sekarang\t: Rp " + tb.ambilUang(sc.nextInt()));
        
    }
    
}
