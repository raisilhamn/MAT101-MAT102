/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaslawas;
import java.util.*;
/**
 *
 * @author rais
 */
public class Percabangan2 {
    public static void main(String[] args){
        System.out.print("Masukan jumlah barang : ");
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        double harga = 0;
        int hargaNormal = 50000;
        double diskon;
        
        if (jumlah == 1){
            harga = hargaNormal*jumlah;
        
        }
        else if (jumlah >= 2 && jumlah <= 10){
            diskon = 0.95;
            harga = hargaNormal*jumlah*diskon;
        }
        else if (jumlah >= 11 && jumlah <= 20){
            diskon = 0.93;
            harga = hargaNormal*jumlah*diskon;
        }
        else if (jumlah >= 21){
            diskon = 0.90;
            harga = hargaNormal*jumlah*diskon;
        }
        int a = (int) Math.round(harga);
        System.out.println(a);
    }
}
