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
public class TugasLawas {

    /**
     * @param args the command line arguments
     * 
     */
    // Membalik angka
    public static void main(String[] args) {
        System.out.print("Masukan Angka: ");
        Scanner input = new Scanner(System.in);
        int bilangan = input.nextInt();
        int digit, balikBilangan = 0;
        while (bilangan != 0){
            digit = bilangan % 10;
            balikBilangan = 10 * balikBilangan + digit;
            bilangan = bilangan / 10;
            
            
        }
        System.out.println("Hasil Balikan: "+balikBilangan);
        
    }
    
}
