/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg082011633090;
import java.util.*;

/**
 *
 * @author rais
 */
public class isPrimedanGreatestPrime {
    boolean prima = false;
    public static boolean isPrime(int bilangan){
        int faktor = 0;
        boolean prima = false;
        for (int i = 1; i<= bilangan; i++){
            int sisaBagi = bilangan % i;
            if (sisaBagi == 0)
                faktor += 1;
        }
        if (faktor == 2)
                prima = true;
       
        return prima;
   }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Bilangan yang hendak di input ");
        int inputBilangan = input.nextInt();
        int terbesar;
        terbesar = GreatestPrime(inputBilangan);
        System.out.print("Bilangan Prima terbesar adalah : ");
        System.out.println(terbesar);
//        boolean apakahPrime = isPrime(inputBilangan);
//        System.out.println(apakahPrime);
        
    }
    
    
    public static int GreatestPrime(int n){
        
        int primaTerbesar = 0;
        for (int bilangan = 1; bilangan <= n; bilangan++){
            boolean bilPrima = isPrime(bilangan); 
            if ( bilPrima  == true ){
                primaTerbesar = bilangan;
            }
        }
        
        return primaTerbesar;    
    }
    
    
}