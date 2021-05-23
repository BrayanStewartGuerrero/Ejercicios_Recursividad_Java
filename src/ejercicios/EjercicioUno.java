/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

/**
 * 
 * @author Brayan Guerrero 1151983
 */
public class EjercicioUno {
    //Escriba un algoritmo recursivo que calcule el producto de dos números enteros positivos a y b por medio de sumas sucesivas.
    
    public int sumasSucesivas(int a, int b){
        if(b == 0){
            return(0);
        }
        else{
            a+= sumasSucesivas(a, b-1);
            return a;
        }
    }
    
    public static void main(String[] args) {
        EjercicioUno one  = new EjercicioUno();
        System.out.println("El resultado es: "+one.sumasSucesivas(2, 10));
    }
}

