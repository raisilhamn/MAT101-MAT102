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
public class IntegerToBinary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input bilangan yang hendak di konversi ke biner : ");
        int bilangan = input.nextInt();
        
        
        System.out.print("Versi 1 : ");
        intToDecV1(bilangan);
        System.out.println();
        
        System.out.print("Versi 2 : ");
        int bilbiner = intToDecV2(bilangan);
        System.out.println(bilbiner);

//        int pangkat = 1;
//        System.out.println(angka);
//        while (pangkat <= bilangan/2 )
//            pangkat *= 2;
//        
//        while ( pangkat > 0 ){
//            if ( bilangan < pangkat )
//                System.out.print("0");
//            else{
//                System.out.print("1");
//                bilangan -= pangkat;
//               
//            }
//             pangkat /= 2;     
//        }
//        
//        
//        System.out.println();
       
    }
     public static void intToDecV1( int n ){
        int biner[] = new int[n];
        int index = 0;
        while(n > 0){
            biner[index] = n%2;
            index += 1;
            n /= 2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(biner[i]);
        }
    }
     
     
     
    public static int intToDecV2( int n ){
      int biner[] = new int[n];    
        int index = 0;   
        
        while(n > 0){    
        biner[index] = n%2; 
        index = index+1;
        n = n/2;    
        }  
        
        int pengali=1;
        int angka=0;
        for(int i = index-1;i >= 0;i--){    
        
        pengali =1;
            for (int j = i;j>0;j--){
                pengali = pengali *10;
            }
        angka =angka + (biner[i]*pengali);          
     }  
     return angka;
    }
}

