/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.util.*;
/**
 *
 * @author rais
 */
public class Percabangan1 {
    public static void main(String[] args){
        System.out.print("Masukan suhu: ");
        Scanner input = new Scanner(System.in);
        int suhu = input.nextInt();
        
        if ( suhu < 20 ){
            System.out.println("DINGIN");
        }else if ( suhu > 20 && suhu <=28 ){
            System.out.println("SEJUK");
        }else if ( suhu > 28){
            System.out.println("PANAS");
        }
    }
    
}
