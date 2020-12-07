package ComplexNumber;

/**
 *
 * @author rais
 */
public class Desember2020 {


    public static void main(String[] args) {
         
        Complex a,b;
        a = new Complex(1.0, 2.0);
        b = new Complex(3.0, -1.0);
        System.out.println("Awal");
        a.display();
        b.display();
        System.out.println();
        System.out.println("nilai arg a : "+a.arg());
        
        System.out.println();
        Complex c;
        c = a.add(b);
        System.out.println("Tambah Imajiner");
        c.display();
        System.out.println();
        
        c = a.subst(b);
        System.out.println("Kurang Imajiner");
        c.display();
        System.out.println();
//        
        c = a.multiply(b);
        System.out.println("Kali Imajiner");
        c.display();
        System.out.println();
        
        System.out.println("Pembagian a dibagi b");
        c = a.devide(b);
        c.display();
        
        System.out.println();
        
        a.setReal(-2.5);
        a.setImaj(3.1);
        System.out.println("Setelah di set ");
        a.display();
        
        System.out.println();
        System.out.println("komponen real baru  = "+a.getReal());
        System.out.println("komponen imaj baru = "+a.getImaj());
        
        
    }

    
    
}
