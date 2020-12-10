package Latihan;
import java.util.*;

public class DataArrayKembar {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] data = new int[10];
        
        for ( int i = 0; i <= 9; i++){
            System.out.print("input data indeks ke " + i+" : ");
            data[i] = input.nextInt();
        }
        System.out.println();
        System.out.println("Data yang kembar adalah : ");
        for (int i=0; i< data.length ; i++){
            for( int j = i + 1; j< data.length; j++){
                if (data[i] == data[j] && (i != j)){
                     System.out.print(data[j] + " ");  
                }
            }
        }  
    }
    
}
