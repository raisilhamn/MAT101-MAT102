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
public class ModusArray2d {
    
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);        
            int arr[][] =new int[3][3];
            int kemunculan[] = new int [10];
            int modusArray2d;
    //        System.out.println(kemunculan[1]);

            for (int j = 0; j<3; j++){
                for(int i = 0 ; i<3 ;i++){
                    System.out.print("Input array indeks (" +j+","+i+") : ");
                    arr[j][i]=input.nextInt();

                }
            }

            for (int k = 0; k <= 9; k++){
                for (int a = 0; a<=2; a++){
                    for(int b = 0 ; b<=2 ;b++){
                        if ( k == arr[a][b]){
                            kemunculan[k] = kemunculan[k] + 1;
                        }
                    }
                }
            }
            
            System.out.println();
            modusArray2d = kemunculan[0];
            for (int p = 1; p <= 9; p++){
    //            System.out.println(kemunculan[p-1]);
                if ( modusArray2d < kemunculan[p]){
                    modusArray2d = p;
                    
                    
                }
                else{
                    modusArray2d = 0;
                }
                
                
                
            }
            
            
            
            
            System.out.println("");
            System.out.println("");

            for (int o = 0; o < 3; o++){
                System.out.print(arr[0][o]+ " ");
            }
            
            System.out.println("");
            for (int o = 0; o < 3; o++){
                System.out.print(arr[1][o]+ " ");
            }
            
            System.out.println("");
            for (int o = 0; o < 3; o++){
                System.out.print(arr[2][o]+ " ");
            }

            System.out.println("");
            System.out.println("");

            System.out.println("Modus matriks 2d: "+modusArray2d);






        }
}
