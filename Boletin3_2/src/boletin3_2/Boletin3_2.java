/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_2;
import java.util.Scanner;
/**
 *
 * @author femio23
 */
public class Boletin3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    System.out.println("Vai a lanzar un novo satelite,introduza os seguintes datos:");
    System.out.println("Meridiano:");
    double m=sc.nextDouble();
    System.out.println("Paralelo:");
    double p=sc.nextDouble();
    System.out.println("Distacia:");
    double d=sc.nextDouble();
    Satelite meteosat=new Satelite(m,p,d);
    meteosat.verPosicion();    }
    
}
