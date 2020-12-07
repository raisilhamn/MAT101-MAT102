package Latihan;
import java.util.Scanner;
/**
 *
 * @author rais
 */
public class KustomFibo {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Berapa banyak bilangan fibbonacci yang dihitung : ");
        int panjangFibo = input.nextInt();
        int[] deretFibo = new int[panjangFibo];
        
        System.out.print("Masukan bilangan pertama : ");
        int pertama = input.nextInt();
        
        System.out.print("Masukan bilangan kedua : ");
        int kedua = input.nextInt();
        
        System.out.print("Masukan kelipatan x : ");
        int x = input.nextInt();    
        
        System.out.print("Masukan bilangan pengurang y : ");    
        int y = input.nextInt();

        for (int i = 0; i < deretFibo.length; i++){
            if ( i == 0 ){
                deretFibo[0] = pertama;
                continue;
            }
            if ( i == 1 ){
                deretFibo[1] = kedua;
                continue;
            }
            int a = i + 1;
            if ( a % x == 0 ){
                deretFibo[i] = deretFibo[i - 2] + deretFibo[i - 1] - y;
            }
            else{
                deretFibo[i] = deretFibo[i - 2]+ deretFibo[i - 1];
            }
        }
        
        System.out.print("Deret fibonaccinya adalah : ");
        for ( int k = 0; k < deretFibo.length ; k++)
            System.out.print(deretFibo[k] + " " );
        System.out.println("");
    }
}
