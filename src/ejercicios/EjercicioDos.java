/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

/**
 * 
 * @author Brayan Guerrero
 */
public class EjercicioDos {
    //Escriba un algoritmo recursivo que calcule el cociente entero de dos números enteros positivos a y b por medio de restas sucesivas.
    
    public int cociente(int a, int b){
        if(a < b) return(0); 
        else return 1 + cociente(a-b,b);
    }
    
    public static void main(String[] args) {
        EjercicioDos two = new EjercicioDos();
        System.out.println("El cociente es: "+two.cociente(7, 2));
    }
}
