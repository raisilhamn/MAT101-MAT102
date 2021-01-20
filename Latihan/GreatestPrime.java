/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaslawas;
import java.util.Scanner;

/**
 *
 * @author rais
 */
public class GreatestPrime {
    public static void main(String[] args){
        
    
    System.out.print("Input bilangan untuk di cek : ");
        Scanner bilangan = new Scanner(System.in);
        int inputBilangan = bilangan.nextInt();
        int i, faktor, primaTerbesar, j, sisaBagi;
        primaTerbesar = 69;
        boolean prima;
        prima = false;
        faktor = 0;
        for (j = 1; j <= inputBilangan; j++){
            for (i = 1; i <= j ; i++){
                sisaBagi = j % i;
                if  ( sisaBagi == 0){
                    faktor = faktor + 1;
                    
                }
            }
            if (faktor == 2){
                    primaTerbesar = j;
                    prima = true;
                }
            faktor = 0;
        }
        if (prima == true){
            System.out.println(primaTerbesar);
        }
        System.out.println(prima);
    }
}
    

