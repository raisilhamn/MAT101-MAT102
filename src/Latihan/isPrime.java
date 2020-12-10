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
public class isPrime {
    public static void main(String[] args){
        System.out.print("Input bilangan untuk di cek : ");
        Scanner bilangan = new Scanner(System.in);
        int inputBilangan = bilangan.nextInt();
        int i, faktor;
        faktor = 0;
        for (i = 1; i <= inputBilangan; i++){
            if  (inputBilangan % i == 0){
                faktor = faktor + 1;
            }
                
            
        }
        if (faktor == 2){
            System.out.println(inputBilangan+" Adalah bilangan prima");
            
        }else{
            System.out.println(inputBilangan+" bukan bilangan prima");
            
        }
        
        
        
    }
    
}
