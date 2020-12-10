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
//Nilai tebesar tiga bilangan
public class TigaNilaiTerbesar {
        public static void main(String[] args) {
            System.out.print("Masukan Angka Untuk a: ");
            Scanner input1 = new Scanner(System.in);
            int a = input1.nextInt();
            System.out.print("Masukan Angka Untuk b: ");
            Scanner input2 = new Scanner(System.in);
            int b = input2.nextInt();
            System.out.print("Masukan Angka Untuk c: ");
            Scanner input3 = new Scanner(System.in);
            int c = input3.nextInt();
            int max;
            max = a;
            if (a < b){
                max = b;
                if (b < c){
                    max = c;
                    System.out.println("Nilai Maksimum: "+ c);
                }else{
                    System.out.println("Nilai Maksimum: "+ b);
                }
            }else{
                System.out.println("Nilai Maksimum: "+ a);
            }
        }
    }
