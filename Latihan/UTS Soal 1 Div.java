/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.util.Scanner;


/**
 *
 * @author rais
 */
public class div {
    public static void main(String[] args){
        
        Scanner inputA = new Scanner(System.in);
        Scanner inputB = new Scanner(System.in);
        System.out.print("Masukan Nilai pembilang: ");
        int a = inputA.nextInt();
        System.out.print("Masukan Nilai penyebut: ");
        int b = inputB.nextInt();
        int hasilBagi = 0;
        if (a > b){
        while ( a - b >= 0 ){
            a = a - b;
            hasilBagi = hasilBagi - (-1);
            }

        System.out.println("Hasil div adalah: "+hasilBagi);
        }else{
            System.out.println("Tidak sesuai syarat");
        }
        
        
        
        
    }
    
}
