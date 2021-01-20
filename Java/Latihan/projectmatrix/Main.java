
package projectmatrix;


public class Main {

    
    public static void main(String[] args) {
        Matrix x, y, c, d, e, f;
        double p;
        Matrix k = new Matrix(2,2);
        d = new Matrix(2,2);
        e = new Matrix(2,2);
        c = new Matrix(2,2);
        x = new Matrix(2,2);
        y = new Matrix(2,2);
        k = new Matrix(2,2);
        f = new Matrix(3,3, 5);
        
        
        
        x.setElement(0,0 , 5);
        x.setElement(0,1 , 1);
        x.setElement(1,0 , 2);
        x.setElement(1,1 , 3);

        y.setElement(0,0 , 1);
        y.setElement(0,1 , 2);
        y.setElement(1,0 , 0);
        y.setElement(1,1 , 3);
        
        System.out.println("Matriks x :");
        x.display();
        System.out.println();
        
        System.out.println("Matriks y :");
        y.display();
        
        c.add(x, y);
        System.out.println();
        

        System.out.println("Matriks c (matrix x ditambah matrix y )");
        c.display();
        
        System.out.println();
        d.subst(x, y);
        System.out.println("Matriks d (matrix x dikurang matrix y ) ");
        d.display();
        
        
        System.out.println();
        e.transp(x);
        System.out.println("Matriks e (Transpose matrix x) ");
        e.display();
        
        
        System.out.println();
        p = x.determinant();
        System.out.println("Determinan matrix x (matrix 2x2) "+ p);
        System.out.println();
        
       
        
        
        System.out.println("Matrix 3x3 :");
        f.display();
        
        System.out.println();
        p = f.determinant();
        System.out.println("Determinan matrix (matrix 3x3) =  " + p);
        
        
        System.out.println();
        System.out.println("Hasil perkalian matrix x dan y :");
        k.multiply(x, y);
        k.display();
        
        

    }
        
    
}
