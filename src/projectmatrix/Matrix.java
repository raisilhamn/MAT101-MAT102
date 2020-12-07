
package projectmatrix;
import java.util.*;

public class Matrix {
    private final int row;
    private final int col;
    private double[][] data;
    /*
     * Constructor 
     * @param row jumlah baris
     * @param col jumlah kolom
     * setting semua eleman dengan nilai 0.0
     */
    public Matrix( int row, int col){
        this.row = row;
        this.col = col;
        this.data = new double[this.row][this.col];  
        for(int i=0; i<this.row; i++)
            for(int j=0; j<this.col; j++)
                this.data[i][j] = 0.0;
    }
    
    
    /*
     * Contructor kedua ( Contructor overloading )
     * @param row jumlah baris
     * @param col jumlah kolom
     * @param maxRandom seting elemen secara random dengan nilai max 
     */
    public Matrix( int row, int col, int maxRandom){
        this.row = row;
        this.col = col;
        this.data = new double[this.row][this.col];  
        for(int i=0; i<this.row; i++)
            for(int j=0; j<this.col; j++)
                this.data[i][j] = Math.random()*maxRandom;
    }
    
    
    /*
     * Menampilkan semua elemen matriks di layar
     */
    public void display(){
        for(int i=0; i<this.row; i++){
            for(int j=0; j<this.col; j++){
                String str = String.format("%.02f", this.data[i][j]);
                System.out.print(str+"  ");
            }
            System.out.println();
        }
    }
    
    
    /*
     * memasukkan data ke dalam matriks
     * pada baris ke row dan kolom ke col
     * @param row baris
     * @param col kolom
     * @param data data yang akan dimasukkan ke dalam matriks
     * 
     */
    public void setElement(int xrow, int xcol, double masuk){
        try{
            this.data[xrow][xcol] = masuk;
        }
        catch(Exception e){
            System.out.println("Error indeks melebihi");
        }
    }
    
    
    /*
     * mengambil data dari matriks
     * pada baris ke row dan kolom ke col
     * 
     * @param row baris
     * @param col kolom
     
     * @return nilai data pada baris ke row dan kolom ke col
     */
    
    public double getElement(int xrow, int xcol){
        double nilai = 0;
        try{
            nilai = this.data[xrow][xcol];
        }
        catch(Exception e){
            System.out.println("Error indeks melebihi");
        }
        
         return nilai;
    }
    
    
    /*
     * menambah dua matriks a dan b dengan ukuran yang sama
     * harap dicek baris dan kolom
     * @param a matriks pertama
     * @param b matriks kedua
     * @return matriks hasil jumlahan
     */
    
    public Matrix add(Matrix a, Matrix b){
        Matrix z;
        z = new Matrix(this.row,this.col);
        
        for(int i=0; i<this.row; i++){
            for(int j=0; j<this.col; j++){
                this.data[i][j]=a.getElement(i,j)+b.getElement(i,j);
            }
        }
        return z;
    }
    
    /*
     * megurangkan dua matriks a dan b dengan ukuran yang sama
     * harap dicek baris dan kolom
     * @param a matriks pertama
     * @param b matriks kedua
     * @return matriks hasil pengurangan
     */
    public Matrix subst(Matrix a, Matrix b){
        Matrix z;
        z = new Matrix(this.row,this.col);
        for(int i=0; i<this.row; i++){
            for(int j=0; j<this.col; j++){
                this.data[i][j]=a.getElement(i,j) - b.getElement(i,j);
            }
        }
        return z;
    } 
    
    
    /*
     * menentukan matriks transpose dari matriks a
     * @param a matriks yang akan ditranspose (tidak berubah)
     * @return hasil matriks traspose
     */
    
    public Matrix transp(Matrix a){
        Matrix z;
        z = new Matrix(this.row,this.col);
        for(int i=0; i<this.row; i++){
            for(int j=0; j<this.col; j++){
                this.data[i][j]=a.getElement(j, i);
            }
        }
        return z;
    }
    
    
 
    public double determinant(){ 
        double d=0;
        if (this.row==2){
             
            d = (getElement(0,0)*getElement(1,1))-(getElement(0,1)*getElement(1,0));
            
        }   
        else if (this.row==3){
            
            d = (getElement(0,0)*getElement(1,1)*getElement(2,2))+(getElement(0,1)*getElement(1,2)*getElement(2,0))+(getElement(0,2)*getElement(1,0)*getElement(2,1))-(getElement(2,0)*getElement(1,1)*getElement(0,2))-(getElement(2,1)*getElement(1,2)*getElement(0,0))-(getElement(2,2)*getElement(1,0)*getElement(0,1));
            
        }
        return d;
    }
    
    public Matrix multiply(Matrix a, Matrix b){
        
        Matrix z;
        z = new Matrix(this.row,this.col);
        this.data[0][0] = a.getElement(0, 0)*b.getElement(0, 0)+a.getElement(0, 1)*b.getElement(1, 0);
        this.data[0][1] = a.getElement(0, 0)*b.getElement(0, 1)+a.getElement(0, 1)*b.getElement(1, 1);
        this.data[1][0] = a.getElement(1, 0)*b.getElement(0, 0)+a.getElement(1, 1)*b.getElement(1, 0);
        this.data[1][1] = a.getElement(1, 1)*b.getElement(0, 1)+a.getElement(1, 1)*b.getElement(1, 1);
        return z;
        
    }
    
    
}
