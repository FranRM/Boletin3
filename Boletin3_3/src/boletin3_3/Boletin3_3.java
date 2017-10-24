/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_3;

import java.util.Scanner;

/**
 *
 * @author femio23
 */
public class Boletin3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.println("Vamos a facer calculos con circulos, polotanto, introduza "
              + "os datos para inicializalo");
      System.out.println("Radio: ");
      double r=sc.nextDouble();
      Circulo cir1=new Circulo(r);
      
      System.out.println("Para modificalo radio, introduza o seu novo valor");
      r=sc.nextDouble();
      cir1.setCirculo(r);
      cir1.getCirculo();
      System.out.println("A area do circulo é de "+cir1.calcarea());
        System.out.println("A circunferencia é de "+cir1.calccir());
    }
    
}
