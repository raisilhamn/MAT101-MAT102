/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaslawas;
import java.util.*;
/**This program prints the greatest common divisor of its two command-line 
 * arguments, using a recursive implementation of Euclid’s algorithm.
 *
 * @author rais
 */
public class AlgoritmaEuclid_FPB_KPK {
    public static int fpb( int m, int n){
        if (n == 0) 
            return m;
        return fpb(n, m % n);
    }
    public static int kpk ( int m, int n){
        int kpk = (m * n )/ fpb(m, n);
        return kpk;
    }
    public static int gcd(int n1, int n2) {
        int gcd = 1; // Initial
        int k = 2; // Possible
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // Update gcd
            k++;
        }
        return gcd; // Return gcd
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai M: ");
        int m = input.nextInt();
        
        System.out.print("Masukan nilai N: ");
        int n = input.nextInt();
        
        int nilaiFPB = fpb(m, n);
        System.out.println("FPB adalah : "+ nilaiFPB);
        
        int nilaiKPK = kpk(m, n);
        System.out.println("KPK adalah : "+ nilaiKPK);
        
        System.out.println("The greatest common divisor for " + n +
" and " + m + " is " + gcd(n, m) );

    }
    
}
