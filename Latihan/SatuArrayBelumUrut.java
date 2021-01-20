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
public class SatuArrayBelumUrut {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x[] = new int [11];
        int sementara;
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 5;
        x[4] = 7;
        x[5] = 9;
        x[6] = 11;
        x[7] = 12;
        x[8] = 13;
        System.out.print("Masukan array terakhir : ");
        x[9] = input.nextInt();
        System.out.println("Data sebelum urut : ");
        for (int i=0; i<=9; i++){
            System.out.print(x[i]+ " ");
        }
        System.out.println("");
        
        for(int k = 0 ; k<=9 ;k++){            
            for(int i = 0 ; i<=9 ;i++){
                   if (x[k]<x[i]){
                       sementara = x[k];
                       x[k] = x[i];
                       x[i] = sementara;
                   }
            }
        }
        System.out.println("");
        System.out.println("Data setelah urut : ");
        for (int i=0; i<=9; i++){
            System.out.print(x[i]+ " ");
        }
    }
    
}
