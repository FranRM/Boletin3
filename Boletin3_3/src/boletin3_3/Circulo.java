/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_3;

/**
 *
 * @author femio23
 */
public class Circulo {
    double radio;
    static double pi=3.14d;
    
    public Circulo(){
    radio=0;
    }
    public Circulo(double r){
    radio=r;
    }
    public double getCirculo(){
        return radio;
    }
    public void setCirculo(double r){
        radio=r;
    }
    public double calcarea(){
    return (pi*Math.pow(radio, radio));
    }
    public double calccir(){
    return (pi*radio*2);
    }
}
