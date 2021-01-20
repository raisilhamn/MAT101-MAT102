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
public class BubleShort {
    public static void main(String[] args){

        int n = 1;
        int sementara =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan panjang array yang ingin di urutkan : ");
        int panjangArray = input.nextInt();
        int[] bilangan = new int[panjangArray];
        
        for ( int i = 0; i < panjangArray; i++){
            System.out.print("Masukan array indeks ke " + i+" ");
            bilangan[i] = input.nextInt();
        }
            
        System.out.println();
        System.out.print("Array sebelum diurutkan dengan algoritma bubble short : ");
        for (int i = 0; i < panjangArray; i++)
            System.out.print(bilangan[i] + " ");
        
        for (int a = 0; a < panjangArray; a++){
            for ( int j = 0; j < (panjangArray - n) ; j++){
//                try {
                if ( bilangan[j] < bilangan[j+1]){
                    sementara = bilangan[j];
                    bilangan[j] = bilangan[j+1];
                    bilangan[j+1] = sementara;
                    
                }
//                }
//                catch (Exception e) {
//                    System.out.println();
//                    System.out.println("Error di kondisional");
//                }
                
            }
            n += 1;
        }
        System.out.println();
        System.out.print("Array Setelah diurutkan dengan algoritma bubble short : ");
        for (int i = 0; i < panjangArray; i++)
            System.out.print(bilangan[i] + " ");
        
    }
}
