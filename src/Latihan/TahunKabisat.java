/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaslawas;
import java.util.*;
//import java.math.*;
/**
 *
 * @author rais
 */
public class TahunKabisat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka yang hendak di cek : ");
        int year = input.nextInt();
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        if ( isLeapYear == true )
            System.out.println(year + " adalah tahun kabisat");
        else 
            System.out.println(year+" bukan tahun kabisat");
          
    }
}
