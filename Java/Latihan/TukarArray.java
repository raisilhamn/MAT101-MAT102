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
public class TukarArray {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan panjang array yg ingin ditukar : ");
        int p = input.nextInt();
        
        int[] A = new int[p];
        int[] B = new int[p];
        
        
        for (int i = 0; i < A.length; i++ ){
            System.out.print("Masukan A indeks ke "+i+ " ");
            A[i] = input.nextInt();
        }
        
        for (int i = 0; i < B.length; i++ ){
            System.out.print("Masukan B indeks ke "+i+ " ");
            B[i] = input.nextInt();
        }
        
        int[] tukarA = new int[p];
//        int[] tukarB = new int[3];
        
        System.out.println("Sebelum ditukar");
        System.out.print("A :");
       for (int i = 0; i < A.length; i++ ){
            System.out.print(A[i]+ " ");
        }
        System.out.println();
        System.out.print("B :");
       for (int i = 0; i < B.length; i++ ){
            System.out.print(B[i]+ " ");
        }
       
        tukar(tukarA, A); 
        tukar(A, B);
        tukar(B, tukarA);
        
        System.out.println();
        System.out.println("Setelah ditukar");
        System.out.print("A :");
        for (int i = 0; i < A.length; i++ ){
            System.out.print(A[i]+ " ");
        }
       System.out.println();
       System.out.print("B :");
        for (int i = 0; i < B.length; i++ ){
            System.out.print(B[i]+ " ");
        }
    }
    public static void tukar(int[] n, int[] m){
           for (int i = 0; i < n.length; i++ ){
            n[i]  = m[i]  ;
           }
    }
     
     
     
     
}
