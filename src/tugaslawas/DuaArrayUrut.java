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
public class DuaArrayUrut {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        int[] x = new int[5];
        int[] y = new int[5];
        int[] z = new int[10];
        
        for (int i = 0; i< x.length; i++){
            System.out.print("Masukan x indeks ke " + i+ " ");
            x[i] = input.nextInt();
        }
            
        
        for (int i = 0; i< x.length; i++){
            System.out.print("Masukan y indeks ke " + i + " ");
            y[i] = input.nextInt();
        }
        
        int i = 0;
        int j = 0;
        int k = 0;
        while ( i < x.length && j < y.length){
            if (x[i] < y[j]){
                z[k] = x[i];
                i++;
                k++;
            }
            else{
                z[k] = y[j];
                j++;
                k++;
            }
        }
        while (i < x.length)
        {
            z[k] = x[i];
            i++;
            k++;
        } 
                 
        while (j < y.length) 
        {
            z[k] = y[j];
            j++;
            k++;
        } 
        
//        try {
//            int posisi = 0;
//            int a =0;
//            int b =0;
//            while( posisi < z.length + 1 ){
//                if ( x[a] > y[b]){
//                    z[posisi] = y[b];
//                    b +=1;
//                    System.out.println("Posisi di b" + b + " posisi pointer "+ posisi);
//                    posisi += 1;
//                }
//                else {
//                    z[posisi] = x[a];
//                    a +=1;
//                    System.out.println("Posisi di a" + a + " posisi pointer "+ posisi) ;
//                posisi += 1;
//                }
//                
//                posisi +=1;
//
//            }
//        }
//        catch(Exception e) {
//            System.out.println("Error bro");
//        }
        
        
        System.out.println();
        System.out.print("Array z nya adalah : ");
        for (int a = 0; a < z.length; a++){
            System.out.print(z[a]+ " ");
        }
            
        
    }
}
