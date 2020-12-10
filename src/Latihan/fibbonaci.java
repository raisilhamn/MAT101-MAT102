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
public class fibbonaci {
    public static void main(String[] args){
        
        
        System.out.print("Masukan bilangan pertama : ");
        Scanner input1 = new Scanner(System.in);
        int bilangan1 = input1.nextInt();
        System.out.print("Masukan bilangan kedua: ");
        Scanner input2 = new Scanner(System.in);
        int bilangan2 = input2.nextInt();
        System.out.print("Fibonacci ke : ");
        Scanner input3 = new Scanner(System.in);
        int fibonacciKe = input3.nextInt();
        
        int i, fibonacci, fibonacciKeA;
        fibonacci = 0;
        if(fibonacciKe == 1){
           fibonacci = bilangan1;
           System.out.println("Bilangan fibonacci ke 1"+" adalah "+fibonacci);
        }else if(fibonacciKe == 2){
           fibonacci = bilangan2;
           System.out.println("Bilangan fibonacci ke 2"+" adalah "+fibonacci); 
        }else if (fibonacciKe > 2){
            for(i = 3; i <= fibonacciKe; i++){
            fibonacci = bilangan1 + bilangan2;
            bilangan1 = bilangan2;
            bilangan2 = fibonacci;

            }
            System.out.println("Bilangan fibonacci ke "+fibonacciKe+" adalah "+fibonacci);

        }

        
        
        
    }
    
}
