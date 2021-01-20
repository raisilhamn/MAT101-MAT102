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
public class mencariModus {
    public static void main(String[] args){
         System.out.println("SOAL NOMOR 1");
         Scanner input = new Scanner(System.in);
        int n;
        int[] x;
        //x untuk array vektor
        int[] y;
        //y untuk array banyaknya bilangan
        int i;
        int j;
        int max;
        int banyak;

        System.out.println("Masukkan banyaknya bilangan di array");
        n = input.nextInt();
        x = new int[n];
        y = new int[n];

        for (i=0; i<n; i++){
            System.out.print("Data ke-"+(i+1)+": ");
            x[i] = input.nextInt();
            y[i] = 1;
            //array y selalu 1 karena jumlah angka yang ada pasti >=1
        }
        for (i=0; i<n-1; i++){
            for (j=0; j<n;j++){
                if (x[i]==x[j]) {
                    y[i] = y[i] + 1;
                }
            }
        }
         max = 0;
         banyak = 0;
        for (i=0; i<n;i++){
            if (y[i]>max){
                max = x[i];
                banyak = y[i]-1;
            }
        }
        System.out.println("Bilangan yang paling sering muncul adalah "+max);
        System.out.println("Muncul sebanyak "+banyak+ " kali");
    }
}
