package pkg082011633090;
import java.util.Scanner;

public class TinggiMaksimum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Masukan V0: ");
        Scanner input = new Scanner(System.in);
         int Vo = input.nextInt();
         int Hmaks;
         int g = 10;
         Hmaks =(Vo*Vo)/2*g;
         System.out.println("Hmaks = " + Hmaks);
        
    }
    
    
}
