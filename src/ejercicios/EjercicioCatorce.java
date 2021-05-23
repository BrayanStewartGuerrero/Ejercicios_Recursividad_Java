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
public class EjercicioCatorce {
    /**
     * Escribir un método recursivo que tome un vector de elementos enteros y 
     * devuelva true si el vector está ordenado ascendentemente o false en caso contrario
     */
    
    public boolean estaOrdenado(int[] array, int n){
        if (n < array.length-1 && array[n] < array[n + 1]) {
            estaOrdenado(array, n + 1);
            return true;
        } 
        else return false;
    }
    
    public static void main(String[] args) {
        EjercicioCatorce e = new EjercicioCatorce();
        int[] array = {1,2,5,4};
        System.out.println("¿Esta ordenado el array?: "+e.estaOrdenado(array, 0));
    }
}
