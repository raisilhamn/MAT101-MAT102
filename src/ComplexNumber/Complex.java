/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComplexNumber;
//import java.lang.*;

/**
 *
 * @author rais
 */
public class Complex {
    private double real;       // komponen real
    private double imaj;       // komponen imajiner
    public String complex;
    
    public Complex(double real, double imaj){
        this.real=real;
        this.imaj=imaj;
        
    }
    
    
    /*
     * menampilkan bilangan complex dalam format    
     *   real + imaj i misalkan : 3.2 + 5.6i
     */
    public void display(){
//        Complex a = new Complex(real, imaj);
//        this.real=real;
//        this.imaj=imaj;
        if (imaj == 0)
            complex = real + "";
        if (real == 0) 
            complex= imaj + "i";
        else
            complex = real + " + " + imaj + "i";
        
        System.out.println(this.complex);
        
    }
    
    
    /*
     * 
     * @return nilai argument dari c
     */
    public double arg(){
       double args = Math.atan(this.imaj/this.real);
       return args;
    }
    
    
    /*
     * menambahkan dua bilangan complex
     * @param x bilangan complex
     * @return 
     */
    public Complex add(Complex b){
        
        double real = this.real + b.real;
        double imag = this.imaj + b.imaj;
        return new Complex(real, imag);
        
    }
    
    
    /*
     * mengurangkan dua bilangan complex
     * @param x bilangan complex
     * @return 
     */
    
    public Complex subst(Complex b){
        double real = this.real - b.real;
        double imag = this.imaj - b.imaj;
        return new Complex(real, imag);
    }
    
    
    /*
     * mengalikan dua bilangan complex
     * @param x bilangan complex
     * @return 
     */
    public Complex multiply(Complex b){
//        Complex a = this;
        double real = this.real * b.real - this.imaj * b.imaj;
        double imag = this.real * b.imaj + this.imaj * b.real;
        return new Complex(real, imag);
    }
    
    
    /*
     * membagi dua bilangan complex
     * @param x bilangan complex
     * @return 
     * TODO: Devide belum beres
     */
    public Complex devide(Complex x){
//        double a, b;
        double a = (this.real*x.real + this.imaj + x.imaj)/(x.real*x.real + x.imaj*x.imaj);
        double b = (x.real*this.imaj - this.real*x.imaj)/(x.real*x.real + x.imaj*x.imaj);
//        Complex c = new Complex (a,b);
        return new Complex(a, b);
    }

    
    /*
     * setting komponen bilangan real 
     * @param real komponen bilangan real
     */
    public void setReal(double real){
        this.real = real;
        
    }
    
    
    /*
     * setting komponen bilangan imajiner
     * @param real komponen bilangan imajiner
     */
    public void setImaj(double imaj){
        this.imaj = imaj;
    }
    
    /*
     * mengambil nilai real dari bilangan complex
     * @return komponen real
     */
    public double getReal(){
        double nilaireal = real;
        return nilaireal ;
    }
    
    
    /*
     * mengambil nilai imajiner dari bilangan complex
     * @return komponen imajiner
     */
    public double getImaj(){
         double nilaiimaji = imaj;
         return nilaiimaji;
        
    }

}
